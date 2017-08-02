
package io.pello.patterns.structural.decorator;

public class SimpleCharacter implements Character {
	private String name;

	public SimpleCharacter (String name) {
		this.name = name;
	}
	
	public int move() {
		return 3;
	}

	public int attack() {
		return 3;
	}

	public int defend() {
		return 3;
	}

	public String toString() {
		return "Simplest character. Name: " + name;
	}
}
