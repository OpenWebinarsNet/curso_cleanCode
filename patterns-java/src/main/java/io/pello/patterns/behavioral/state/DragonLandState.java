
package io.pello.patterns.behavioral.state;

/**
 * Implement a Dragon state, for the landing
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class DragonLandState implements DragonState {

	public void fly(Dragon dragon) {
		System.out.println("Land State> we are landing not flying...");
	}

	public void land(Dragon dragon) {
		System.out.println("Land State> landing");
	}

	public int attack(Dragon dragon) {
		System.out.println("Land State> can't attack while landing.");
		return 0;
	}
}
