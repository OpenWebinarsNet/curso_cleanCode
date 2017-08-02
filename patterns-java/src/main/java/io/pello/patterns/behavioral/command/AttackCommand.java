package io.pello.patterns.behavioral.command;

/**
 * AttackCommand
 * 
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class AttackCommand implements Command {

	private Army army;

	public AttackCommand(Army army) {
		this.army = army;
	}

	public void execute() {
		System.out.println("AttackCommand: attack");
		army.attack();
	}

	public void undo() {
		System.out.println("AttackCommand: undo attack");
	}
}
