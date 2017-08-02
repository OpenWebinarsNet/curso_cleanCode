package io.pello.refactorings.introducenullobject.refactored;

/**
 * Introduce null object This class is intended to be used as a refactoring
 * playground
 * 
 * @author PELLO_ALTADILL
 */
public class Warrior {
	private Weapon weapon;

	public Warrior(Weapon weapon) {
		this.weapon = weapon;
	}

	public int attack() {
		return 2 + weapon.getDamage();
	}
}
