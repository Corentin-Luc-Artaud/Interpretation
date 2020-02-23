package fr.unice.polytech.si5.smarthome.am.k3dsa;

import fr.unice.polytech.si5.smarthome.am.k3dsa.HomeAspectHomeAspectProperties;
import fr.unice.polytech.si5.smarthome.am.smart_home.Home;
import java.util.Map;

@SuppressWarnings("all")
public class HomeAspectHomeAspectContext {
  public final static HomeAspectHomeAspectContext INSTANCE = new HomeAspectHomeAspectContext();
  
  public static HomeAspectHomeAspectProperties getSelf(final Home _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.unice.polytech.si5.smarthome.am.k3dsa.HomeAspectHomeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Home, HomeAspectHomeAspectProperties> map = new java.util.WeakHashMap<fr.unice.polytech.si5.smarthome.am.smart_home.Home, fr.unice.polytech.si5.smarthome.am.k3dsa.HomeAspectHomeAspectProperties>();
  
  public Map<Home, HomeAspectHomeAspectProperties> getMap() {
    return map;
  }
}
