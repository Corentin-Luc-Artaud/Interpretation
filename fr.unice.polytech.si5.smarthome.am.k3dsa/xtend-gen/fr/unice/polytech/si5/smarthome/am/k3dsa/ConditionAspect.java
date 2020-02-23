package fr.unice.polytech.si5.smarthome.am.k3dsa;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.unice.polytech.si5.smarthome.am.k3dsa.AConditionAspect;
import fr.unice.polytech.si5.smarthome.am.k3dsa.AbstractOccurence;
import fr.unice.polytech.si5.smarthome.am.k3dsa.ConditionAspectConditionAspectProperties;
import fr.unice.polytech.si5.smarthome.am.smart_home.Condition;

@Aspect(className = Condition.class)
@SuppressWarnings("all")
public class ConditionAspect extends AConditionAspect {
  @OverrideAspectMethod
  public static boolean isValid(final Condition _self, final AbstractOccurence occurence) {
    final fr.unice.polytech.si5.smarthome.am.k3dsa.ConditionAspectConditionAspectProperties _self_ = fr.unice.polytech.si5.smarthome.am.k3dsa.ConditionAspectConditionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean isValid(AbstractOccurence)
    if (_self instanceof fr.unice.polytech.si5.smarthome.am.smart_home.Condition){
    	result = fr.unice.polytech.si5.smarthome.am.k3dsa.ConditionAspect._privk3_isValid(_self_, (fr.unice.polytech.si5.smarthome.am.smart_home.Condition)_self,occurence);
    };
    return (boolean)result;
  }
  
  @OverrideAspectMethod
  public static void setLastSuccessTriggerToNow(final Condition _self) {
    final fr.unice.polytech.si5.smarthome.am.k3dsa.ConditionAspectConditionAspectProperties _self_ = fr.unice.polytech.si5.smarthome.am.k3dsa.ConditionAspectConditionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void setLastSuccessTriggerToNow()
    if (_self instanceof fr.unice.polytech.si5.smarthome.am.smart_home.Condition){
    	fr.unice.polytech.si5.smarthome.am.k3dsa.ConditionAspect._privk3_setLastSuccessTriggerToNow(_self_, (fr.unice.polytech.si5.smarthome.am.smart_home.Condition)_self);
    };
  }
  
  protected static boolean _privk3_isValid(final ConditionAspectConditionAspectProperties _self_, final Condition _self, final AbstractOccurence occurence) {
    if ((occurence == null)) {
      return false;
    }
    return (Objects.equal(occurence.action, _self.getAction()) && ((_self.getActor() == null) || Objects.equal(_self.getActor(), occurence.actor)));
  }
  
  protected static void _privk3_setLastSuccessTriggerToNow(final ConditionAspectConditionAspectProperties _self_, final Condition _self) {
    return;
  }
}
