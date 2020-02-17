package fr.unice.polytech.si5.smarthome.am.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.unice.polytech.si5.smarthome.am.k3dsa.AConditionAspect;
import fr.unice.polytech.si5.smarthome.am.smart_home.ACondition;
import fr.unice.polytech.si5.smarthome.am.smart_home.Action;
import fr.unice.polytech.si5.smarthome.am.smart_home.Actor;
import fr.unice.polytech.si5.smarthome.am.smart_home.Home;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class AbstractOccurence {
  public Integer timestamp;
  
  public Actor actor;
  
  public Action action;
  
  public AbstractOccurence(final Integer timestamp, final Action action, final Actor actor) {
    this.timestamp = timestamp;
    this.action = action;
    this.actor = actor;
  }
  
  @Step
  public void happenNow(final Home home) {
    String _name = this.action.getName();
    String _plus = ((("" + this.timestamp) + " : ") + _name);
    InputOutput.<String>println(_plus);
    EList<ACondition> _ownedConditions = home.getOwnedConditions();
    for (final ACondition condition : _ownedConditions) {
      AConditionAspect.tryTrigger(condition, this);
    }
  }
  
  @Override
  public String toString() {
    return ((((("{ " + this.action) + " ") + this.timestamp) + " ") + " }");
  }
}
