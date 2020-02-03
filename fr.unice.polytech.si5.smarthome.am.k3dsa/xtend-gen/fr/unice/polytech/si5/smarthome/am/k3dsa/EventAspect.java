package fr.unice.polytech.si5.smarthome.am.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import fr.unice.polytech.si5.smarthome.am.k3dsa.EventAspectEventAspectProperties;
import fr.unice.polytech.si5.smarthome.am.smart_home.Event;

@Aspect(className = Event.class)
@SuppressWarnings("all")
public class EventAspect {
  @ReplaceAspectMethod
  public static String description(final Event _self) {
    final fr.unice.polytech.si5.smarthome.am.k3dsa.EventAspectEventAspectProperties _self_ = fr.unice.polytech.si5.smarthome.am.k3dsa.EventAspectEventAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String description()
    if (_self instanceof fr.unice.polytech.si5.smarthome.am.smart_home.Event){
    	result = fr.unice.polytech.si5.smarthome.am.k3dsa.EventAspect._privk3_description(_self_, (fr.unice.polytech.si5.smarthome.am.smart_home.Event)_self);
    };
    return (java.lang.String)result;
  }
  
  protected static String _privk3_description(final EventAspectEventAspectProperties _self_, final Event _self) {
    String _name = _self.getActor().getName();
    String _plus = ("" + _name);
    String _plus_1 = (_plus + " ");
    String _name_1 = _self.getAction().getName();
    return (_plus_1 + _name_1);
  }
}
