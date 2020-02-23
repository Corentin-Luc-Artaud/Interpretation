package fr.unice.polytech.si5.smarthome.am.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.unice.polytech.si5.smarthome.am.k3dsa.ABarrierAspect;
import fr.unice.polytech.si5.smarthome.am.k3dsa.AConditionAspect;
import fr.unice.polytech.si5.smarthome.am.k3dsa.AbstractOccurence;
import fr.unice.polytech.si5.smarthome.am.k3dsa.ActionAspect;
import fr.unice.polytech.si5.smarthome.am.k3dsa.BarrierAspectBarrierAspectProperties;
import fr.unice.polytech.si5.smarthome.am.k3dsa.SmartHomeAspect;
import fr.unice.polytech.si5.smarthome.am.smart_home.Action;
import fr.unice.polytech.si5.smarthome.am.smart_home.Barrier;
import fr.unice.polytech.si5.smarthome.am.smart_home.Home;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@Aspect(className = Barrier.class)
@SuppressWarnings("all")
public class BarrierAspect extends ABarrierAspect {
  @OverrideAspectMethod
  public static void tryTrigger(final Barrier _self, final AbstractOccurence occurence) {
    final fr.unice.polytech.si5.smarthome.am.k3dsa.BarrierAspectBarrierAspectProperties _self_ = fr.unice.polytech.si5.smarthome.am.k3dsa.BarrierAspectBarrierAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void tryTrigger(AbstractOccurence)
    if (_self instanceof fr.unice.polytech.si5.smarthome.am.smart_home.Barrier){
    	fr.unice.polytech.si5.smarthome.am.k3dsa.BarrierAspect._privk3_tryTrigger(_self_, (fr.unice.polytech.si5.smarthome.am.smart_home.Barrier)_self,occurence);
    };
  }
  
  protected static void _privk3_tryTrigger(final BarrierAspectBarrierAspectProperties _self_, final Barrier _self, final AbstractOccurence occurence) {
    boolean _isValid = AConditionAspect.isValid(_self.getOwnedCondition(), occurence);
    if (_isValid) {
      EList<Action> _actions = _self.getActions();
      for (final Action a : _actions) {
        {
          ActionAspect.trigger(a, occurence.timestamp);
          EObject _eContainer = _self.eContainer();
          SmartHomeAspect.addNewOccurenceOfAction(((Home) _eContainer), a, occurence.timestamp);
        }
      }
    }
  }
}
