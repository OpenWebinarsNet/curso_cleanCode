package io.pello.refactorings.consolidateconditional.refactored;

import java.util.Date;

/**
 * Refactored version
 */
public class Invoice {

	private Customer customer;
	private int year;

	public Invoice(Customer customer, int year) {
		this.customer = customer;
		this.year = year;
	}

	public float calculateTotal(float subtotal, float vat) {
		if (isUselessToCharge(subtotal)) {
			return 0;
		} else {
			return subtotal * vat;
		}
	}

	private boolean isUselessToCharge(float subtotal) {
		return (customer.getAge() < 18) 
				|| (new Date().getYear() > year) || (subtotal < 0.5f);
	}
}
