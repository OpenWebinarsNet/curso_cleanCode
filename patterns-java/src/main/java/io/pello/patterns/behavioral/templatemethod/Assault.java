package io.pello.patterns.behavioral.templatemethod;

import io.pello.patterns.behavioral.command.Army;

/**
 * Class with a template method to define
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public abstract class Assault {
	private Army army1;
	private Army army2;
	
	public Assault(Army army1, Army army2) {
		this.army1 = army1;
		this.army2 = army2;
	}
	
	public abstract void init(Army army);
	public abstract int attack(Army army);
	public abstract void defend(Army army, int attack);
	public abstract boolean unitsAlive(Army army);
	public abstract String outcome(Army army1, Army army2);
	
	// TEMPLATE METHOD
	public String assault() {
		init(army1);
		init(army2);
		
		do {
			defend(army2,attack(army1));
			defend(army1,attack(army2));
		} while (unitsAlive(army1) && unitsAlive(army2));
		
		return outcome(army1, army2);
	}
}
