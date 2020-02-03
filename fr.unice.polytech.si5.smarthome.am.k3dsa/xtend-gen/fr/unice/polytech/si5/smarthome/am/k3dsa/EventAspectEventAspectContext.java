package fr.unice.polytech.si5.smarthome.am.k3dsa;

import fr.unice.polytech.si5.smarthome.am.k3dsa.EventAspectEventAspectProperties;
import fr.unice.polytech.si5.smarthome.am.smart_home.Event;
import java.util.Map;

@SuppressWarnings("all")
public class EventAspectEventAspectContext {
  public final static EventAspectEventAspectContext INSTANCE = new EventAspectEventAspectContext();
  
  public static EventAspectEventAspectProperties getSelf(final Event _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.unice.polytech.si5.smarthome.am.k3dsa.EventAspectEventAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Event, EventAspectEventAspectProperties> map = new java.util.WeakHashMap<fr.unice.polytech.si5.smarthome.am.smart_home.Event, fr.unice.polytech.si5.smarthome.am.k3dsa.EventAspectEventAspectProperties>();
  
  public Map<Event, EventAspectEventAspectProperties> getMap() {
    return map;
  }
}
