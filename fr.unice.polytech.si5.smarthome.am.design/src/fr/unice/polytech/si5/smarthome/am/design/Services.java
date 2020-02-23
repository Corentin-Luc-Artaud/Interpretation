package fr.unice.polytech.si5.smarthome.am.design;

import fr.unice.polytech.si5.smarthome.am.k3dsa.AbstractOccurence;
import fr.unice.polytech.si5.smarthome.am.smart_home.Action;
import fr.unice.polytech.si5.smarthome.am.smart_home.Home;
import fr.unice.polytech.si5.smarthome.am.smart_home.Subject;

import java.util.Iterator;
import java.util.Queue;

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
    
    static boolean FIRST = true;
    public String pendingEventList(Home home) {
    	System.out.println("Pending events");
    	if(home == null || FIRST) {
    		FIRST = false;
    		return "Empty";
    	}
    	Queue<AbstractOccurence> pendingEvents = ShomeRTDAccessor.getpendingEvents(home);
    	if(pendingEvents == null) return "Empty";
    	
    	StringBuilder stringBuilder = new StringBuilder();
    	
    	for (AbstractOccurence event: pendingEvents) {
    		stringBuilder.append("\n ____________ \n");
			stringBuilder.append(" Event : " + event.action.getName());
			if(event.actor != null) stringBuilder.append(" triggered by " + event.actor.getName());
			stringBuilder.append("\n");
		}
    	return stringBuilder.toString();
    }
}
