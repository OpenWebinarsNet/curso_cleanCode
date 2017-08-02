
package io.pello.patterns.creational.builder;

import io.pello.patterns.creational.abstractfactory.OrcishWeapon;
import io.pello.patterns.creational.abstractfactory.Weapon;

/**
 * Builder for orcish hero
 * 
 * @author Pello Xabier Altadill Izura
 */
public class OrcishHeroBuilder extends HeroBuilder {

	@Override
	public void createHero() {
		this.hero = new Hero();
		hero.setRace("orc");

	}

	@Override
	public void buildArmor() {
		Armor armor = new Armor();
		armor.setName("Human armor");
		armor.setDefense(5);
		armor.setValue(150);

		hero.setArmor(armor);
	}

	@Override
	public void buildSpell() {
		Spell spell = new Spell();
		spell.setName("Fireball");
		spell.setMana(10);

		hero.setSpell(spell);

	}

	@Override
	public void buildWeapon() {
		Weapon weapon = new OrcishWeapon();

		hero.setWeapon(weapon);
	}

	@Override
	public Hero getHero() {

		return hero;
	}

}
