
package io.pello.patterns.creational.factory;

/**
 * Example of factory using a parametrized method
 * Other option could be creating and abtract factory
 * and then extending that to specific factory
 * @author Pello Xabier Altadill Izura
 *
 */
public class TreasureFactory {
	private static final int DIAMOND = 0;
	private static final int JEWEL = 1;
	private static final int GOLDCOIN = 2;

	public Treasure createTreasure(int type) {
		switch (type) {
			case DIAMOND :	return new Diamond();
							
			case JEWEL :	return new Jewel();
							
			case GOLDCOIN :	return new GoldCoin();
			
			default:		return new GoldCoin();
							// or this could be an extension
							// return super.createTreasure(type);
		}
	}
}
