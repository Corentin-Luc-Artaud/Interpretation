package fr.unice.polytech.si5.smarthome.am.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.unice.polytech.si5.smarthome.am.smart_home.Home
import fr.inria.diverse.k3.al.annotationprocessor.Main

import java.util.Queue
import java.util.LinkedList
import fr.unice.polytech.si5.smarthome.am.smart_home.Occurence
import fr.unice.polytech.si5.smarthome.am.smart_home.HomeTimeStamp

import fr.inria.diverse.k3.al.annotationprocessor.Step

import static extension fr.unice.polytech.si5.smarthome.am.k3dsa.OccurenceAspect.*
import static extension fr.unice.polytech.si5.smarthome.am.k3dsa.HomeTimeStampAspect.*
import static extension fr.unice.polytech.si5.smarthome.am.k3dsa.ActionAspect.*
import static extension fr.unice.polytech.si5.smarthome.am.k3dsa.ConditionAspect.*
import static extension fr.unice.polytech.si5.smarthome.am.k3dsa.SmartHomeAspect.*


import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod
import fr.unice.polytech.si5.smarthome.am.smart_home.Condition
import fr.unice.polytech.si5.smarthome.am.smart_home.Action
import fr.unice.polytech.si5.smarthome.am.smart_home.impl.HomeTimeStampImpl
import fr.unice.polytech.si5.smarthome.am.smart_home.impl.OccurenceImpl

/**
 * Sample aspect that gives java.io.File the ability to store Text content and save it to disk
 */
@Aspect(className=Home)
class SmartHomeAspect {	
	private Integer curtime
	private Queue<Occurence> pendingEvents;
	
	@Main
	public def void execute(){		
		_self.curtime = 0
		_self.pendingEvents = new LinkedList<Occurence>()
		_self.loop()
	}
	
	private def void loop() {
		var Integer curpos = 0;
		for (; _self.curtime < 24*60*60; _self.curtime = _self.curtime+1) {
			if (curpos < _self.ownedOccurences.length) {
				if (_self.ownedOccurences.get(curpos).ownedTime.toSec() == _self.curtime) {
					_self.pendingEvents.add(_self.ownedOccurences.get(curpos))
					curpos++
				}
			}
			_self.triggerAllPendingEvents()
		}
		_self.curtime = 0
		//_self.loop()
	}
	
	public def void addPendingEvent(Occurence occurence) {
		_self.pendingEvents.add(occurence)
	}
	
	@Step
	public def void addNewOccurenceOfAction(Action action, HomeTimeStamp timestamp) {
		val Occurence occurence = new OccurenceImpl()
		occurence.action = action
		occurence.ownedTime = timestamp.clone()
		_self.addPendingEvent(occurence);
	}
	
	private def void triggerAllPendingEvents() {
		while(! _self.pendingEvents.isEmpty()) {
			_self.pendingEvents.poll().happenNow(_self)
		}
	}
	
	def public Integer wichTime() {
		return _self.curtime
	}
}


@Aspect(className = Occurence)
class OccurenceAspect {
	
	def public void happenNow(Home home) {
		println(""+_self.ownedTime.toSec()+" : "+_self.action.name)
		//check all condition
		for (Condition condition: home.ownedConditions) {
			condition.tryTrigger(_self)
		}
		
	}
	
}

@Aspect(className=HomeTimeStamp)
class HomeTimeStampAspect {
	def public Integer toSec() {
		return _self.sec+_self.min*60+_self.hour*24*60
	}
	
	def public HomeTimeStamp clone() {
		val HomeTimeStamp timeStamp = new HomeTimeStampImpl();
		timeStamp.min = _self.min;
		timeStamp.sec = _self.sec;
		timeStamp.hour = _self.hour;
		return timeStamp;
	}
}

@Aspect(className=Condition)
class ConditionAspect {
	@Step
	def public void tryTrigger(Occurence occurence) {
		if(occurence.action == _self.action){
			//TODO : add condition with Actor & Time
			for (Action a: _self.actions) {
				a.trigger(occurence.ownedTime.toSec())
				(_self.eContainer() as Home).addNewOccurenceOfAction(a, occurence.ownedTime)
			}
		}
	}
}

@Aspect(className=Action)
class ActionAspect {
	@Step
	def public void trigger(Integer time) {
		println(""+time+" -> "+_self.name+" triggered")
	}
}

