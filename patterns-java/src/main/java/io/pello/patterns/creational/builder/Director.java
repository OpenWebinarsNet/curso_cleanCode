
package io.pello.patterns.creational.builder;

/**
 * The director uses a builder to create instances.
 * It will make a reference to an abstract builder.
 * @author Pello Xabier Altadill Izura
 */
public class Director {

	public void createHero (HeroBuilder heroBuilder) {
		heroBuilder.createHero();
		heroBuilder.buildArmor();
		heroBuilder.buildSpell();
		heroBuilder.buildWeapon();
	}
	
}
