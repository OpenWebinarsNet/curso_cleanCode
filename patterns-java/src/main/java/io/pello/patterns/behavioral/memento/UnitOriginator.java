package io.pello.patterns.behavioral.memento;

import io.pello.patterns.creational.abstractfactory.Weapon;

/**
 * Represents a unit of an army
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class UnitOriginator {
	private String name;
	private int life;
	private String range;
	private Weapon weapon;
	private State state;
	
	public UnitOriginator(String name, int life, String range, Weapon weapon) {
		this.name = name;
		this.life = life;
		this.range = range;
		this.weapon = weapon;
	}

	public UnitMemento createMemento () {
		State state = new State();
		
		state.setLife(this.life);
		state.setRange(this.range);
		state.setWeapon(this.weapon);
		
		UnitMemento memento = new UnitMemento();
		memento.saveState(state);
		
		return memento;
	}
	

	public void setUnitMemento (UnitMemento unitMemento) {
		this.state = unitMemento.getState();

		life = state.getLife();
		range = state.getRange();
		weapon = state.getWeapon();
	}
	
	// getters/setters...

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public String getRange() {
		return range;
	}

	public void setRange(String range) {
		this.range = range;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	@Override
	public String toString() {
		return "UnitOriginator [name=" + name + ", life=" + life + ", range=" + range + ", weapon=" + weapon + "]";
	}


}
