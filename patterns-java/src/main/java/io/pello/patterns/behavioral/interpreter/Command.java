package io.pello.patterns.behavioral.interpreter;

public class Command extends Expression {
	private String command;

	public Command(String command) {
		this.command = command;
	}

	@Override
	public String interpret() {
		return "[" + command + "]";
	}
}
