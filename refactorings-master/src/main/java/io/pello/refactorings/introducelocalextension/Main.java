package io.pello.refactorings.introducelocalextension;

/**
 * Introduce Local Extension
 * This class is intended to be used as a refactoring playground
 * @author PELLO_ALTADILL
 */
public class Main {
	private Conversor conversor = new Conversor();
	
	public double convert (double amount) {
		return conversor.euro2Dollar(amount);
	}
}
