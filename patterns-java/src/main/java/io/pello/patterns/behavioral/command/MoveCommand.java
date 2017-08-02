package io.pello.patterns.behavioral.command;

/**
 * MoveCommand
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class MoveCommand implements Command {

	private Army army;
	
	public MoveCommand(Army army) {
		this.army = army;
	}
	
	public void execute() {
		System.out.println("MoveCommand: moving");
		army.move();
	}

	public void undo() {
		System.out.println("MoveCommand: undo moving");
	}
}
