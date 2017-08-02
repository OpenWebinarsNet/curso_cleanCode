package io.pello.refactorings.introducenullobject;

public class Warrior {
	private Weapon weapon;

	public Warrior(Weapon weapon) {
		this.weapon = weapon;
	}

	public int attack() {
		int damage = 0;
		if (weapon == null) {
			damage = 5;
		} else {
			damage = 2 + weapon.getDamage();
		}
		return damage;
	}
}
