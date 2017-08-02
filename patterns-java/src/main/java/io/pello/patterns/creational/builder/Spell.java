
package io.pello.patterns.creational.builder;

/**
 * Represents a spell, part of a hero skills
 * @author Pello Xabier Altadill Izura
 *
 */
public class Spell {
	private String name;
	private int mana;
	private int spellType;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public int getSpellType() {
		return spellType;
	}

	public void setSpellType(int spellType) {
		this.spellType = spellType;
	}
	
}
