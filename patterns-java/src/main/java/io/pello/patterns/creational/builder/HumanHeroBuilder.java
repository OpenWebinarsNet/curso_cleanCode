
package io.pello.patterns.creational.builder;

import io.pello.patterns.creational.abstractfactory.HumanWeapon;
import io.pello.patterns.creational.abstractfactory.Weapon;

public class HumanHeroBuilder extends HeroBuilder {

	@Override
	public void createHero() {
		this.hero = new Hero();
		hero.setRace("human");
	}

	@Override
	public void buildArmor() {
		Armor armor = new Armor();
		armor.setName("Human armor");
		armor.setDefense(3);
		armor.setValue(100);
		hero.setArmor(armor);
	}

	@Override
	public void buildSpell() {
		Spell spell = new Spell();
		spell.setName("Heal");
		spell.setMana(20);
		hero.setSpell(spell);

	}

	@Override
	public void buildWeapon() {
		Weapon weapon = new HumanWeapon();
		hero.setWeapon(weapon);
	}

	@Override
	public Hero getHero() {
		return hero;
	}

}
