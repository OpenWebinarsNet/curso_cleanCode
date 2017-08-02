
package io.pello.patterns.behavioral.state;

/**
 * Implement a Dragon state, for the flying
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */

public class DragonFlyState implements DragonState {

	public void fly(Dragon dragon) {
		System.out.println("Fly State> flying...");
	}

	public void land(Dragon dragon) {
		System.out.println("Fly State> Landing...");
	}

	public int attack(Dragon dragon) {
		System.out.println("Land State> we attack while flying.");
		return (int) (Math.random() * 10);
	}
}
