package io.pello.patterns.behavioral.mediator;

import java.util.Vector;


/**
 * Class that makes use of the iterator
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class MediatorClient {
	public static void main (String args[]) {
		Mediator mediator = new MediatorImpl();
		Vector<Unit> army = new Vector<Unit>();
		
 		army.add(new Soldier("u1","soldier",mediator));
 		army.add(new Soldier("u2","soldier",mediator));
 		army.add(new Soldier("u3","soldier",mediator));
 				
 		General general = new General("General", "general", mediator);
 		
 		general.giveOrder(new Command("Attack"), army.firstElement());
 		general.move(5, 7, army.firstElement());
	}
}