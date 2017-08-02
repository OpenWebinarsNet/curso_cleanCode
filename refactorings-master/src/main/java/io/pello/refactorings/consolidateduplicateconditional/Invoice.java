package io.pello.refactorings.consolidateduplicateconditional;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Consolidate Duplicate Conditional
 * This class is intended to be used as a refactoring playground
 * @author PELLO_ALTADILL
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
			subtotal = subtotal * (1 + (vat/100));
			return subtotal;
		} else {
			subtotal = (price * qty);
			subtotal = subtotal * (1 + (vat/100));
			return subtotal;
		}
	}
}
