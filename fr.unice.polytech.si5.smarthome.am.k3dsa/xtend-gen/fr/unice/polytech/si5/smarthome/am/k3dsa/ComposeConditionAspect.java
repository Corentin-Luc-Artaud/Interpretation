package fr.unice.polytech.si5.smarthome.am.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.unice.polytech.si5.smarthome.am.k3dsa.AConditionAspect;
import fr.unice.polytech.si5.smarthome.am.k3dsa.AbstractOccurence;
import fr.unice.polytech.si5.smarthome.am.k3dsa.ComposeConditionAspectComposeConditionAspectProperties;
import fr.unice.polytech.si5.smarthome.am.smart_home.ACondition;
import fr.unice.polytech.si5.smarthome.am.smart_home.ComposeCondition;
import org.eclipse.emf.common.util.EList;

@Aspect(className = ComposeCondition.class)
@SuppressWarnings("all")
public class ComposeConditionAspect extends AConditionAspect {
  @OverrideAspectMethod
  public static boolean isValid(final ComposeCondition _self, final AbstractOccurence occurence) {
    final fr.unice.polytech.si5.smarthome.am.k3dsa.ComposeConditionAspectComposeConditionAspectProperties _self_ = fr.unice.polytech.si5.smarthome.am.k3dsa.ComposeConditionAspectComposeConditionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean isValid(AbstractOccurence)
    if (_self instanceof fr.unice.polytech.si5.smarthome.am.smart_home.ComposeCondition){
    	result = fr.unice.polytech.si5.smarthome.am.k3dsa.ComposeConditionAspect._privk3_isValid(_self_, (fr.unice.polytech.si5.smarthome.am.smart_home.ComposeCondition)_self,occurence);
    };
    return (boolean)result;
  }
  
  @OverrideAspectMethod
  public static void setLastSuccessTriggerToNow(final ComposeCondition _self) {
    final fr.unice.polytech.si5.smarthome.am.k3dsa.ComposeConditionAspectComposeConditionAspectProperties _self_ = fr.unice.polytech.si5.smarthome.am.k3dsa.ComposeConditionAspectComposeConditionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void setLastSuccessTriggerToNow()
    if (_self instanceof fr.unice.polytech.si5.smarthome.am.smart_home.ComposeCondition){
    	fr.unice.polytech.si5.smarthome.am.k3dsa.ComposeConditionAspect._privk3_setLastSuccessTriggerToNow(_self_, (fr.unice.polytech.si5.smarthome.am.smart_home.ComposeCondition)_self);
    };
  }
  
  protected static boolean _privk3_isValid(final ComposeConditionAspectComposeConditionAspectProperties _self_, final ComposeCondition _self, final AbstractOccurence occurence) {
    EList<ACondition> _ownedConditions = _self.getOwnedConditions();
    for (final ACondition condition : _ownedConditions) {
      boolean _isValid = AConditionAspect.isValid(condition, occurence);
      boolean _not = (!_isValid);
      if (_not) {
        return false;
      }
    }
    return true;
  }
  
  protected static void _privk3_setLastSuccessTriggerToNow(final ComposeConditionAspectComposeConditionAspectProperties _self_, final ComposeCondition _self) {
    EList<ACondition> _ownedConditions = _self.getOwnedConditions();
    for (final ACondition condition : _ownedConditions) {
      AConditionAspect.setLastSuccessTriggerToNow(condition);
    }
  }
}
