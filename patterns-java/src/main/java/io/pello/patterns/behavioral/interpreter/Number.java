package io.pello.patterns.behavioral.interpreter;

public class Number extends Option {
	private int number;

	public Number(int number) {
		this.number = number;
	}

	@Override
	public String interpret() {
		return number + "#";
	}
}

