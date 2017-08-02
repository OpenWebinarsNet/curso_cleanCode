package io.pello.patterns.behavioral.mediator;

/**
 * Represent a General
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class General extends Unit {
	
	public General(String name, String range, Mediator mediator) {
		super(name, range, mediator);
	}

	public void giveOrder (Command command, Unit unit) {
		System.out.println("Giving order> " + command.getMsg());
		mediator.order(command, unit);
	}
	
	public void attack (int x, int y, Unit unit) {
		System.out.println("Attack> " + x +":" + y + " >" + unit.getName());
		mediator.attack(x, y, unit);
	}
	
	public void move (int x, int y, Unit unit) {
		System.out.println("Move> " + x +":" + y + " >" + unit.getName());
		mediator.move(x, y, unit);
	}
	
	public void hold (Unit unit) {
		System.out.println("Hold> " + unit.getName());
		mediator.hold(unit);
	}
}
