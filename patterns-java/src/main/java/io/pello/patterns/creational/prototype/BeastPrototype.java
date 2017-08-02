
package io.pello.patterns.creational.prototype;

/**
 * Beast is an abstract class that represents
 * generic beast moving around the scenario
 */
public abstract class BeastPrototype {
	protected int defense;
	protected int mana;
	
	public abstract BeastPrototype clone();
	public abstract String getType();

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}
	@Override
public String toString() {
	return "BeastPrototype [defense=" + defense + ", mana=" + mana +  ", type:" + getType() + "]";
}

	
}
