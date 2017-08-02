
package io.pello.patterns.creational.builder;

/**
 * Abstract builder with some methods
 * to initiate different parts of the hero
 * @author Pello Xabier Altadill Izura
 */
public abstract class HeroBuilder {
	protected Hero hero;
	
	public abstract void createHero();
	public abstract void buildArmor();
	public abstract void buildSpell();
	public abstract void buildWeapon();

	public abstract Hero getHero();
}
