package io.pello.refactorings.introducelocalextension.refactored;

/**
* Refactored version
*/
public class Main {
	private CoolConversor conversor = new CoolConversor();
	
	public double convert (double amount) {
		return conversor.euro2Dollar(amount);
	}
}
