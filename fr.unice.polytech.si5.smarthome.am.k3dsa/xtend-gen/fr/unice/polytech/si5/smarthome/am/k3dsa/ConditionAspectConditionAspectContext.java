package fr.unice.polytech.si5.smarthome.am.k3dsa;

import fr.unice.polytech.si5.smarthome.am.k3dsa.ConditionAspectConditionAspectProperties;
import fr.unice.polytech.si5.smarthome.am.smart_home.Condition;
import java.util.Map;

@SuppressWarnings("all")
public class ConditionAspectConditionAspectContext {
  public final static ConditionAspectConditionAspectContext INSTANCE = new ConditionAspectConditionAspectContext();
  
  public static ConditionAspectConditionAspectProperties getSelf(final Condition _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.unice.polytech.si5.smarthome.am.k3dsa.ConditionAspectConditionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Condition, ConditionAspectConditionAspectProperties> map = new java.util.WeakHashMap<fr.unice.polytech.si5.smarthome.am.smart_home.Condition, fr.unice.polytech.si5.smarthome.am.k3dsa.ConditionAspectConditionAspectProperties>();
  
  public Map<Condition, ConditionAspectConditionAspectProperties> getMap() {
    return map;
  }
}
