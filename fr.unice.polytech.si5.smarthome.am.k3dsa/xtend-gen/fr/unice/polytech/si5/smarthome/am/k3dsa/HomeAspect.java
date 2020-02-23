package fr.unice.polytech.si5.smarthome.am.k3dsa;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.unice.polytech.si5.smarthome.am.k3dsa.ABarrierAspect;
import fr.unice.polytech.si5.smarthome.am.k3dsa.AbstractOccurence;
import fr.unice.polytech.si5.smarthome.am.k3dsa.HomeAspectHomeAspectProperties;
import fr.unice.polytech.si5.smarthome.am.k3dsa.OccurenceAspect;
import fr.unice.polytech.si5.smarthome.am.smart_home.ABarrier;
import fr.unice.polytech.si5.smarthome.am.smart_home.Action;
import fr.unice.polytech.si5.smarthome.am.smart_home.Home;
import fr.unice.polytech.si5.smarthome.am.smart_home.Occurence;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * Sample aspect that gives java.io.File the ability to store Text content and save it to disk
 */
@Aspect(className = Home.class)
@SuppressWarnings("all")
public class HomeAspect {
  @Main
  public static void execute(final Home _self) {
    final fr.unice.polytech.si5.smarthome.am.k3dsa.HomeAspectHomeAspectProperties _self_ = fr.unice.polytech.si5.smarthome.am.k3dsa.HomeAspectHomeAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void execute()
    if (_self instanceof fr.unice.polytech.si5.smarthome.am.smart_home.Home){
    	fr.unice.polytech.si5.smarthome.am.k3dsa.HomeAspect._privk3_execute(_self_, (fr.unice.polytech.si5.smarthome.am.smart_home.Home)_self);
    };
  }
  
  private static void prepareOccurences(final Home _self) {
    final fr.unice.polytech.si5.smarthome.am.k3dsa.HomeAspectHomeAspectProperties _self_ = fr.unice.polytech.si5.smarthome.am.k3dsa.HomeAspectHomeAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void prepareOccurences()
    if (_self instanceof fr.unice.polytech.si5.smarthome.am.smart_home.Home){
    	fr.unice.polytech.si5.smarthome.am.k3dsa.HomeAspect._privk3_prepareOccurences(_self_, (fr.unice.polytech.si5.smarthome.am.smart_home.Home)_self);
    };
  }
  
  private static void loop(final Home _self) {
    final fr.unice.polytech.si5.smarthome.am.k3dsa.HomeAspectHomeAspectProperties _self_ = fr.unice.polytech.si5.smarthome.am.k3dsa.HomeAspectHomeAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void loop()
    if (_self instanceof fr.unice.polytech.si5.smarthome.am.smart_home.Home){
    	fr.unice.polytech.si5.smarthome.am.k3dsa.HomeAspect._privk3_loop(_self_, (fr.unice.polytech.si5.smarthome.am.smart_home.Home)_self);
    };
  }
  
  private static void tick(final Home _self) {
    final fr.unice.polytech.si5.smarthome.am.k3dsa.HomeAspectHomeAspectProperties _self_ = fr.unice.polytech.si5.smarthome.am.k3dsa.HomeAspectHomeAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void tick()
    if (_self instanceof fr.unice.polytech.si5.smarthome.am.smart_home.Home){
    	fr.unice.polytech.si5.smarthome.am.k3dsa.HomeAspect._privk3_tick(_self_, (fr.unice.polytech.si5.smarthome.am.smart_home.Home)_self);
    };
  }
  
  public static void addPendingEvent(final Home _self, final AbstractOccurence occurence) {
    final fr.unice.polytech.si5.smarthome.am.k3dsa.HomeAspectHomeAspectProperties _self_ = fr.unice.polytech.si5.smarthome.am.k3dsa.HomeAspectHomeAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void addPendingEvent(AbstractOccurence)
    if (_self instanceof fr.unice.polytech.si5.smarthome.am.smart_home.Home){
    	fr.unice.polytech.si5.smarthome.am.k3dsa.HomeAspect._privk3_addPendingEvent(_self_, (fr.unice.polytech.si5.smarthome.am.smart_home.Home)_self,occurence);
    };
  }
  
