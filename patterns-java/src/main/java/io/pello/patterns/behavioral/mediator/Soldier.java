package io.pello.patterns.behavioral.mediator;

import io.pello.patterns.creational.singleton.Die;

/**
 * Represent a single soldier
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class Soldier extends Unit {

	public Soldier(String name, String range, Mediator mediator) {
		super(name, range, mediator);
	}

	@Override
	public void receiveOrder (Command command) {
		System.out.println(name + ": Order received> " + command.getMsg());
	}
	
	public void move (int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println(name + ": Move Order received> " + x  + ":" + y);
	}
	
	public int attack () {
		System.out.println(name + ": Attack Order received> ");
		return Die.getInstance().roll();
	}
	
	public void hold () {
		x = y = 0;
		System.out.println(name + ": Hold Order received> " + x  + ":" + y);
	}
}
