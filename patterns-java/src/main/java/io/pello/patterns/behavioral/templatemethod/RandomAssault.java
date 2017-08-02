package io.pello.patterns.behavioral.templatemethod;

import io.pello.patterns.behavioral.command.Army;

/**
 * This class is an implementation  of the abstract class
 * Assault, so the template method will call these methods
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class RandomAssault extends Assault {

	public RandomAssault(Army army1, Army army2) {
		super(army1, army2);
	}

	@Override
	public void init(Army army) {
		army.setTotalLife(20);
	}

	@Override
	public int attack(Army army) {
		return army.attack();
	}

	@Override
	public void defend(Army army, int attack) {
		army.setTotalLife(army.getTotalLife() - (attack - army.defend()));
	}

	@Override
	public boolean unitsAlive(Army army) {
		return (army.getTotalLife() > 0);
	}

	@Override
	public String outcome(Army army1, Army army2) {
		return "1:" + army1.toString() + " 2:" + army2.toString();
	}
}
