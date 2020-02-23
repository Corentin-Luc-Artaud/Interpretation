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
}
