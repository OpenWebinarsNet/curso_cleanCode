package io.pello.refactorings.introducenullobject;

import java.util.Random;

public class Weapon {
	private int damage;

	public Weapon(int damage) {
		this.damage = damage;
	}

	public int getDamage() {
		return damage + new Random().nextInt(3);
	}
}
