package io.pello.refactorings.replacemethodwithmethodobject.refactored2;

import io.pello.refactorings.replacemethodwithmethodobject.Customer;

/**
 * Refactored version
 */
public class DiscountCalculator {
	private double finalPrice;
	private double appliedVat;
	private double price;
	private Customer customer;
	private double discount;

	public DiscountCalculator(double price, Customer customer, double discount) {
		finalPrice = 0;
		appliedVat = 0;
		this.price = price;
		this.customer = customer;
		this.discount = discount;
	}

	public double applyDiscount() {
		return calculatePrice() * calculateVat() - discount;
	}

	private double calculateVat() {
		switch (customer.getType()) {
		case Customer.NORMAL:
			return 1.21f;
		case Customer.SPECIAL:
			return 1.15f;
		case Customer.VIP:
			return 1.04f;
		default:
			return 1.21f;
		}
	}

	private double calculatePrice() {
		if (price > 50 && customer.isVip()) {
			finalPrice = price * 0.5;
		} else if (price > 10 && customer.isSpecial()) {
			finalPrice = price * 0.1;
		} else {
			finalPrice = price;
		}

		return finalPrice;
	}
}

