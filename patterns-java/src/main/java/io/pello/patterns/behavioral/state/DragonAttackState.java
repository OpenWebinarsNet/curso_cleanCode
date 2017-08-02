
package io.pello.patterns.behavioral.state;

/**
 * Implement a Dragon state, for the Attack
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class DragonAttackState implements DragonState {

	public void fly(Dragon dragon) {
		System.out.println("Attack State> fly while attacking");
	}

	public void land(Dragon dragon) {
		System.out.println("Attack State> can't land while attacking.");
	}

	public int attack(Dragon dragon) {
		System.out.println("Attack State> attacking.");
		return (int) (Math.random() * 100);
	}
}
