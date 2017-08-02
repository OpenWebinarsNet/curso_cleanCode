package io.pello.patterns.behavioral.interpreter;

import java.util.ArrayList;

/**
 * Client class to make use of the interpreter pattern example
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class InterpreterClient {
	public static void main (String args[]) {
		ArrayList<Order> orders = new ArrayList<Order>(); 
		
		orders.add(new Order(new Command("Move"),new Number(5)));
		orders.add(new Order(new Command("Attack"),new Item("enemy")));
		orders.add(new Order(new Command("Defend"),new Item("town")));
		
		for (Order order : orders) {
			System.out.println(order.interpret());
		}
	}
}
