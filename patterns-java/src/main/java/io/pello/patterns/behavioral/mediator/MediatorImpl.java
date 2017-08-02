package io.pello.patterns.behavioral.mediator;

import java.util.Vector;

/**
 * Implements mediator pattern
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class MediatorImpl implements Mediator {

	@Override
	public void order(Command command, Unit unit) {
			unit.receiveOrder(command);
	}

	@Override
	public void move(int x, int y, Unit unit) {
			unit.move(x, y);
	}

	@Override
	public int attack(int x, int y, Unit unit) {		
		return unit.attack();
	}

	@Override
	public void hold(Unit unit) {
			unit.hold();
	}

}
