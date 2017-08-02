package io.pello.patterns.behavioral.mediator;

import io.pello.patterns.creational.singleton.Die;
/**
 * Represent a unit in the army
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public abstract class Unit {
	protected String name;
	protected String range;
	protected int x;
	protected int y;
	protected Mediator mediator;
	

	public Unit(String name, String range, Mediator mediator) {
		this.name = name;
		this.range = range;
		x = y = 0;
		this.mediator = mediator;
	}
	
	public void receiveOrder (Command command) {
		System.out.println("Order received> " + command.getMsg());
	}
	
	public void move (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int attack () {
		return Die.getInstance().roll();
	}
	
	public void hold () {
		x = y = 0;
	}
	
	// getters/setters ...
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getRange() {
		return range;
	}

	public void setRange(String range) {
		this.range = range;
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
