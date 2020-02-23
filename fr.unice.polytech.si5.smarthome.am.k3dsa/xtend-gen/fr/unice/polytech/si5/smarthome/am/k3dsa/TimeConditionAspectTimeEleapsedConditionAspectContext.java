package fr.unice.polytech.si5.smarthome.am.k3dsa;

import fr.unice.polytech.si5.smarthome.am.k3dsa.TimeConditionAspectTimeEleapsedConditionAspectProperties;
import fr.unice.polytech.si5.smarthome.am.smart_home.TimeEleapsedCondition;
import java.util.Map;

@SuppressWarnings("all")
public class TimeConditionAspectTimeEleapsedConditionAspectContext {
  public final static TimeConditionAspectTimeEleapsedConditionAspectContext INSTANCE = new TimeConditionAspectTimeEleapsedConditionAspectContext();
  
  public static TimeConditionAspectTimeEleapsedConditionAspectProperties getSelf(final TimeEleapsedCondition _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.unice.polytech.si5.smarthome.am.k3dsa.TimeConditionAspectTimeEleapsedConditionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<TimeEleapsedCondition, TimeConditionAspectTimeEleapsedConditionAspectProperties> map = new java.util.WeakHashMap<fr.unice.polytech.si5.smarthome.am.smart_home.TimeEleapsedCondition, fr.unice.polytech.si5.smarthome.am.k3dsa.TimeConditionAspectTimeEleapsedConditionAspectProperties>();
  
  public Map<TimeEleapsedCondition, TimeConditionAspectTimeEleapsedConditionAspectProperties> getMap() {
    return map;
  }
}
