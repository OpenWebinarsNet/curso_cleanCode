package io.pello.refactorings.parametrizemethod;

/**
 * Parametrized method This class is intended to be used as a refactoring
 * playground
 * 
 * @author PELLO_ALTADILL
 */
public class Invoice {
	private float subtotal;
	private Customer customer;

	public Invoice(float subtotal, Customer customer) {
		this.subtotal = subtotal;
		this.customer = customer;
	}

	public float charge() {
		if (customer.getAge() < 18) {
			return chargeWithUnderageDiscount();
		} else if (customer.payInCash()) {
			return chargeWithCashDiscount();
		} else {
			return chargeNormal();
		}
	}

	private float chargeWithUnderageDiscount() {
		float total = subtotal * 0.5f;
		return total;
	}

	private float chargeWithCashDiscount() {
		float total = subtotal * 0.8f;
		return total;
	}

	private float chargeNormal() {
		return subtotal;
	}
}
