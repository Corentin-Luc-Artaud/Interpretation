package fr.unice.polytech.si5.smarthome.am.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.unice.polytech.si5.smarthome.am.k3dsa.AbstractOccurence;
import fr.unice.polytech.si5.smarthome.am.k3dsa.SubjectAspectSubjectAspectProperties;
import fr.unice.polytech.si5.smarthome.am.smart_home.Subject;

@Aspect(className = Subject.class)
@SuppressWarnings("all")
public class SubjectAspect {
  public static void occur(final Subject _self, final AbstractOccurence occurence) {
    final fr.unice.polytech.si5.smarthome.am.k3dsa.SubjectAspectSubjectAspectProperties _self_ = fr.unice.polytech.si5.smarthome.am.k3dsa.SubjectAspectSubjectAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void occur(AbstractOccurence)
    if (_self instanceof fr.unice.polytech.si5.smarthome.am.smart_home.Subject){
    	fr.unice.polytech.si5.smarthome.am.k3dsa.SubjectAspect._privk3_occur(_self_, (fr.unice.polytech.si5.smarthome.am.smart_home.Subject)_self,occurence);
    };
  }
  
  public static AbstractOccurence lastEvent(final Subject _self) {
    final fr.unice.polytech.si5.smarthome.am.k3dsa.SubjectAspectSubjectAspectProperties _self_ = fr.unice.polytech.si5.smarthome.am.k3dsa.SubjectAspectSubjectAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# AbstractOccurence lastEvent()
    if (_self instanceof fr.unice.polytech.si5.smarthome.am.smart_home.Subject){
    	result = fr.unice.polytech.si5.smarthome.am.k3dsa.SubjectAspect._privk3_lastEvent(_self_, (fr.unice.polytech.si5.smarthome.am.smart_home.Subject)_self);
    };
    return (fr.unice.polytech.si5.smarthome.am.k3dsa.AbstractOccurence)result;
  }
  
  private static AbstractOccurence lastOccurence(final Subject _self) {
    final fr.unice.polytech.si5.smarthome.am.k3dsa.SubjectAspectSubjectAspectProperties _self_ = fr.unice.polytech.si5.smarthome.am.k3dsa.SubjectAspectSubjectAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# AbstractOccurence lastOccurence()
    if (_self instanceof fr.unice.polytech.si5.smarthome.am.smart_home.Subject){
    	result = fr.unice.polytech.si5.smarthome.am.k3dsa.SubjectAspect._privk3_lastOccurence(_self_, (fr.unice.polytech.si5.smarthome.am.smart_home.Subject)_self);
    };
    return (fr.unice.polytech.si5.smarthome.am.k3dsa.AbstractOccurence)result;
  }
  
  private static void lastOccurence(final Subject _self, final AbstractOccurence lastOccurence) {
    final fr.unice.polytech.si5.smarthome.am.k3dsa.SubjectAspectSubjectAspectProperties _self_ = fr.unice.polytech.si5.smarthome.am.k3dsa.SubjectAspectSubjectAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void lastOccurence(AbstractOccurence)
    if (_self instanceof fr.unice.polytech.si5.smarthome.am.smart_home.Subject){
    	fr.unice.polytech.si5.smarthome.am.k3dsa.SubjectAspect._privk3_lastOccurence(_self_, (fr.unice.polytech.si5.smarthome.am.smart_home.Subject)_self,lastOccurence);
    };
  }
  
  protected static void _privk3_occur(final SubjectAspectSubjectAspectProperties _self_, final Subject _self, final AbstractOccurence occurence) {
    SubjectAspect.lastOccurence(_self, occurence);
  }
  
  protected static AbstractOccurence _privk3_lastEvent(final SubjectAspectSubjectAspectProperties _self_, final Subject _self) {
    return SubjectAspect.lastOccurence(_self);
  }
  
  protected static AbstractOccurence _privk3_lastOccurence(final SubjectAspectSubjectAspectProperties _self_, final Subject _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getLastOccurence") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (fr.unice.polytech.si5.smarthome.am.k3dsa.AbstractOccurence) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.lastOccurence;
  }
  
  protected static void _privk3_lastOccurence(final SubjectAspectSubjectAspectProperties _self_, final Subject _self, final AbstractOccurence lastOccurence) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setLastOccurence")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, lastOccurence);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.lastOccurence = lastOccurence;
    }
  }
}
