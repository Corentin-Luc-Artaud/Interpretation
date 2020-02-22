package fr.unice.polytech.si5.smarthome.am.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.unice.polytech.si5.smarthome.am.smart_home.Home
import fr.inria.diverse.k3.al.annotationprocessor.Main

import java.util.Queue
import java.util.LinkedList
import fr.unice.polytech.si5.smarthome.am.smart_home.Occurence
import fr.unice.polytech.si5.smarthome.am.smart_home.HomeTimeStamp

import static extension fr.unice.polytech.si5.smarthome.am.k3dsa.OccurenceAspect.*
import static extension fr.unice.polytech.si5.smarthome.am.k3dsa.HomeTimeStampAspect.*
import static extension fr.unice.polytech.si5.smarthome.am.k3dsa.ActionAspect.*
import static extension fr.unice.polytech.si5.smarthome.am.k3dsa.AConditionAspect.*
import static extension fr.unice.polytech.si5.smarthome.am.k3dsa.HomeAspect.*


import fr.unice.polytech.si5.smarthome.am.smart_home.Condition
import fr.unice.polytech.si5.smarthome.am.smart_home.Action
import fr.unice.polytech.si5.smarthome.am.smart_home.Actor
import fr.unice.polytech.si5.smarthome.am.smart_home.ACondition
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.unice.polytech.si5.smarthome.am.smart_home.TimeEleapsedCondition
import fr.inria.diverse.k3.al.annotationprocessor.Step
import fr.unice.polytech.si5.smarthome.am.smart_home.Subject

/**
 * Sample aspect that gives java.io.File the ability to store Text content and save it to disk
 */
@Aspect(className=Home)
class HomeAspect {	
	Integer curtime = 0
    Queue<AbstractOccurence> pendingEvents = new LinkedList<AbstractOccurence>()
	
	@Main
	def void execute(){		
		_self.curtime = 0
		_self.pendingEvents
		_self.prepareOccurences()
		_self.loop()
	}
	
	private def void prepareOccurences() {
		for (Occurence occurence : _self.ownedOccurences) {
			var AbstractOccurence o = occurence.toAbstractOccurence()
			_self.pendingEvents.add(o)
		}
		_self.pendingEvents.sortBy[timestamp]
	}
	
	private def void loop() {
		for (; _self.curtime < 24*60*60; _self.curtime = _self.curtime+1) {
			_self.tick()
		}
		_self.curtime = 0
	}
	
	private def void tick() {
		while (_self.pendingEvents.peek() !== null && _self.pendingEvents.peek().timestamp == _self.curtime) {
			_self.pendingEvents.poll().happenNow(_self)
		}	
	}
	
	def void addPendingEvent(AbstractOccurence occurence) {
		_self.pendingEvents.add(occurence)
		_self.pendingEvents.sortBy[timestamp]		
	}
	
	@Step
	def void addNewOccurenceOfAction(Action action, Integer timestamp) {
		_self.initialTime = _self.curtime.toString()
		val AbstractOccurence occurence = new AbstractOccurence(timestamp, action, null)
		_self.addPendingEvent(occurence);
	}
	
}

@Aspect(className = Occurence)
class OccurenceAspect {
	
	def AbstractOccurence toAbstractOccurence() {
		return new AbstractOccurence(_self.ownedTime.toSec(), _self.action, _self.actor)
	}
	
}

class AbstractOccurence {
	public Integer timestamp
	public Actor actor
	public Action action
	
	new(Integer timestamp, Action action, Actor actor) {
		this.timestamp = timestamp
		this.action = action
		this.actor = actor
	}
	
	@Step
	def void happenNow(Home home) {
		println(""+this.timestamp+" : "+this.action.name)
		//check all condition
		for (ACondition condition: home.ownedConditions) {
			condition.tryTrigger(this)
		}
		
	}
	
	override String toString() {
		return "{ "+this.action+" "+this.timestamp+" "+" }"
	}
}

@Aspect(className=HomeTimeStamp)
class HomeTimeStampAspect {
	def Integer toSec() {
		return _self.sec+_self.min*60+_self.hour*60*60
	}
	
}

@Aspect(className=ACondition)
abstract class AConditionAspect {
	def abstract void tryTrigger(AbstractOccurence occurence)
}


@Aspect(className=Condition)
class ConditionAspect extends AConditionAspect{
	//@ReplaceAspectMethod
	@Step
	@OverrideAspectMethod
	def void tryTrigger(AbstractOccurence occurence) {
		if(occurence.action == _self.action){
			(_self.action.eContainer() as Subject).lastAction = occurence.action;
			for (Action a: _self.actions) {
				a.trigger(occurence.timestamp)
				(_self.eContainer() as Home).addNewOccurenceOfAction(a, occurence.timestamp)
			}
		}
	}
}

@Aspect(className=TimeEleapsedCondition)
class TimeConditionAspect extends AConditionAspect{
	//@ReplaceAspectMethod
	@OverrideAspectMethod
	def void tryTrigger(AbstractOccurence occurence) {
		if(occurence.action == _self.action){
			for (Action a: _self.actions) {
				a.trigger(occurence.timestamp)
				(_self.eContainer() as Home).addNewOccurenceOfAction(a, occurence.timestamp+_self.ownedTimestampEleapsed.toSec())
			}
		}
	}
}

@Aspect(className=Action)
class ActionAspect {
	@Step
	def void trigger(Integer time) {
		println(""+time+" -> "+_self.name+" triggered")
		(_self.eContainer() as Subject).lastAction= _self;
		println("lastAction " + (_self.eContainer() as Subject).name + "  = " + (_self.eContainer() as Subject).lastAction);
	}
}

