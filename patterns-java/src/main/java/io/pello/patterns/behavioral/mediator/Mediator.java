
package io.pello.patterns.behavioral.mediator;

/**
 * Interface that defines contract for unit to interact between them
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public interface Mediator {
	public void order (Command command, Unit unit);
	public void move (int x, int y, Unit unit);
	public int attack (int x, int y, Unit unit);
	public void hold (Unit unit);
}
