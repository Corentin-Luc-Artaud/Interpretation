package fr.unice.polytech.si5.smarthome.am.k3dsa;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.unice.polytech.si5.smarthome.am.k3dsa.AConditionAspect;
import fr.unice.polytech.si5.smarthome.am.k3dsa.AbstractOccurence;
import fr.unice.polytech.si5.smarthome.am.k3dsa.ActionAspect;
import fr.unice.polytech.si5.smarthome.am.k3dsa.HomeTimeStampAspect;
import fr.unice.polytech.si5.smarthome.am.k3dsa.SmartHomeAspect;
import fr.unice.polytech.si5.smarthome.am.k3dsa.TimeConditionAspectTimeEleapsedConditionAspectProperties;
import fr.unice.polytech.si5.smarthome.am.smart_home.Action;
import fr.unice.polytech.si5.smarthome.am.smart_home.Home;
import fr.unice.polytech.si5.smarthome.am.smart_home.TimeEleapsedCondition;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@Aspect(className = TimeEleapsedCondition.class)
@SuppressWarnings("all")
public class TimeConditionAspect extends AConditionAspect {
  @OverrideAspectMethod
  public static void tryTrigger(final TimeEleapsedCondition _self, final AbstractOccurence occurence) {
    final fr.unice.polytech.si5.smarthome.am.k3dsa.TimeConditionAspectTimeEleapsedConditionAspectProperties _self_ = fr.unice.polytech.si5.smarthome.am.k3dsa.TimeConditionAspectTimeEleapsedConditionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void tryTrigger(AbstractOccurence)
    if (_self instanceof fr.unice.polytech.si5.smarthome.am.smart_home.TimeEleapsedCondition){
    	fr.unice.polytech.si5.smarthome.am.k3dsa.TimeConditionAspect._privk3_tryTrigger(_self_, (fr.unice.polytech.si5.smarthome.am.smart_home.TimeEleapsedCondition)_self,occurence);
    };
  }
  
  protected static void _privk3_tryTrigger(final TimeConditionAspectTimeEleapsedConditionAspectProperties _self_, final TimeEleapsedCondition _self, final AbstractOccurence occurence) {
    Action _action = _self.getAction();
    boolean _equals = Objects.equal(occurence.action, _action);
    if (_equals) {
      EList<Action> _actions = _self.getActions();
      for (final Action a : _actions) {
        {
          ActionAspect.trigger(a, occurence.timestamp);
          EObject _eContainer = _self.eContainer();
          Integer _sec = HomeTimeStampAspect.toSec(_self.getOwnedTimestampEleapsed());
          int _plus = ((occurence.timestamp).intValue() + (_sec).intValue());
          SmartHomeAspect.addNewOccurenceOfAction(((Home) _eContainer), a, Integer.valueOf(_plus));
        }
      }
    }
  }
}
