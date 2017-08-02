package io.pello.patterns.behavioral.interpreter;

public class Order extends Expression {
	private Command command;
	private Option option;

	public Order(Command command, Option option) {
		this.command = command;
		this.option = option;
	}
	
	@Override
	public String interpret() {
		return command.interpret() + " " + option.interpret();
	}
}