  @Step
  public static void addNewOccurenceOfAction(final Home _self, final Action action, final Integer timestamp) {
    final fr.unice.polytech.si5.smarthome.am.k3dsa.HomeAspectHomeAspectProperties _self_ = fr.unice.polytech.si5.smarthome.am.k3dsa.HomeAspectHomeAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void addNewOccurenceOfAction(Action,Integer)
    if (_self instanceof fr.unice.polytech.si5.smarthome.am.smart_home.Home){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			fr.unice.polytech.si5.smarthome.am.k3dsa.HomeAspect._privk3_addNewOccurenceOfAction(_self_, (fr.unice.polytech.si5.smarthome.am.smart_home.Home)_self,action,timestamp);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {action,timestamp}, command, "Home", "addNewOccurenceOfAction");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  public static Integer wichTime(final Home _self) {
    final fr.unice.polytech.si5.smarthome.am.k3dsa.HomeAspectHomeAspectProperties _self_ = fr.unice.polytech.si5.smarthome.am.k3dsa.HomeAspectHomeAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Integer wichTime()
    if (_self instanceof fr.unice.polytech.si5.smarthome.am.smart_home.Home){
    	result = fr.unice.polytech.si5.smarthome.am.k3dsa.HomeAspect._privk3_wichTime(_self_, (fr.unice.polytech.si5.smarthome.am.smart_home.Home)_self);
    };
    return (java.lang.Integer)result;
  }
  
  public static Integer curtime(final Home _self) {
    final fr.unice.polytech.si5.smarthome.am.k3dsa.HomeAspectHomeAspectProperties _self_ = fr.unice.polytech.si5.smarthome.am.k3dsa.HomeAspectHomeAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Integer curtime()
    if (_self instanceof fr.unice.polytech.si5.smarthome.am.smart_home.Home){
    	result = fr.unice.polytech.si5.smarthome.am.k3dsa.HomeAspect._privk3_curtime(_self_, (fr.unice.polytech.si5.smarthome.am.smart_home.Home)_self);
    };
    return (java.lang.Integer)result;
  }
  
  public static void curtime(final Home _self, final Integer curtime) {
    final fr.unice.polytech.si5.smarthome.am.k3dsa.HomeAspectHomeAspectProperties _self_ = fr.unice.polytech.si5.smarthome.am.k3dsa.HomeAspectHomeAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void curtime(Integer)
    if (_self instanceof fr.unice.polytech.si5.smarthome.am.smart_home.Home){
    	fr.unice.polytech.si5.smarthome.am.k3dsa.HomeAspect._privk3_curtime(_self_, (fr.unice.polytech.si5.smarthome.am.smart_home.Home)_self,curtime);
    };
  }
  
  public static Queue<AbstractOccurence> pendingEvents(final Home _self) {
    final fr.unice.polytech.si5.smarthome.am.k3dsa.HomeAspectHomeAspectProperties _self_ = fr.unice.polytech.si5.smarthome.am.k3dsa.HomeAspectHomeAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Queue<AbstractOccurence> pendingEvents()
    if (_self instanceof fr.unice.polytech.si5.smarthome.am.smart_home.Home){
    	result = fr.unice.polytech.si5.smarthome.am.k3dsa.HomeAspect._privk3_pendingEvents(_self_, (fr.unice.polytech.si5.smarthome.am.smart_home.Home)_self);
    };
    return (java.util.Queue<fr.unice.polytech.si5.smarthome.am.k3dsa.AbstractOccurence>)result;
  }
  
  public static void pendingEvents(final Home _self, final Queue<AbstractOccurence> pendingEvents) {
    final fr.unice.polytech.si5.smarthome.am.k3dsa.HomeAspectHomeAspectProperties _self_ = fr.unice.polytech.si5.smarthome.am.k3dsa.HomeAspectHomeAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void pendingEvents(Queue<AbstractOccurence>)
    if (_self instanceof fr.unice.polytech.si5.smarthome.am.smart_home.Home){
    	fr.unice.polytech.si5.smarthome.am.k3dsa.HomeAspect._privk3_pendingEvents(_self_, (fr.unice.polytech.si5.smarthome.am.smart_home.Home)_self,pendingEvents);
    };
  }
  
  protected static void _privk3_execute(final HomeAspectHomeAspectProperties _self_, final Home _self) {
    HomeAspect.curtime(_self, Integer.valueOf(0));
    LinkedList<AbstractOccurence> _linkedList = new LinkedList<AbstractOccurence>();
    HomeAspect.pendingEvents(_self, _linkedList);
    HomeAspect.prepareOccurences(_self);
    HomeAspect.loop(_self);
  }
  
  protected static void _privk3_prepareOccurences(final HomeAspectHomeAspectProperties _self_, final Home _self) {
    EList<Occurence> _ownedOccurences = _self.getOwnedOccurences();
    for (final Occurence occurence : _ownedOccurences) {
      {
        AbstractOccurence o = OccurenceAspect.toAbstractOccurence(occurence);
        HomeAspect.pendingEvents(_self).add(o);
      }
    }
    final Function1<AbstractOccurence, Integer> _function = (AbstractOccurence it) -> {
      return it.timestamp;
    };
    IterableExtensions.<AbstractOccurence, Integer>sortBy(HomeAspect.pendingEvents(_self), _function);
  }
  
  protected static void _privk3_loop(final HomeAspectHomeAspectProperties _self_, final Home _self) {
    {
      Integer _curtime = HomeAspect.curtime(_self);
      boolean _lessThan = ((_curtime).intValue() < ((24 * 60) * 60));
      boolean _while = _lessThan;
      while (_while) {
        HomeAspect.tick(_self);
        Integer _curtime_1 = HomeAspect.curtime(_self);
        int _plus = ((_curtime_1).intValue() + 1);
        HomeAspect.curtime(_self, Integer.valueOf(_plus));
        Integer _curtime_2 = HomeAspect.curtime(_self);
        boolean _lessThan_1 = ((_curtime_2).intValue() < ((24 * 60) * 60));
        _while = _lessThan_1;
      }
    }
    HomeAspect.curtime(_self, Integer.valueOf(0));
  }
  
  protected static void _privk3_tick(final HomeAspectHomeAspectProperties _self_, final Home _self) {
    while (((HomeAspect.pendingEvents(_self).peek() != null) && Objects.equal(HomeAspect.pendingEvents(_self).peek().timestamp, HomeAspect.curtime(_self)))) {
      HomeAspect.pendingEvents(_self).poll().happenNow(_self);
    }
    EList<ABarrier> _ownedBarrier = _self.getOwnedBarrier();
    for (final ABarrier barrier : _ownedBarrier) {
      ABarrierAspect.tryTrigger(barrier, null);
    }
  }
  
  protected static void _privk3_addPendingEvent(final HomeAspectHomeAspectProperties _self_, final Home _self, final AbstractOccurence occurence) {
    HomeAspect.pendingEvents(_self).add(occurence);
    final Function1<AbstractOccurence, Integer> _function = (AbstractOccurence it) -> {
      return it.timestamp;
    };
    List<AbstractOccurence> _sortBy = IterableExtensions.<AbstractOccurence, Integer>sortBy(HomeAspect.pendingEvents(_self), _function);
    LinkedList<AbstractOccurence> _linkedList = new LinkedList<AbstractOccurence>(_sortBy);
    HomeAspect.pendingEvents(_self, _linkedList);
    InputOutput.<Queue<AbstractOccurence>>println(HomeAspect.pendingEvents(_self));
  }
  
  protected static void _privk3_addNewOccurenceOfAction(final HomeAspectHomeAspectProperties _self_, final Home _self, final Action action, final Integer timestamp) {
    final AbstractOccurence occurence = new AbstractOccurence(timestamp, action, null);
    HomeAspect.addPendingEvent(_self, occurence);
  }
  
  protected static Integer _privk3_wichTime(final HomeAspectHomeAspectProperties _self_, final Home _self) {
    return HomeAspect.curtime(_self);
  }
  
  protected static Integer _privk3_curtime(final HomeAspectHomeAspectProperties _self_, final Home _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurtime") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.Integer) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.curtime;
  }
  
  protected static void _privk3_curtime(final HomeAspectHomeAspectProperties _self_, final Home _self, final Integer curtime) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setCurtime")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, curtime);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.curtime = curtime;
    }
  }
  
  protected static Queue<AbstractOccurence> _privk3_pendingEvents(final HomeAspectHomeAspectProperties _self_, final Home _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getPendingEvents") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.util.Queue) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.pendingEvents;
  }
  
  protected static void _privk3_pendingEvents(final HomeAspectHomeAspectProperties _self_, final Home _self, final Queue<AbstractOccurence> pendingEvents) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setPendingEvents")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, pendingEvents);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.pendingEvents = pendingEvents;
    }
  }
}
