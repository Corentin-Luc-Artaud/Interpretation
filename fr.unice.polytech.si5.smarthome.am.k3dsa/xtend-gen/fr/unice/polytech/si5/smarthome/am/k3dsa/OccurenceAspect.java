package fr.unice.polytech.si5.smarthome.am.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.unice.polytech.si5.smarthome.am.k3dsa.ConditionAspect;
import fr.unice.polytech.si5.smarthome.am.k3dsa.EventAspect;
import fr.unice.polytech.si5.smarthome.am.k3dsa.HomeTimeStampAspect;
import fr.unice.polytech.si5.smarthome.am.k3dsa.OccurenceAspectOccurenceAspectProperties;
import fr.unice.polytech.si5.smarthome.am.smart_home.Condition;
import fr.unice.polytech.si5.smarthome.am.smart_home.Home;
import fr.unice.polytech.si5.smarthome.am.smart_home.Occurence;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = Occurence.class)
@SuppressWarnings("all")
public class OccurenceAspect {
  @Step
  public static void happenNow(final Occurence _self, final Home home) {
    final fr.unice.polytech.si5.smarthome.am.k3dsa.OccurenceAspectOccurenceAspectProperties _self_ = fr.unice.polytech.si5.smarthome.am.k3dsa.OccurenceAspectOccurenceAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void happenNow(Home)
    if (_self instanceof fr.unice.polytech.si5.smarthome.am.smart_home.Occurence){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			fr.unice.polytech.si5.smarthome.am.k3dsa.OccurenceAspect._privk3_happenNow(_self_, (fr.unice.polytech.si5.smarthome.am.smart_home.Occurence)_self,home);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {home}, command, "Occurence", "happenNow");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_happenNow(final OccurenceAspectOccurenceAspectProperties _self_, final Occurence _self, final Home home) {
    Integer _sec = HomeTimeStampAspect.toSec(_self.getOwnedTime());
    String _plus = ("" + _sec);
    String _plus_1 = (_plus + " : ");
    String _description = EventAspect.description(_self.getEvent());
    String _plus_2 = (_plus_1 + _description);
    InputOutput.<String>println(_plus_2);
    EList<Condition> _ownedConditions = home.getOwnedConditions();
    for (final Condition condition : _ownedConditions) {
      ConditionAspect.tryTrigger(condition, _self);
    }
  }
}
