package fr.unice.polytech.si5.smarthome.am.k3dsa;

import fr.unice.polytech.si5.smarthome.am.k3dsa.ABarrierAspectABarrierAspectProperties;
import fr.unice.polytech.si5.smarthome.am.smart_home.ABarrier;
import java.util.Map;

@SuppressWarnings("all")
public class ABarrierAspectABarrierAspectContext {
  public final static ABarrierAspectABarrierAspectContext INSTANCE = new ABarrierAspectABarrierAspectContext();
  
  public static ABarrierAspectABarrierAspectProperties getSelf(final ABarrier _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.unice.polytech.si5.smarthome.am.k3dsa.ABarrierAspectABarrierAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ABarrier, ABarrierAspectABarrierAspectProperties> map = new java.util.WeakHashMap<fr.unice.polytech.si5.smarthome.am.smart_home.ABarrier, fr.unice.polytech.si5.smarthome.am.k3dsa.ABarrierAspectABarrierAspectProperties>();
  
  public Map<ABarrier, ABarrierAspectABarrierAspectProperties> getMap() {
    return map;
  }
}
