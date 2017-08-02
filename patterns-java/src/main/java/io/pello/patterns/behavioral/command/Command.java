
package io.pello.patterns.behavioral.command;

/**
 * Interface to represent a user command
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public interface Command {
	public void execute();
	public void undo();
}
