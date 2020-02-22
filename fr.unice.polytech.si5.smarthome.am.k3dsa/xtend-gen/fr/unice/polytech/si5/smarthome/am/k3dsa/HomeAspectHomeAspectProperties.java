package fr.unice.polytech.si5.smarthome.am.k3dsa;

import fr.unice.polytech.si5.smarthome.am.k3dsa.AbstractOccurence;
import java.util.LinkedList;
import java.util.Queue;

@SuppressWarnings("all")
public class HomeAspectHomeAspectProperties {
  public Integer curtime = Integer.valueOf(0);
  
  public Queue<AbstractOccurence> pendingEvents = new LinkedList<AbstractOccurence>();
}
