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
import static extension fr.unice.polytech.si5.smarthome.am.k3dsa.AConditionAspect.*
<<<<<<< HEAD
import static extension fr.unice.polytech.si5.smarthome.am.k3dsa.SmartHomeAspect.*
import static extension fr.unice.polytech.si5.smarthome.am.k3dsa.SubjectAspect.*
import static extension fr.unice.polytech.si5.smarthome.am.k3dsa.ABarrierAspect.*

=======
import static extension fr.unice.polytech.si5.smarthome.am.k3dsa.HomeAspect.*
>>>>>>> a1024b3d01b3bfd4f4eb14ac2bc5eef4627fa2d0


import fr.unice.polytech.si5.smarthome.am.smart_home.Condition
import fr.unice.polytech.si5.smarthome.am.smart_home.Action
import fr.unice.polytech.si5.smarthome.am.smart_home.Actor
import fr.unice.polytech.si5.smarthome.am.smart_home.ACondition
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.unice.polytech.si5.smarthome.am.smart_home.TimeEleapsedCondition
import fr.unice.polytech.si5.smarthome.am.smart_home.ComposeCondition
import fr.unice.polytech.si5.smarthome.am.smart_home.Barrier
import fr.unice.polytech.si5.smarthome.am.smart_home.ABarrier
import fr.unice.polytech.si5.smarthome.am.smart_home.Subject
import fr.unice.polytech.si5.smarthome.am.smart_home.DifferedBarrier

/**
 * Sample aspect that gives java.io.File the ability to store Text content and save it to disk
 */
@Aspect(className=Home)
class HomeAspect {	
	public Integer curtime = 0;
    public var Queue<AbstractOccurence> pendingEvents
	
	@Main
	def void execute(){		
		_self.curtime = 0
		_self.pendingEvents = new LinkedList<AbstractOccurence>()
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
			//println("pending events "+_self.pendingEvents.size())
			_self.tick()
		}
		_self.curtime = 0
	}
	
	private def void tick() {
		//println(_self.pendingEvents.peek())
		while (_self.pendingEvents.peek() !== null && _self.pendingEvents.peek().timestamp == _self.curtime) {
			_self.pendingEvents.poll().happenNow(_self)
		}	
		for (ABarrier barrier : _self.ownedBarrier) {
			barrier.tryTrigger(null);
		}
	}
	
	def void addPendingEvent(AbstractOccurence occurence) {
		_self.pendingEvents.add(occurence)
		_self.pendingEvents = new LinkedList(_self.pendingEvents.sortBy[timestamp])
		println(_self.pendingEvents)		
	}
	
	@Step
	def void addNewOccurenceOfAction(Action action, Integer timestamp) {
		val AbstractOccurence occurence = new AbstractOccurence(timestamp, action, null)
		_self.addPendingEvent(occurence);
	}
	
	def Integer wichTime() {
		return _self.curtime
	}
}


@Aspect(className = Occurence)
class OccurenceAspect {
	
	def AbstractOccurence toAbstractOccurence() {
		return new AbstractOccurence(_self.ownedTime.toSec(), _self.action, _self.actor)
	}
	
}

@Aspect(className=Subject)
class SubjectAspect {
	AbstractOccurence lastOccurence
	
	def void occur(AbstractOccurence occurence) {
		_self.lastOccurence = occurence
	}
	
	def AbstractOccurence lastEvent() {
		return _self.lastOccurence
	}
}

class AbstractOccurence {
	public var Integer timestamp
	public var Actor actor
	public var Action action
	
	new(Integer timestamp, Action action, Actor actor) {
		this.timestamp = timestamp
		this.action = action
		this.actor = actor
	}
	
	@Step
	def void happenNow(Home home) {
		println(""+this.timestamp+" : "+this.action.name)
		//check all condition
		(this.action.eContainer as Subject).occur(this)
		for (ABarrier barrier: home.ownedBarrier) {
			barrier.tryTrigger(this)
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

@Aspect(className=ABarrier)
abstract class ABarrierAspect {
	def abstract void tryTrigger(AbstractOccurence occurence)
}

<<<<<<< HEAD
@Aspect(className=Barrier)
class BarrierAspect extends ABarrierAspect{
=======

@Aspect(className=Condition)
class ConditionAspect extends AConditionAspect{
	public var Integer iiii = 0;
	//@ReplaceAspectMethod
>>>>>>> a1024b3d01b3bfd4f4eb14ac2bc5eef4627fa2d0
	@OverrideAspectMethod
	def void tryTrigger(AbstractOccurence occurence) {
		if (_self.ownedCondition.isValid(occurence)){
			for (Action a: _self.actions) {
				a.trigger(occurence.timestamp)
				(_self.eContainer() as Home).addNewOccurenceOfAction(a, occurence.timestamp)
			}
		}
	}
}

@Aspect(className=DifferedBarrier)
class DifferedBarrierAspect extends ABarrierAspect{
	@OverrideAspectMethod
	def void tryTrigger(AbstractOccurence occurence) {
		if (_self.ownedCondition.isValid(occurence)){
			for (Action a: _self.actions) {
				a.trigger(occurence.timestamp)
				(_self.eContainer() as Home).addNewOccurenceOfAction(a, occurence.timestamp)
			}
		}
	}
}

@Aspect(className=ACondition)
abstract class AConditionAspect {
	def abstract boolean isValid(AbstractOccurence occurence)
}

@Aspect(className=Condition)
class ConditionAspect extends AConditionAspect{
	//@ReplaceAspectMethod
	@OverrideAspectMethod
	def boolean isValid(AbstractOccurence occurence) {
		if (occurence === null ) return false;
		return (occurence.action == _self.action && (_self.actor == null || _self.actor == occurence.actor))
	}
}

@Aspect(className=TimeEleapsedCondition)
class TimeConditionAspect extends AConditionAspect{
	@OverrideAspectMethod
	def boolean isValid(AbstractOccurence occurence) {
		
		var AbstractOccurence lastOccurence = (_self.action.eContainer as Subject).lastEvent()
		
		//println("check last occurences "+lastOccurence)
		var Home home = ((_self.action.eContainer as Subject).eContainer as Home)
		var Boolean last_occurence = false
		var Boolean time = false
		var Boolean actor = false
		if (lastOccurence !== null ){
			actor = (_self.actor === null || _self.actor == lastOccurence.actor)
			last_occurence = lastOccurence.action == _self.action
			time = (home.wichTime()-lastOccurence.timestamp) >= _self.ownedTimestampEleapsed.toSec()
			
		} 
		
		var Boolean value = actor && last_occurence
			 && time
		/*if (actor){
			println("last occurence of "+ _self.action.name)
			println(home.wichTime()+"-"+lastOccurence.timestamp+" >= "+_self.ownedTimestampEleapsed.toSec())
			
			println("occurence and actor: "+actor+" lastoccur: "+last_occurence+" time: "+time)
			println(value)
		}*/
		return value
	}
}

@Aspect(className=ComposeCondition)
class ComposeConditionAspect extends AConditionAspect{
	@OverrideAspectMethod
	def boolean isValid(AbstractOccurence occurence) {
		for (ACondition condition: _self.ownedConditions) {
			if (! condition.isValid(occurence)) return false
		}
		return true
	}
	
}

@Aspect(className=Action)
class ActionAspect {
	@Step
	def void trigger(Integer time) {
		println(""+time+" -> "+_self.name+" triggered")
	}
}

