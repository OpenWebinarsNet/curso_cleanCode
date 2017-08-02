package io.pello.patterns.structural.facade;

/**
 * Represents a treasure
 * @author Pello Xabier Altadill Izura
 *
 */
public class Treasure {
	
	private String name;
	private int value;

	public Treasure(String name, int value) {
		this.name = name;
		this.value = value;
	}

	// getters/setters
	
	@Override
	public String toString() {
		return "Treasure [name=" + name + ", value=" + value + "]";
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
