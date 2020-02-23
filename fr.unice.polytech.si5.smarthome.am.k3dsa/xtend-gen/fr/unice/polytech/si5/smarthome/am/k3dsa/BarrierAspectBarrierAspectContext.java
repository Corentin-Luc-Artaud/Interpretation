package fr.unice.polytech.si5.smarthome.am.k3dsa;

import fr.unice.polytech.si5.smarthome.am.k3dsa.BarrierAspectBarrierAspectProperties;
import fr.unice.polytech.si5.smarthome.am.smart_home.Barrier;
import java.util.Map;

@SuppressWarnings("all")
public class BarrierAspectBarrierAspectContext {
  public final static BarrierAspectBarrierAspectContext INSTANCE = new BarrierAspectBarrierAspectContext();
  
  public static BarrierAspectBarrierAspectProperties getSelf(final Barrier _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.unice.polytech.si5.smarthome.am.k3dsa.BarrierAspectBarrierAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Barrier, BarrierAspectBarrierAspectProperties> map = new java.util.WeakHashMap<fr.unice.polytech.si5.smarthome.am.smart_home.Barrier, fr.unice.polytech.si5.smarthome.am.k3dsa.BarrierAspectBarrierAspectProperties>();
  
  public Map<Barrier, BarrierAspectBarrierAspectProperties> getMap() {
    return map;
  }
}
