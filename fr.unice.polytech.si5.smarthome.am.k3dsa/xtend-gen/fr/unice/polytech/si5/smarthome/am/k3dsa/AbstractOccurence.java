package fr.unice.polytech.si5.smarthome.am.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.unice.polytech.si5.smarthome.am.k3dsa.ABarrierAspect;
import fr.unice.polytech.si5.smarthome.am.k3dsa.SubjectAspect;
import fr.unice.polytech.si5.smarthome.am.smart_home.ABarrier;
import fr.unice.polytech.si5.smarthome.am.smart_home.Action;
import fr.unice.polytech.si5.smarthome.am.smart_home.Actor;
import fr.unice.polytech.si5.smarthome.am.smart_home.Home;
import fr.unice.polytech.si5.smarthome.am.smart_home.Subject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
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
    EObject _eContainer = this.action.eContainer();
    SubjectAspect.occur(((Subject) _eContainer), this);
    EList<ABarrier> _ownedBarrier = home.getOwnedBarrier();
    for (final ABarrier barrier : _ownedBarrier) {
      ABarrierAspect.tryTrigger(barrier, this);
    }
  }
  
  @Override
  public String toString() {
    return ((((("{ " + this.action) + " ") + this.timestamp) + " ") + " }");
  }
}
