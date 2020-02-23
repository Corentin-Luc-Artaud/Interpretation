package fr.unice.polytech.si5.smarthome.am.k3dsa;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.unice.polytech.si5.smarthome.am.k3dsa.AConditionAspect;
import fr.unice.polytech.si5.smarthome.am.k3dsa.AbstractOccurence;
import fr.unice.polytech.si5.smarthome.am.k3dsa.HomeAspect;
import fr.unice.polytech.si5.smarthome.am.k3dsa.HomeTimeStampAspect;
import fr.unice.polytech.si5.smarthome.am.k3dsa.SubjectAspect;
import fr.unice.polytech.si5.smarthome.am.k3dsa.TimeConditionAspectTimeEleapsedConditionAspectProperties;
import fr.unice.polytech.si5.smarthome.am.smart_home.Action;
import fr.unice.polytech.si5.smarthome.am.smart_home.Home;
import fr.unice.polytech.si5.smarthome.am.smart_home.Subject;
import fr.unice.polytech.si5.smarthome.am.smart_home.TimeEleapsedCondition;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Exceptions;

@Aspect(className = TimeEleapsedCondition.class)
@SuppressWarnings("all")
public class TimeConditionAspect extends AConditionAspect {
  @OverrideAspectMethod
  public static boolean isValid(final TimeEleapsedCondition _self, final AbstractOccurence occurence) {
    final fr.unice.polytech.si5.smarthome.am.k3dsa.TimeConditionAspectTimeEleapsedConditionAspectProperties _self_ = fr.unice.polytech.si5.smarthome.am.k3dsa.TimeConditionAspectTimeEleapsedConditionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean isValid(AbstractOccurence)
    if (_self instanceof fr.unice.polytech.si5.smarthome.am.smart_home.TimeEleapsedCondition){
    	result = fr.unice.polytech.si5.smarthome.am.k3dsa.TimeConditionAspect._privk3_isValid(_self_, (fr.unice.polytech.si5.smarthome.am.smart_home.TimeEleapsedCondition)_self,occurence);
    };
    return (boolean)result;
  }
  
  @OverrideAspectMethod
  public static void setLastSuccessTriggerToNow(final TimeEleapsedCondition _self) {
    final fr.unice.polytech.si5.smarthome.am.k3dsa.TimeConditionAspectTimeEleapsedConditionAspectProperties _self_ = fr.unice.polytech.si5.smarthome.am.k3dsa.TimeConditionAspectTimeEleapsedConditionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void setLastSuccessTriggerToNow()
    if (_self instanceof fr.unice.polytech.si5.smarthome.am.smart_home.TimeEleapsedCondition){
    	fr.unice.polytech.si5.smarthome.am.k3dsa.TimeConditionAspect._privk3_setLastSuccessTriggerToNow(_self_, (fr.unice.polytech.si5.smarthome.am.smart_home.TimeEleapsedCondition)_self);
    };
  }
  
  private static Integer lastSuccedTrigger(final TimeEleapsedCondition _self) {
    final fr.unice.polytech.si5.smarthome.am.k3dsa.TimeConditionAspectTimeEleapsedConditionAspectProperties _self_ = fr.unice.polytech.si5.smarthome.am.k3dsa.TimeConditionAspectTimeEleapsedConditionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Integer lastSuccedTrigger()
    if (_self instanceof fr.unice.polytech.si5.smarthome.am.smart_home.TimeEleapsedCondition){
    	result = fr.unice.polytech.si5.smarthome.am.k3dsa.TimeConditionAspect._privk3_lastSuccedTrigger(_self_, (fr.unice.polytech.si5.smarthome.am.smart_home.TimeEleapsedCondition)_self);
    };
    return (java.lang.Integer)result;
  }
  
