package fr.unice.polytech.si5.smarthome.am.k3dsa;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.unice.polytech.si5.smarthome.am.k3dsa.AConditionAspect;
import fr.unice.polytech.si5.smarthome.am.k3dsa.AbstractOccurence;
import fr.unice.polytech.si5.smarthome.am.k3dsa.ActionAspect;
import fr.unice.polytech.si5.smarthome.am.k3dsa.ConditionAspectConditionAspectProperties;
import fr.unice.polytech.si5.smarthome.am.k3dsa.HomeAspect;
import fr.unice.polytech.si5.smarthome.am.smart_home.Action;
import fr.unice.polytech.si5.smarthome.am.smart_home.Condition;
import fr.unice.polytech.si5.smarthome.am.smart_home.Home;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@Aspect(className = Condition.class)
@SuppressWarnings("all")
public class ConditionAspect extends AConditionAspect {
  @OverrideAspectMethod
  public static void tryTrigger(final Condition _self, final AbstractOccurence occurence) {
    final fr.unice.polytech.si5.smarthome.am.k3dsa.ConditionAspectConditionAspectProperties _self_ = fr.unice.polytech.si5.smarthome.am.k3dsa.ConditionAspectConditionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void tryTrigger(AbstractOccurence)
    if (_self instanceof fr.unice.polytech.si5.smarthome.am.smart_home.Condition){
    	fr.unice.polytech.si5.smarthome.am.k3dsa.ConditionAspect._privk3_tryTrigger(_self_, (fr.unice.polytech.si5.smarthome.am.smart_home.Condition)_self,occurence);
    };
  }
  
  public static Integer iiii(final Condition _self) {
    final fr.unice.polytech.si5.smarthome.am.k3dsa.ConditionAspectConditionAspectProperties _self_ = fr.unice.polytech.si5.smarthome.am.k3dsa.ConditionAspectConditionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Integer iiii()
    if (_self instanceof fr.unice.polytech.si5.smarthome.am.smart_home.Condition){
    	result = fr.unice.polytech.si5.smarthome.am.k3dsa.ConditionAspect._privk3_iiii(_self_, (fr.unice.polytech.si5.smarthome.am.smart_home.Condition)_self);
    };
    return (java.lang.Integer)result;
  }
  
  public static void iiii(final Condition _self, final Integer iiii) {
    final fr.unice.polytech.si5.smarthome.am.k3dsa.ConditionAspectConditionAspectProperties _self_ = fr.unice.polytech.si5.smarthome.am.k3dsa.ConditionAspectConditionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void iiii(Integer)
    if (_self instanceof fr.unice.polytech.si5.smarthome.am.smart_home.Condition){
    	fr.unice.polytech.si5.smarthome.am.k3dsa.ConditionAspect._privk3_iiii(_self_, (fr.unice.polytech.si5.smarthome.am.smart_home.Condition)_self,iiii);
    };
  }
  
  protected static void _privk3_tryTrigger(final ConditionAspectConditionAspectProperties _self_, final Condition _self, final AbstractOccurence occurence) {
    Action _action = _self.getAction();
    boolean _equals = Objects.equal(occurence.action, _action);
    if (_equals) {
      EList<Action> _actions = _self.getActions();
      for (final Action a : _actions) {
        {
          ActionAspect.trigger(a, occurence.timestamp);
          EObject _eContainer = _self.eContainer();
          HomeAspect.addNewOccurenceOfAction(((Home) _eContainer), a, occurence.timestamp);
        }
      }
    }
  }
  
  protected static Integer _privk3_iiii(final ConditionAspectConditionAspectProperties _self_, final Condition _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getIiii") &&
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
    return _self_.iiii;
  }
  
  protected static void _privk3_iiii(final ConditionAspectConditionAspectProperties _self_, final Condition _self, final Integer iiii) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setIiii")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, iiii);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.iiii = iiii;
    }
  }
}
