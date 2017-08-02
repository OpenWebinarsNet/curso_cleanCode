package io.pello.refactorings.splittemporaryvariable;

/**
 * Avoid using temporary variable refactoring playground
 * This class is intended to be used as a refactoring playground
 * @author PELLO_ALTADILL
 */
public class Invoice {
	public float totalPrice (float price, float vat, float discount) {
		float temp = 0;
		temp = (vat * price) / 100;
		System.out.println("Applied vat: " + temp);
		temp = price + temp;
		System.out.println("Total with vat: " + temp);
		return temp - discount;
	}
}
