package fr.unice.polytech.si5.smarthome.am.k3dsa;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.unice.polytech.si5.smarthome.am.k3dsa.AConditionAspect;
import fr.unice.polytech.si5.smarthome.am.k3dsa.AbstractOccurence;
import fr.unice.polytech.si5.smarthome.am.k3dsa.ActionAspect;
import fr.unice.polytech.si5.smarthome.am.k3dsa.ConditionAspectConditionAspectProperties;
import fr.unice.polytech.si5.smarthome.am.k3dsa.HomeAspect;
import fr.unice.polytech.si5.smarthome.am.smart_home.Action;
import fr.unice.polytech.si5.smarthome.am.smart_home.Condition;
import fr.unice.polytech.si5.smarthome.am.smart_home.Home;
import fr.unice.polytech.si5.smarthome.am.smart_home.Subject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@Aspect(className = Condition.class)
@SuppressWarnings("all")
public class ConditionAspect extends AConditionAspect {
  @Step
  @OverrideAspectMethod
  public static void tryTrigger(final Condition _self, final AbstractOccurence occurence) {
    final fr.unice.polytech.si5.smarthome.am.k3dsa.ConditionAspectConditionAspectProperties _self_ = fr.unice.polytech.si5.smarthome.am.k3dsa.ConditionAspectConditionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void tryTrigger(AbstractOccurence)
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
  
  protected static void _privk3_tryTrigger(final ConditionAspectConditionAspectProperties _self_, final Condition _self, final AbstractOccurence occurence) {
    Action _action = _self.getAction();
    boolean _equals = Objects.equal(occurence.action, _action);
    if (_equals) {
      EObject _eContainer = _self.getAction().eContainer();
      ((Subject) _eContainer).setLastAction(occurence.action);
      EList<Action> _actions = _self.getActions();
      for (final Action a : _actions) {
        {
          ActionAspect.trigger(a, occurence.timestamp);
          EObject _eContainer_1 = _self.eContainer();
          HomeAspect.addNewOccurenceOfAction(((Home) _eContainer_1), a, occurence.timestamp);
        }
      }
    }
  }
}
