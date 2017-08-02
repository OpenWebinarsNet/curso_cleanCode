
package io.pello.patterns.creational.builder;

/**
 * Represents an armor, part of the equipment for a Hero
 * @author Pello Altadill 
 */
public class Armor {
	private String name;
	private int defense;
	private int value;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	
}
