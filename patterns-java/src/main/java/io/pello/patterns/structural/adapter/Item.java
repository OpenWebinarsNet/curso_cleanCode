
package io.pello.patterns.structural.adapter;

/**
 * Represents a generic Item
 * @author Pello Xabier Altadill Izura
 */
public class Item {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + "]";
	}
}
