// AspectJ classes that have been aspectized and name
package fr.unice.polytech.si5.smarthome.am.smart_home;
public aspect AspectJEvent{
String around (fr.unice.polytech.si5.smarthome.am.smart_home.Event self)  :target (self) && (call ( java.lang.String fr.unice.polytech.si5.smarthome.am.smart_home.Event.description(  ) ) ) { return fr.unice.polytech.si5.smarthome.am.k3dsa.EventAspect.description(self );}

}
