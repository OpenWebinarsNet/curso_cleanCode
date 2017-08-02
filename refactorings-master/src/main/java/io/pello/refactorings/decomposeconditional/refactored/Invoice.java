package io.pello.refactorings.decomposeconditional.refactored;

/**
* Refactored version
*/
public class Invoice {
	
	private Customer customer;
	
	public Invoice (Customer customer) {
		this.customer = customer;
	}
	
	public float calculatePayment (float price, float discount, float vat) {
		float payment = 0;
		
		if (canApplyDiscount() ) {
		  payment = price * discount * vat;
		} else {
		  payment = price * vat;
		}

		return payment;
	}

	private boolean canApplyDiscount() {
		return customer.getAge() < 18 || customer.getAge() > 65;
	}
}
