
package io.pello.patterns.structural.facade;

/**
 * It's a trap!!
 * 
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class Trap {
	private static final int TRAP_DAMAGE = 6;
	private String name;
	private int damage;

	public Trap(String name) {
		this.name = name;
		damage = (int) (Math.random() * TRAP_DAMAGE);
	}

	// getters/setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	@Override
	public String toString() {
		return "Trap [name=" + name + ", damage=" + damage + "]";
	}
}
