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
  public static void tryTrigger(final ACondition _self, final AbstractOccurence occurence) {
    final fr.unice.polytech.si5.smarthome.am.k3dsa.AConditionAspectAConditionAspectProperties _self_ = fr.unice.polytech.si5.smarthome.am.k3dsa.AConditionAspectAConditionAspectContext.getSelf(_self);
    	// BeginInjectInto fr.unice.polytech.si5.smarthome.am.k3dsa.AConditionAspect#void tryTrigger(AbstractOccurence) from fr.unice.polytech.si5.smarthome.am.k3dsa.ConditionAspect
    		if (_self instanceof fr.unice.polytech.si5.smarthome.am.smart_home.Condition){
    			fr.unice.polytech.si5.smarthome.am.k3dsa.ConditionAspect.tryTrigger((fr.unice.polytech.si5.smarthome.am.smart_home.Condition)_self,occurence);
    		} else
    		// EndInjectInto fr.unice.polytech.si5.smarthome.am.k3dsa.AConditionAspect#void tryTrigger(AbstractOccurence) from fr.unice.polytech.si5.smarthome.am.k3dsa.ConditionAspect
    	// BeginInjectInto fr.unice.polytech.si5.smarthome.am.k3dsa.AConditionAspect#void tryTrigger(AbstractOccurence) from fr.unice.polytech.si5.smarthome.am.k3dsa.TimeConditionAspect
    		if (_self instanceof fr.unice.polytech.si5.smarthome.am.smart_home.TimeEleapsedCondition){
    			fr.unice.polytech.si5.smarthome.am.k3dsa.TimeConditionAspect.tryTrigger((fr.unice.polytech.si5.smarthome.am.smart_home.TimeEleapsedCondition)_self,occurence);
    		} else
    		// EndInjectInto fr.unice.polytech.si5.smarthome.am.k3dsa.AConditionAspect#void tryTrigger(AbstractOccurence) from fr.unice.polytech.si5.smarthome.am.k3dsa.TimeConditionAspect
    // #DispatchPointCut_before# void tryTrigger(AbstractOccurence)
    if (_self instanceof fr.unice.polytech.si5.smarthome.am.smart_home.ACondition){
    	fr.unice.polytech.si5.smarthome.am.k3dsa.AConditionAspect._privk3_tryTrigger(_self_, (fr.unice.polytech.si5.smarthome.am.smart_home.ACondition)_self,occurence);
    };
  }
  
  protected static void _privk3_tryTrigger(final AConditionAspectAConditionAspectProperties _self_, final ACondition _self, final AbstractOccurence occurence) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
