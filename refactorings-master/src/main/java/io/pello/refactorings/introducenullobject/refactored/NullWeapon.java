package io.pello.refactorings.introducenullobject.refactored;

public class NullWeapon extends Weapon {
	public NullWeapon(int damage) {
		super(damage);
	}

	@Override
	public int getDamage() {
		return 0;
	}
}
