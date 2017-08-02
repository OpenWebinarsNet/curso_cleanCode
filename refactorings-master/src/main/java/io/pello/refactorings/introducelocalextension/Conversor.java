package io.pello.refactorings.introducelocalextension;


public class Conversor {
	public double euro2Dollar (double qty) {
		return qty * 1.4d;
	}

	public double dollar2Euro (double qty) {
		return qty * 0.6d;
	}
}

