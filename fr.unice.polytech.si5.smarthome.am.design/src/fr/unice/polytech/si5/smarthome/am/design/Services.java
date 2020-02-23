package fr.unice.polytech.si5.smarthome.am.design;

import org.eclipse.emf.ecore.EObject;
import shome.xdsml.api.impl.ShomeRTDAccessor;

/**s
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public EObject myService(EObject self, String arg) {
       // TODO Auto-generated code
      return self;
    }
    
    public String getCurrentTime(EObject eObject) {
    	System.out.println("get current time");
    	Integer time = ShomeRTDAccessor.getcurtime(eObject);
    	System.out.println("time : " + time);
    	return (time != null ? time.toString() : "00:00:00");
    }
}
