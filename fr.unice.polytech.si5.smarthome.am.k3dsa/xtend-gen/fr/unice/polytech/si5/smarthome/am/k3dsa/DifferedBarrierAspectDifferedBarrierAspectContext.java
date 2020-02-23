package fr.unice.polytech.si5.smarthome.am.k3dsa;

import fr.unice.polytech.si5.smarthome.am.k3dsa.DifferedBarrierAspectDifferedBarrierAspectProperties;
import fr.unice.polytech.si5.smarthome.am.smart_home.DifferedBarrier;
import java.util.Map;

@SuppressWarnings("all")
public class DifferedBarrierAspectDifferedBarrierAspectContext {
  public final static DifferedBarrierAspectDifferedBarrierAspectContext INSTANCE = new DifferedBarrierAspectDifferedBarrierAspectContext();
  
  public static DifferedBarrierAspectDifferedBarrierAspectProperties getSelf(final DifferedBarrier _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.unice.polytech.si5.smarthome.am.k3dsa.DifferedBarrierAspectDifferedBarrierAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<DifferedBarrier, DifferedBarrierAspectDifferedBarrierAspectProperties> map = new java.util.WeakHashMap<fr.unice.polytech.si5.smarthome.am.smart_home.DifferedBarrier, fr.unice.polytech.si5.smarthome.am.k3dsa.DifferedBarrierAspectDifferedBarrierAspectProperties>();
  
  public Map<DifferedBarrier, DifferedBarrierAspectDifferedBarrierAspectProperties> getMap() {
    return map;
  }
}
