package fr.unice.polytech.si5.smarthome.am.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.unice.polytech.si5.smarthome.am.k3dsa.ActionAspectActionAspectProperties;
import fr.unice.polytech.si5.smarthome.am.smart_home.Action;
import fr.unice.polytech.si5.smarthome.am.smart_home.Subject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = Action.class)
@SuppressWarnings("all")
public class ActionAspect {
  @Step
  public static void trigger(final Action _self, final Integer time) {
    final fr.unice.polytech.si5.smarthome.am.k3dsa.ActionAspectActionAspectProperties _self_ = fr.unice.polytech.si5.smarthome.am.k3dsa.ActionAspectActionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void trigger(Integer)
    if (_self instanceof fr.unice.polytech.si5.smarthome.am.smart_home.Action){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			fr.unice.polytech.si5.smarthome.am.k3dsa.ActionAspect._privk3_trigger(_self_, (fr.unice.polytech.si5.smarthome.am.smart_home.Action)_self,time);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {time}, command, "Action", "trigger");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_trigger(final ActionAspectActionAspectProperties _self_, final Action _self, final Integer time) {
    String _name = _self.getName();
    String _plus = ((("" + time) + " -> ") + _name);
    String _plus_1 = (_plus + " triggered");
    InputOutput.<String>println(_plus_1);
    EObject _eContainer = _self.eContainer();
    ((Subject) _eContainer).setLastAction(_self);
  }
}
