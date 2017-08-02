package io.pello.refactorings.introducelocalextension.refactored;

public class CoolConversor extends Conversor {
	public double euro2Pound (double qty) {
		return qty * 0.8d;
	}

	public double pound2Euro (double qty) {
		return qty * 1.3d;
	}
}
