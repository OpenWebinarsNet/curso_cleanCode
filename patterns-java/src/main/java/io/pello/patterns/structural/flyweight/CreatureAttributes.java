package io.pello.patterns.structural.flyweight;

/**
 * These creature attributes will be common among simple
 * creatures such as bats, rats, ...
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class CreatureAttributes {
	private int speed;
	private int damage;
	private int defense;
	/**
	 * @param name
	 * @param damage
	 * @param defense
	 */
	public CreatureAttributes(int speed, int damage, int defense) {
		this.speed = speed;
		this.damage = damage;
		this.defense = defense;
	}
	
	// getters/setters...

	public int getSpeed() {
		return speed;
	}

	public void setName(int speed) {
		this.speed = speed;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	@Override
	public String toString() {
		return "CreatureAttributes [speed=" + speed + ", damage=" + damage
				+ ", defense=" + defense + "]";
	}
}
