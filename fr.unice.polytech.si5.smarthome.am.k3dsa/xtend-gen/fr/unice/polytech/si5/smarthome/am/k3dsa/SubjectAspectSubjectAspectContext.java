package fr.unice.polytech.si5.smarthome.am.k3dsa;

import fr.unice.polytech.si5.smarthome.am.k3dsa.SubjectAspectSubjectAspectProperties;
import fr.unice.polytech.si5.smarthome.am.smart_home.Subject;
import java.util.Map;

@SuppressWarnings("all")
public class SubjectAspectSubjectAspectContext {
  public final static SubjectAspectSubjectAspectContext INSTANCE = new SubjectAspectSubjectAspectContext();
  
  public static SubjectAspectSubjectAspectProperties getSelf(final Subject _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.unice.polytech.si5.smarthome.am.k3dsa.SubjectAspectSubjectAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Subject, SubjectAspectSubjectAspectProperties> map = new java.util.WeakHashMap<fr.unice.polytech.si5.smarthome.am.smart_home.Subject, fr.unice.polytech.si5.smarthome.am.k3dsa.SubjectAspectSubjectAspectProperties>();
  
  public Map<Subject, SubjectAspectSubjectAspectProperties> getMap() {
    return map;
  }
}
