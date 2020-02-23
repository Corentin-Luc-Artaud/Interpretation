package fr.unice.polytech.si5.smarthome.am.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.unice.polytech.si5.smarthome.am.k3dsa.AConditionAspectAConditionAspectProperties;
import fr.unice.polytech.si5.smarthome.am.k3dsa.AbstractOccurence;
import fr.unice.polytech.si5.smarthome.am.smart_home.ACondition;

@Aspect(className = ACondition.class)
@SuppressWarnings("all")
public abstract class AConditionAspect {
  @Abstract
  public static boolean isValid(final ACondition _self, final AbstractOccurence occurence) {
    final fr.unice.polytech.si5.smarthome.am.k3dsa.AConditionAspectAConditionAspectProperties _self_ = fr.unice.polytech.si5.smarthome.am.k3dsa.AConditionAspectAConditionAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto fr.unice.polytech.si5.smarthome.am.k3dsa.AConditionAspect#boolean isValid(AbstractOccurence) from fr.unice.polytech.si5.smarthome.am.k3dsa.TimeConditionAspect
    		if (_self instanceof fr.unice.polytech.si5.smarthome.am.smart_home.TimeEleapsedCondition){
    			result = fr.unice.polytech.si5.smarthome.am.k3dsa.TimeConditionAspect.isValid((fr.unice.polytech.si5.smarthome.am.smart_home.TimeEleapsedCondition)_self,occurence);
    		} else
    		// EndInjectInto fr.unice.polytech.si5.smarthome.am.k3dsa.AConditionAspect#boolean isValid(AbstractOccurence) from fr.unice.polytech.si5.smarthome.am.k3dsa.TimeConditionAspect
    	// BeginInjectInto fr.unice.polytech.si5.smarthome.am.k3dsa.AConditionAspect#boolean isValid(AbstractOccurence) from fr.unice.polytech.si5.smarthome.am.k3dsa.ComposeConditionAspect
    		if (_self instanceof fr.unice.polytech.si5.smarthome.am.smart_home.ComposeCondition){
    			result = fr.unice.polytech.si5.smarthome.am.k3dsa.ComposeConditionAspect.isValid((fr.unice.polytech.si5.smarthome.am.smart_home.ComposeCondition)_self,occurence);
    		} else
    		// EndInjectInto fr.unice.polytech.si5.smarthome.am.k3dsa.AConditionAspect#boolean isValid(AbstractOccurence) from fr.unice.polytech.si5.smarthome.am.k3dsa.ComposeConditionAspect
    	// BeginInjectInto fr.unice.polytech.si5.smarthome.am.k3dsa.AConditionAspect#boolean isValid(AbstractOccurence) from fr.unice.polytech.si5.smarthome.am.k3dsa.ConditionAspect
    		if (_self instanceof fr.unice.polytech.si5.smarthome.am.smart_home.Condition){
    			result = fr.unice.polytech.si5.smarthome.am.k3dsa.ConditionAspect.isValid((fr.unice.polytech.si5.smarthome.am.smart_home.Condition)_self,occurence);
    		} else
    		// EndInjectInto fr.unice.polytech.si5.smarthome.am.k3dsa.AConditionAspect#boolean isValid(AbstractOccurence) from fr.unice.polytech.si5.smarthome.am.k3dsa.ConditionAspect
    // #DispatchPointCut_before# boolean isValid(AbstractOccurence)
    if (_self instanceof fr.unice.polytech.si5.smarthome.am.smart_home.ACondition){
    	result = fr.unice.polytech.si5.smarthome.am.k3dsa.AConditionAspect._privk3_isValid(_self_, (fr.unice.polytech.si5.smarthome.am.smart_home.ACondition)_self,occurence);
    };
    return (boolean)result;
  }
  
  @Abstract
  public static void setLastSuccessTriggerToNow(final ACondition _self) {
    final fr.unice.polytech.si5.smarthome.am.k3dsa.AConditionAspectAConditionAspectProperties _self_ = fr.unice.polytech.si5.smarthome.am.k3dsa.AConditionAspectAConditionAspectContext.getSelf(_self);
    	// BeginInjectInto fr.unice.polytech.si5.smarthome.am.k3dsa.AConditionAspect#void setLastSuccessTriggerToNow() from fr.unice.polytech.si5.smarthome.am.k3dsa.TimeConditionAspect
    		if (_self instanceof fr.unice.polytech.si5.smarthome.am.smart_home.TimeEleapsedCondition){
    			fr.unice.polytech.si5.smarthome.am.k3dsa.TimeConditionAspect.setLastSuccessTriggerToNow((fr.unice.polytech.si5.smarthome.am.smart_home.TimeEleapsedCondition)_self);
    		} else
    		// EndInjectInto fr.unice.polytech.si5.smarthome.am.k3dsa.AConditionAspect#void setLastSuccessTriggerToNow() from fr.unice.polytech.si5.smarthome.am.k3dsa.TimeConditionAspect
    	// BeginInjectInto fr.unice.polytech.si5.smarthome.am.k3dsa.AConditionAspect#void setLastSuccessTriggerToNow() from fr.unice.polytech.si5.smarthome.am.k3dsa.ComposeConditionAspect
    		if (_self instanceof fr.unice.polytech.si5.smarthome.am.smart_home.ComposeCondition){
    			fr.unice.polytech.si5.smarthome.am.k3dsa.ComposeConditionAspect.setLastSuccessTriggerToNow((fr.unice.polytech.si5.smarthome.am.smart_home.ComposeCondition)_self);
    		} else
    		// EndInjectInto fr.unice.polytech.si5.smarthome.am.k3dsa.AConditionAspect#void setLastSuccessTriggerToNow() from fr.unice.polytech.si5.smarthome.am.k3dsa.ComposeConditionAspect
    	// BeginInjectInto fr.unice.polytech.si5.smarthome.am.k3dsa.AConditionAspect#void setLastSuccessTriggerToNow() from fr.unice.polytech.si5.smarthome.am.k3dsa.ConditionAspect
    		if (_self instanceof fr.unice.polytech.si5.smarthome.am.smart_home.Condition){
    			fr.unice.polytech.si5.smarthome.am.k3dsa.ConditionAspect.setLastSuccessTriggerToNow((fr.unice.polytech.si5.smarthome.am.smart_home.Condition)_self);
    		} else
    		// EndInjectInto fr.unice.polytech.si5.smarthome.am.k3dsa.AConditionAspect#void setLastSuccessTriggerToNow() from fr.unice.polytech.si5.smarthome.am.k3dsa.ConditionAspect
    // #DispatchPointCut_before# void setLastSuccessTriggerToNow()
    if (_self instanceof fr.unice.polytech.si5.smarthome.am.smart_home.ACondition){
    	fr.unice.polytech.si5.smarthome.am.k3dsa.AConditionAspect._privk3_setLastSuccessTriggerToNow(_self_, (fr.unice.polytech.si5.smarthome.am.smart_home.ACondition)_self);
    };
  }
  
  protected static boolean _privk3_isValid(final AConditionAspectAConditionAspectProperties _self_, final ACondition _self, final AbstractOccurence occurence) {
    throw new java.lang.RuntimeException("Not implemented");
  }
  
  protected static void _privk3_setLastSuccessTriggerToNow(final AConditionAspectAConditionAspectProperties _self_, final ACondition _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
