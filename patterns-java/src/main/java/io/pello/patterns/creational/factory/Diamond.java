
package io.pello.patterns.creational.factory;

/**
 * Diamond treasure kind
 * @author Pello Xabier Altadill Izura
 */
public class Diamond extends Treasure {
	private int mana;

	@Override
	public String getType() {
		return "Diamond";
	}

	@Override
	public String toString() {
		return super.toString() + " Mana: " + mana;
	}
}