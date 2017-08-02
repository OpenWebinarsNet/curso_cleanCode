
package io.pello.patterns.structural.decorator;

public class CharacterDecorator implements Character {

	protected Character extendedCharacter;

	public CharacterDecorator(Character extendedCharacter) {
		this.extendedCharacter = extendedCharacter;
	}

	// delegates move call
	public int move() {
		return extendedCharacter.move();
	}

	// delegates attack call
	public int attack() {
		return extendedCharacter.attack();
	}

	// delegates defend call
	public int defend() {
		return extendedCharacter.defend();
	}

	public String toString() {
		return extendedCharacter.toString();
	}
}