  private static void lastSuccedTrigger(final TimeEleapsedCondition _self, final Integer lastSuccedTrigger) {
    final fr.unice.polytech.si5.smarthome.am.k3dsa.TimeConditionAspectTimeEleapsedConditionAspectProperties _self_ = fr.unice.polytech.si5.smarthome.am.k3dsa.TimeConditionAspectTimeEleapsedConditionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void lastSuccedTrigger(Integer)
    if (_self instanceof fr.unice.polytech.si5.smarthome.am.smart_home.TimeEleapsedCondition){
    	fr.unice.polytech.si5.smarthome.am.k3dsa.TimeConditionAspect._privk3_lastSuccedTrigger(_self_, (fr.unice.polytech.si5.smarthome.am.smart_home.TimeEleapsedCondition)_self,lastSuccedTrigger);
    };
  }
  
  protected static boolean _privk3_isValid(final TimeConditionAspectTimeEleapsedConditionAspectProperties _self_, final TimeEleapsedCondition _self, final AbstractOccurence occurence) {
    EObject _eContainer = _self.getAction().eContainer();
    AbstractOccurence lastOccurence = SubjectAspect.lastEvent(((Subject) _eContainer));
    EObject _eContainer_1 = _self.getAction().eContainer();
    EObject _eContainer_2 = ((Subject) _eContainer_1).eContainer();
    Home home = ((Home) _eContainer_2);
    Boolean last_occurence = Boolean.valueOf(false);
    Boolean time = Boolean.valueOf(false);
    Boolean actor = Boolean.valueOf(false);
    if ((lastOccurence != null)) {
      Integer _lastSuccedTrigger = TimeConditionAspect.lastSuccedTrigger(_self);
      boolean _lessThan = (lastOccurence.timestamp.compareTo(_lastSuccedTrigger) < 0);
      if (_lessThan) {
        return false;
      }
      actor = Boolean.valueOf(((_self.getActor() == null) || Objects.equal(_self.getActor(), lastOccurence.actor)));
      Action _action = _self.getAction();
      boolean _equals = Objects.equal(lastOccurence.action, _action);
      last_occurence = Boolean.valueOf(_equals);
      Integer _wichTime = HomeAspect.wichTime(home);
      int _minus = ((_wichTime).intValue() - (lastOccurence.timestamp).intValue());
      Integer _sec = HomeTimeStampAspect.toSec(_self.getOwnedTimestampEleapsed());
      boolean _greaterEqualsThan = (_minus >= (_sec).intValue());
      time = Boolean.valueOf(_greaterEqualsThan);
    }
    Boolean value = Boolean.valueOf((((actor).booleanValue() && (last_occurence).booleanValue()) && (time).booleanValue()));
    return (value).booleanValue();
  }
  
  protected static void _privk3_setLastSuccessTriggerToNow(final TimeConditionAspectTimeEleapsedConditionAspectProperties _self_, final TimeEleapsedCondition _self) {
    Home home = null;
    try {
      EObject _eContainer = _self.eContainer().eContainer();
      home = ((Home) _eContainer);
    } catch (final Throwable _t) {
      if (_t instanceof ClassCastException) {
        EObject _eContainer_1 = _self.eContainer().eContainer().eContainer();
        home = ((Home) _eContainer_1);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    TimeConditionAspect.lastSuccedTrigger(_self, HomeAspect.curtime(home));
  }
  
  protected static Integer _privk3_lastSuccedTrigger(final TimeConditionAspectTimeEleapsedConditionAspectProperties _self_, final TimeEleapsedCondition _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getLastSuccedTrigger") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.Integer) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.lastSuccedTrigger;
  }
  
  protected static void _privk3_lastSuccedTrigger(final TimeConditionAspectTimeEleapsedConditionAspectProperties _self_, final TimeEleapsedCondition _self, final Integer lastSuccedTrigger) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setLastSuccedTrigger")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, lastSuccedTrigger);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.lastSuccedTrigger = lastSuccedTrigger;
    }
  }
}
