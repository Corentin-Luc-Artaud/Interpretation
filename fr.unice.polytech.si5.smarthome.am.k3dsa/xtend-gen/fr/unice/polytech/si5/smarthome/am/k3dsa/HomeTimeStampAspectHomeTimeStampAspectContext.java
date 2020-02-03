package fr.unice.polytech.si5.smarthome.am.k3dsa;

import fr.unice.polytech.si5.smarthome.am.k3dsa.HomeTimeStampAspectHomeTimeStampAspectProperties;
import fr.unice.polytech.si5.smarthome.am.smart_home.HomeTimeStamp;
import java.util.Map;

@SuppressWarnings("all")
public class HomeTimeStampAspectHomeTimeStampAspectContext {
  public final static HomeTimeStampAspectHomeTimeStampAspectContext INSTANCE = new HomeTimeStampAspectHomeTimeStampAspectContext();
  
  public static HomeTimeStampAspectHomeTimeStampAspectProperties getSelf(final HomeTimeStamp _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.unice.polytech.si5.smarthome.am.k3dsa.HomeTimeStampAspectHomeTimeStampAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<HomeTimeStamp, HomeTimeStampAspectHomeTimeStampAspectProperties> map = new java.util.WeakHashMap<fr.unice.polytech.si5.smarthome.am.smart_home.HomeTimeStamp, fr.unice.polytech.si5.smarthome.am.k3dsa.HomeTimeStampAspectHomeTimeStampAspectProperties>();
  
  public Map<HomeTimeStamp, HomeTimeStampAspectHomeTimeStampAspectProperties> getMap() {
    return map;
  }
}
