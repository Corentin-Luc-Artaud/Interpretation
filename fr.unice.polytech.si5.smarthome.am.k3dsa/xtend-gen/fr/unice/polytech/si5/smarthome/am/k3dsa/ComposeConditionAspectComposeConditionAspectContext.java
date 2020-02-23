package fr.unice.polytech.si5.smarthome.am.k3dsa;

import fr.unice.polytech.si5.smarthome.am.k3dsa.ComposeConditionAspectComposeConditionAspectProperties;
import fr.unice.polytech.si5.smarthome.am.smart_home.ComposeCondition;
import java.util.Map;

@SuppressWarnings("all")
public class ComposeConditionAspectComposeConditionAspectContext {
  public final static ComposeConditionAspectComposeConditionAspectContext INSTANCE = new ComposeConditionAspectComposeConditionAspectContext();
  
  public static ComposeConditionAspectComposeConditionAspectProperties getSelf(final ComposeCondition _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.unice.polytech.si5.smarthome.am.k3dsa.ComposeConditionAspectComposeConditionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ComposeCondition, ComposeConditionAspectComposeConditionAspectProperties> map = new java.util.WeakHashMap<fr.unice.polytech.si5.smarthome.am.smart_home.ComposeCondition, fr.unice.polytech.si5.smarthome.am.k3dsa.ComposeConditionAspectComposeConditionAspectProperties>();
  
  public Map<ComposeCondition, ComposeConditionAspectComposeConditionAspectProperties> getMap() {
    return map;
  }
}
