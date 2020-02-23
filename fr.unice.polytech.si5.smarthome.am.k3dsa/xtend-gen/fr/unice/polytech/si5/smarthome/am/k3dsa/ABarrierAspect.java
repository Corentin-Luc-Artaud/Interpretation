package fr.unice.polytech.si5.smarthome.am.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.unice.polytech.si5.smarthome.am.k3dsa.ABarrierAspectABarrierAspectProperties;
import fr.unice.polytech.si5.smarthome.am.k3dsa.AbstractOccurence;
import fr.unice.polytech.si5.smarthome.am.smart_home.ABarrier;

@Aspect(className = ABarrier.class)
@SuppressWarnings("all")
public abstract class ABarrierAspect {
  @Abstract
  public static void tryTrigger(final ABarrier _self, final AbstractOccurence occurence) {
    final fr.unice.polytech.si5.smarthome.am.k3dsa.ABarrierAspectABarrierAspectProperties _self_ = fr.unice.polytech.si5.smarthome.am.k3dsa.ABarrierAspectABarrierAspectContext.getSelf(_self);
    	// BeginInjectInto fr.unice.polytech.si5.smarthome.am.k3dsa.ABarrierAspect#void tryTrigger(AbstractOccurence) from fr.unice.polytech.si5.smarthome.am.k3dsa.BarrierAspect
    		if (_self instanceof fr.unice.polytech.si5.smarthome.am.smart_home.Barrier){
    			fr.unice.polytech.si5.smarthome.am.k3dsa.BarrierAspect.tryTrigger((fr.unice.polytech.si5.smarthome.am.smart_home.Barrier)_self,occurence);
    		} else
    		// EndInjectInto fr.unice.polytech.si5.smarthome.am.k3dsa.ABarrierAspect#void tryTrigger(AbstractOccurence) from fr.unice.polytech.si5.smarthome.am.k3dsa.BarrierAspect
    	// BeginInjectInto fr.unice.polytech.si5.smarthome.am.k3dsa.ABarrierAspect#void tryTrigger(AbstractOccurence) from fr.unice.polytech.si5.smarthome.am.k3dsa.DifferedBarrierAspect
    		if (_self instanceof fr.unice.polytech.si5.smarthome.am.smart_home.DifferedBarrier){
    			fr.unice.polytech.si5.smarthome.am.k3dsa.DifferedBarrierAspect.tryTrigger((fr.unice.polytech.si5.smarthome.am.smart_home.DifferedBarrier)_self,occurence);
    		} else
    		// EndInjectInto fr.unice.polytech.si5.smarthome.am.k3dsa.ABarrierAspect#void tryTrigger(AbstractOccurence) from fr.unice.polytech.si5.smarthome.am.k3dsa.DifferedBarrierAspect
    // #DispatchPointCut_before# void tryTrigger(AbstractOccurence)
    if (_self instanceof fr.unice.polytech.si5.smarthome.am.smart_home.ABarrier){
    	fr.unice.polytech.si5.smarthome.am.k3dsa.ABarrierAspect._privk3_tryTrigger(_self_, (fr.unice.polytech.si5.smarthome.am.smart_home.ABarrier)_self,occurence);
    };
  }
  
  protected static void _privk3_tryTrigger(final ABarrierAspectABarrierAspectProperties _self_, final ABarrier _self, final AbstractOccurence occurence) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
