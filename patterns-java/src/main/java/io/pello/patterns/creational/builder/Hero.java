
package io.pello.patterns.creational.builder;

import io.pello.patterns.creational.abstractfactory.Weapon;

public class Hero {
	private String name;
	private String race;
	private Armor armor;
	private Weapon weapon;
	private Spell spell;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public Armor getArmor() {
		return armor;
	}

	public void setArmor(Armor armor) {
		this.armor = armor;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public Spell getSpell() {
		return spell;
	}

	public void setSpell(Spell spell) {
		this.spell = spell;
	}

	@Override
	public String toString() {
		return "Hero [name=" + name + ", race=" + race + ", armor=" + armor + ", weapon=" + weapon + ", spell=" + spell
				+ "]";
	}

	
}
