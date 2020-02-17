package fr.unice.polytech.si5.smarthome.am.k3dsa;

import fr.unice.polytech.si5.smarthome.am.k3dsa.AConditionAspectAConditionAspectProperties;
import fr.unice.polytech.si5.smarthome.am.smart_home.ACondition;
import java.util.Map;

@SuppressWarnings("all")
public class AConditionAspectAConditionAspectContext {
  public final static AConditionAspectAConditionAspectContext INSTANCE = new AConditionAspectAConditionAspectContext();
  
  public static AConditionAspectAConditionAspectProperties getSelf(final ACondition _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.unice.polytech.si5.smarthome.am.k3dsa.AConditionAspectAConditionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ACondition, AConditionAspectAConditionAspectProperties> map = new java.util.WeakHashMap<fr.unice.polytech.si5.smarthome.am.smart_home.ACondition, fr.unice.polytech.si5.smarthome.am.k3dsa.AConditionAspectAConditionAspectProperties>();
  
  public Map<ACondition, AConditionAspectAConditionAspectProperties> getMap() {
    return map;
  }
}
