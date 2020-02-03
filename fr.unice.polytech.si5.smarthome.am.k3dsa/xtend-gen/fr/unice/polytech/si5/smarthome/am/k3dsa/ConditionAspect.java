package fr.unice.polytech.si5.smarthome.am.k3dsa;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.unice.polytech.si5.smarthome.am.k3dsa.ActionAspect;
import fr.unice.polytech.si5.smarthome.am.k3dsa.ConditionAspectConditionAspectProperties;
import fr.unice.polytech.si5.smarthome.am.k3dsa.HomeTimeStampAspect;
import fr.unice.polytech.si5.smarthome.am.smart_home.Action;
import fr.unice.polytech.si5.smarthome.am.smart_home.Condition;
import fr.unice.polytech.si5.smarthome.am.smart_home.Event;
import fr.unice.polytech.si5.smarthome.am.smart_home.Occurence;
import org.eclipse.emf.common.util.EList;

@Aspect(className = Condition.class)
@SuppressWarnings("all")
public class ConditionAspect {
  @Step
  public static void tryTrigger(final Condition _self, final Occurence occurence) {
    final fr.unice.polytech.si5.smarthome.am.k3dsa.ConditionAspectConditionAspectProperties _self_ = fr.unice.polytech.si5.smarthome.am.k3dsa.ConditionAspectConditionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void tryTrigger(Occurence)
    if (_self instanceof fr.unice.polytech.si5.smarthome.am.smart_home.Condition){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			fr.unice.polytech.si5.smarthome.am.k3dsa.ConditionAspect._privk3_tryTrigger(_self_, (fr.unice.polytech.si5.smarthome.am.smart_home.Condition)_self,occurence);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {occurence}, command, "Condition", "tryTrigger");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_tryTrigger(final ConditionAspectConditionAspectProperties _self_, final Condition _self, final Occurence occurence) {
    Event _event = occurence.getEvent();
    Event _event_1 = _self.getEvent();
    boolean _equals = Objects.equal(_event, _event_1);
    if (_equals) {
      EList<Action> _actions = _self.getActions();
      for (final Action a : _actions) {
        ActionAspect.trigger(a, HomeTimeStampAspect.toSec(occurence.getOwnedTime()));
      }
    }
  }
}
