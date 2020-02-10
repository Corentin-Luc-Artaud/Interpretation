package fr.unice.polytech.si5.smarthome.am.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.unice.polytech.si5.smarthome.am.k3dsa.HomeTimeStampAspectHomeTimeStampAspectProperties;
import fr.unice.polytech.si5.smarthome.am.smart_home.HomeTimeStamp;
import fr.unice.polytech.si5.smarthome.am.smart_home.SmartHomeFactory;

@Aspect(className = HomeTimeStamp.class)
@SuppressWarnings("all")
public class HomeTimeStampAspect {
  public static Integer toSec(final HomeTimeStamp _self) {
    final fr.unice.polytech.si5.smarthome.am.k3dsa.HomeTimeStampAspectHomeTimeStampAspectProperties _self_ = fr.unice.polytech.si5.smarthome.am.k3dsa.HomeTimeStampAspectHomeTimeStampAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Integer toSec()
    if (_self instanceof fr.unice.polytech.si5.smarthome.am.smart_home.HomeTimeStamp){
    	result = fr.unice.polytech.si5.smarthome.am.k3dsa.HomeTimeStampAspect._privk3_toSec(_self_, (fr.unice.polytech.si5.smarthome.am.smart_home.HomeTimeStamp)_self);
    };
    return (java.lang.Integer)result;
  }
  
  public static HomeTimeStamp clone(final HomeTimeStamp _self) {
    final fr.unice.polytech.si5.smarthome.am.k3dsa.HomeTimeStampAspectHomeTimeStampAspectProperties _self_ = fr.unice.polytech.si5.smarthome.am.k3dsa.HomeTimeStampAspectHomeTimeStampAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# HomeTimeStamp clone()
    if (_self instanceof fr.unice.polytech.si5.smarthome.am.smart_home.HomeTimeStamp){
    	result = fr.unice.polytech.si5.smarthome.am.k3dsa.HomeTimeStampAspect._privk3_clone(_self_, (fr.unice.polytech.si5.smarthome.am.smart_home.HomeTimeStamp)_self);
    };
    return (fr.unice.polytech.si5.smarthome.am.smart_home.HomeTimeStamp)result;
  }
  
  protected static Integer _privk3_toSec(final HomeTimeStampAspectHomeTimeStampAspectProperties _self_, final HomeTimeStamp _self) {
    int _sec = _self.getSec();
    int _min = _self.getMin();
    int _multiply = (_min * 60);
    int _plus = (_sec + _multiply);
    int _hour = _self.getHour();
    int _multiply_1 = (_hour * 24);
    int _multiply_2 = (_multiply_1 * 60);
    return Integer.valueOf((_plus + _multiply_2));
  }
  
  protected static HomeTimeStamp _privk3_clone(final HomeTimeStampAspectHomeTimeStampAspectProperties _self_, final HomeTimeStamp _self) {
    final HomeTimeStamp timeStamp = SmartHomeFactory.eINSTANCE.createHomeTimeStamp();
    timeStamp.setMin(_self.getMin());
    timeStamp.setSec(_self.getSec());
    timeStamp.setHour(_self.getHour());
    return timeStamp;
  }
}
