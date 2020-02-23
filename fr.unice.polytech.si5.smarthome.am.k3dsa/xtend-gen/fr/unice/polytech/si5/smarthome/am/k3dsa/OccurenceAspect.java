package fr.unice.polytech.si5.smarthome.am.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.unice.polytech.si5.smarthome.am.k3dsa.AbstractOccurence;
import fr.unice.polytech.si5.smarthome.am.k3dsa.HomeTimeStampAspect;
import fr.unice.polytech.si5.smarthome.am.k3dsa.OccurenceAspectOccurenceAspectProperties;
import fr.unice.polytech.si5.smarthome.am.smart_home.Action;
import fr.unice.polytech.si5.smarthome.am.smart_home.Actor;
import fr.unice.polytech.si5.smarthome.am.smart_home.Occurence;

@Aspect(className = Occurence.class)
@SuppressWarnings("all")
public class OccurenceAspect {
  public static AbstractOccurence toAbstractOccurence(final Occurence _self) {
    final fr.unice.polytech.si5.smarthome.am.k3dsa.OccurenceAspectOccurenceAspectProperties _self_ = fr.unice.polytech.si5.smarthome.am.k3dsa.OccurenceAspectOccurenceAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# AbstractOccurence toAbstractOccurence()
    if (_self instanceof fr.unice.polytech.si5.smarthome.am.smart_home.Occurence){
    	result = fr.unice.polytech.si5.smarthome.am.k3dsa.OccurenceAspect._privk3_toAbstractOccurence(_self_, (fr.unice.polytech.si5.smarthome.am.smart_home.Occurence)_self);
    };
    return (fr.unice.polytech.si5.smarthome.am.k3dsa.AbstractOccurence)result;
  }
  
  protected static AbstractOccurence _privk3_toAbstractOccurence(final OccurenceAspectOccurenceAspectProperties _self_, final Occurence _self) {
    Integer _sec = HomeTimeStampAspect.toSec(_self.getOwnedTime());
    Action _action = _self.getAction();
    Actor _actor = _self.getActor();
    return new AbstractOccurence(_sec, _action, _actor);
  }
}
