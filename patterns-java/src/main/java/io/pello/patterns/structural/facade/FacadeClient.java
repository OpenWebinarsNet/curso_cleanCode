
package io.pello.patterns.structural.facade;

/**
 * Simple class to make use of the facade
 * @author Pello Xabier Altadill Izura
 *
 */
public class FacadeClient {
	public static void main (String args[]) {
		DungeonFacade dungeon = new DungeonFacade();
		dungeon.generate();
		System.out.println(dungeon.getProperties());
	}
}
