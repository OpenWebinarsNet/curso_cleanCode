package io.pello.patterns.behavioral.memento;

import io.pello.patterns.creational.abstractfactory.Weapon;

/**
 * stores Unit data for the momento class
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class State {
	private int life;
	private String range;
	private Weapon weapon;
	
	// getters/setters...
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
		return "State [life=" + life + ", range=" + range + ", weapon=" + weapon + "]";
	}
	
	
}
