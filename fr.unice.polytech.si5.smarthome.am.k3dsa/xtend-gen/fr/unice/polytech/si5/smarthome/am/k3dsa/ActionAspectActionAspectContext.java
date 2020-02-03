package fr.unice.polytech.si5.smarthome.am.k3dsa;

import fr.unice.polytech.si5.smarthome.am.k3dsa.ActionAspectActionAspectProperties;
import fr.unice.polytech.si5.smarthome.am.smart_home.Action;
import java.util.Map;

@SuppressWarnings("all")
public class ActionAspectActionAspectContext {
  public final static ActionAspectActionAspectContext INSTANCE = new ActionAspectActionAspectContext();
  
  public static ActionAspectActionAspectProperties getSelf(final Action _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.unice.polytech.si5.smarthome.am.k3dsa.ActionAspectActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Action, ActionAspectActionAspectProperties> map = new java.util.WeakHashMap<fr.unice.polytech.si5.smarthome.am.smart_home.Action, fr.unice.polytech.si5.smarthome.am.k3dsa.ActionAspectActionAspectProperties>();
  
  public Map<Action, ActionAspectActionAspectProperties> getMap() {
    return map;
  }
}
