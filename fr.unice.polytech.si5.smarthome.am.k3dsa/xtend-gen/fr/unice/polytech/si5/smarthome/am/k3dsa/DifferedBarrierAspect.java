package fr.unice.polytech.si5.smarthome.am.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.unice.polytech.si5.smarthome.am.k3dsa.ABarrierAspect;
import fr.unice.polytech.si5.smarthome.am.k3dsa.AConditionAspect;
import fr.unice.polytech.si5.smarthome.am.k3dsa.AbstractOccurence;
import fr.unice.polytech.si5.smarthome.am.k3dsa.ActionAspect;
import fr.unice.polytech.si5.smarthome.am.k3dsa.DifferedBarrierAspectDifferedBarrierAspectProperties;
import fr.unice.polytech.si5.smarthome.am.k3dsa.HomeAspect;
import fr.unice.polytech.si5.smarthome.am.k3dsa.HomeTimeStampAspect;
import fr.unice.polytech.si5.smarthome.am.smart_home.Action;
import fr.unice.polytech.si5.smarthome.am.smart_home.DifferedBarrier;
import fr.unice.polytech.si5.smarthome.am.smart_home.Home;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@Aspect(className = DifferedBarrier.class)
@SuppressWarnings("all")
public class DifferedBarrierAspect extends ABarrierAspect {
  @OverrideAspectMethod
  public static void tryTrigger(final DifferedBarrier _self, final AbstractOccurence occurence) {
    final fr.unice.polytech.si5.smarthome.am.k3dsa.DifferedBarrierAspectDifferedBarrierAspectProperties _self_ = fr.unice.polytech.si5.smarthome.am.k3dsa.DifferedBarrierAspectDifferedBarrierAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void tryTrigger(AbstractOccurence)
    if (_self instanceof fr.unice.polytech.si5.smarthome.am.smart_home.DifferedBarrier){
    	fr.unice.polytech.si5.smarthome.am.k3dsa.DifferedBarrierAspect._privk3_tryTrigger(_self_, (fr.unice.polytech.si5.smarthome.am.smart_home.DifferedBarrier)_self,occurence);
    };
  }
  
  protected static void _privk3_tryTrigger(final DifferedBarrierAspectDifferedBarrierAspectProperties _self_, final DifferedBarrier _self, final AbstractOccurence occurence) {
    boolean _isValid = AConditionAspect.isValid(_self.getOwnedCondition(), occurence);
    if (_isValid) {
      EObject _eContainer = _self.eContainer();
      Home home = ((Home) _eContainer);
      AConditionAspect.setLastSuccessTriggerToNow(_self.getOwnedCondition());
      EList<Action> _actions = _self.getActions();
      for (final Action a : _actions) {
        {
          ActionAspect.trigger(a, HomeAspect.curtime(home));
          Integer _curtime = HomeAspect.curtime(home);
          Integer _sec = HomeTimeStampAspect.toSec(_self.getTriggerAfter());
          int _plus = ((_curtime).intValue() + (_sec).intValue());
          HomeAspect.addNewOccurenceOfAction(home, a, Integer.valueOf(_plus));
        }
      }
    }
  }
}
