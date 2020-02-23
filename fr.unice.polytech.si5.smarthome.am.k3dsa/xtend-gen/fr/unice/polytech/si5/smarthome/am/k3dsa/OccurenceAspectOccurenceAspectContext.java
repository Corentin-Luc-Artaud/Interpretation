package fr.unice.polytech.si5.smarthome.am.k3dsa;

import fr.unice.polytech.si5.smarthome.am.k3dsa.OccurenceAspectOccurenceAspectProperties;
import fr.unice.polytech.si5.smarthome.am.smart_home.Occurence;
import java.util.Map;

@SuppressWarnings("all")
public class OccurenceAspectOccurenceAspectContext {
  public final static OccurenceAspectOccurenceAspectContext INSTANCE = new OccurenceAspectOccurenceAspectContext();
  
  public static OccurenceAspectOccurenceAspectProperties getSelf(final Occurence _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.unice.polytech.si5.smarthome.am.k3dsa.OccurenceAspectOccurenceAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Occurence, OccurenceAspectOccurenceAspectProperties> map = new java.util.WeakHashMap<fr.unice.polytech.si5.smarthome.am.smart_home.Occurence, fr.unice.polytech.si5.smarthome.am.k3dsa.OccurenceAspectOccurenceAspectProperties>();
  
  public Map<Occurence, OccurenceAspectOccurenceAspectProperties> getMap() {
    return map;
  }
}
