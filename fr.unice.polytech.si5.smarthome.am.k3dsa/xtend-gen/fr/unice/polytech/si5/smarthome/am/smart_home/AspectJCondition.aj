// AspectJ classes that have been aspectized and name
package fr.unice.polytech.si5.smarthome.am.smart_home;
public aspect AspectJCondition{
void around (fr.unice.polytech.si5.smarthome.am.smart_home.Condition self)  :target (self) && (call ( void fr.unice.polytech.si5.smarthome.am.smart_home.Condition.tryTrigger( fr.unice.polytech.si5.smarthome.am.k3dsa.AbstractOccurence ) ) ) { fr.unice.polytech.si5.smarthome.am.k3dsa.ConditionAspect.tryTrigger(self,(fr.unice.polytech.si5.smarthome.am.k3dsa.AbstractOccurence)thisJoinPoint.getArgs()[0] );}

}
