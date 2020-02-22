package fr.unice.polytech.si5.smarthome.am.design;

import fr.unice.polytech.si5.smarthome.am.smart_home.Action;
import fr.unice.polytech.si5.smarthome.am.smart_home.Home;
import fr.unice.polytech.si5.smarthome.am.smart_home.Subject;

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
    
    public boolean magicPrint(EObject self, Subject s) {
    	Action act = (Action)self;
    	if(s.getLastAction() == null) return false;
    	return act.getName().equals(s.getLastAction().getName());
    }
    
    public String getCurrentTime(Home home) {
    	int seconds = Integer.parseInt(home.getInitialTime());
    	int minutes = seconds/60;
    	int remainingSeconds = seconds%60;
    	int remainingMinutes = minutes%60;
    	int hour = minutes/60;
    	System.out.println("Hour : " + hour + " Minutes : " + remainingMinutes + " Seconds : " + remainingSeconds);
    	return "Current time : " + hour + ":" + remainingMinutes + ":" + remainingSeconds;
    }
}
