package fr.unice.polytech.si5.smarthome.am.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.unice.polytech.si5.smarthome.am.k3dsa.OccurenceAspectOccurenceAspectProperties;
import fr.unice.polytech.si5.smarthome.am.smart_home.Occurence;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = Occurence.class)
@SuppressWarnings("all")
public class OccurenceAspect {
  @Step
  public static void happenNow(final Occurence _self) {
    final fr.unice.polytech.si5.smarthome.am.k3dsa.OccurenceAspectOccurenceAspectProperties _self_ = fr.unice.polytech.si5.smarthome.am.k3dsa.OccurenceAspectOccurenceAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void happenNow()
    if (_self instanceof fr.unice.polytech.si5.smarthome.am.smart_home.Occurence){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			fr.unice.polytech.si5.smarthome.am.k3dsa.OccurenceAspect._privk3_happenNow(_self_, (fr.unice.polytech.si5.smarthome.am.smart_home.Occurence)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "Occurence", "happenNow");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_happenNow(final OccurenceAspectOccurenceAspectProperties _self_, final Occurence _self) {
    InputOutput.<String>println("something happen");
    InputOutput.<String>println(_self.getEvent().toString());
  }
}
