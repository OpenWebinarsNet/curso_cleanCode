
package io.pello.patterns.creational.factory;

/**
 * GoldCoin treasure kind
 * @author Pello Xabier Altadill Izura
 */
public class GoldCoin extends Treasure {
	private int amount;
	
	@Override
	public String getType() {
		return "GoldCoin";
	}

	@Override
	public String toString() {
		return super.toString() + " Amount: " + amount;
	}
}
