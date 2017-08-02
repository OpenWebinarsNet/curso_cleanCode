
package io.pello.patterns.structural.decorator;

/**
 * Represents orc character
 * @author Pello Xabier Altadill Izura
 */
public class Orc extends CharacterDecorator {
	private static final int ORCISH_MODIFIER = 3;
	
	public Orc (Character extendedCharacter) {
		super(extendedCharacter);
	}
	
	private int orcModifier () {
		return (int) ((Math.random() * ORCISH_MODIFIER) + ORCISH_MODIFIER);
	}
	
	@Override
	public int move() {
		return orcModifier() + super.move();
	}

	@Override
	public int attack() {
		return orcModifier() + super.attack();
	}

	@Override
	public int defend() {
		return orcModifier() + super.defend();
	}

	@Override
	public String toString() {
		return super.toString() + " and I'm an orcish character";
	}
}
