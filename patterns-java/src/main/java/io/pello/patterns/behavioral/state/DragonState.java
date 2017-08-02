
package io.pello.patterns.behavioral.state;

/**
 * Interface with method that will vary depending on the state
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public interface DragonState {
	public void fly(Dragon dragon);
	public void land(Dragon dragon);
	public int attack(Dragon dragon);
}
