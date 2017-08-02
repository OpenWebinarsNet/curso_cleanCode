/**
 * 
 */
package io.pello.patterns.creational.prototype;

import java.util.ArrayList;

/**
 * Makes use of prototype creational pattern
 * @author Pello Xabier Altadill Izura
 */
public class PrototypeClient {

	public static void main (String args[]) {
		ArrayList<BeastPrototype> beasts = new ArrayList<BeastPrototype>();
		BeastPrototypeFactory beastFactory =
				new BeastPrototypeFactory();

		for (int i=0;i<3;i++) {
			beasts.add(beastFactory.createBoar());
			beasts.add(beastFactory.createSheep());
			beasts.add(beastFactory.createSeal());
		}
		
		for (BeastPrototype beast : beasts) {
			System.out.println(beast);
		}
	}
}
