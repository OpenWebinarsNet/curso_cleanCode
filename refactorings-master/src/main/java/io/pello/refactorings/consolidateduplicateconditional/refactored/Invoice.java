package io.pello.refactorings.consolidateduplicateconditional.refactored;

import java.util.Date;

/**
* Refactored version
*/
public class Invoice {
	
	private Customer customer;
	private float price;
	private int qty;
	
	public Invoice (Customer customer, float price, int qty) {
		this.customer = customer;
		this.price = price;
		this.qty = qty;
	}
	
	public float calculateTotal (float vat, float discount) {
		float subtotal = 0;
		if (customer.isVip()) {
			subtotal = (price * qty) - discount;
		} else {
			subtotal = (price * qty);
		}
		return subtotal * (1 + (vat/100));
	}
}
