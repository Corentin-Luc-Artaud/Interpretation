// AspectJ classes that have been aspectized and name
package fr.unice.polytech.si5.smarthome.am.smart_home;
public aspect AspectJTimeEleapsedCondition{
void around (fr.unice.polytech.si5.smarthome.am.smart_home.TimeEleapsedCondition self)  :target (self) && (call ( void fr.unice.polytech.si5.smarthome.am.smart_home.TimeEleapsedCondition.tryTrigger( fr.unice.polytech.si5.smarthome.am.k3dsa.AbstractOccurence ) ) ) { fr.unice.polytech.si5.smarthome.am.k3dsa.TimeConditionAspect.tryTrigger(self,(fr.unice.polytech.si5.smarthome.am.k3dsa.AbstractOccurence)thisJoinPoint.getArgs()[0] );}

}
