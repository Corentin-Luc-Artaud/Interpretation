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
import static extension fr.unice.polytech.si5.smarthome.am.k3dsa.EventAspect.*
import static extension fr.unice.polytech.si5.smarthome.am.k3dsa.ActionAspect.*
import static extension fr.unice.polytech.si5.smarthome.am.k3dsa.ConditionAspect.*


import fr.unice.polytech.si5.smarthome.am.smart_home.Event
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod
import fr.unice.polytech.si5.smarthome.am.smart_home.Condition
import fr.unice.polytech.si5.smarthome.am.smart_home.Action

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
	
	@Step
	def public void happenNow(Home home) {
		println(""+_self.ownedTime.toSec()+" : "+_self.event.description())
		//check all confdition
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
}

@Aspect(className=Event)
class EventAspect {
	@ReplaceAspectMethod
	def String description() {
		return "" + _self.actor.name + " " + _self.action.name
	}
	

}

@Aspect(className=Condition)
class ConditionAspect {
	@Step
	def public void tryTrigger(Occurence occurence) {
		if(occurence.event == _self.event){
			//TODO trigger
			for (Action a: _self.actions) {
				a.trigger(occurence.ownedTime.toSec())
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

