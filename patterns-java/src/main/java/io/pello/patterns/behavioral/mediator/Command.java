package io.pello.patterns.behavioral.mediator;

/**
 * Represents a Command given by a General
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class Command {
	private String msg;

	public Command(String msg) {
		this.msg = msg;
	}
	// getters/setters ...

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
