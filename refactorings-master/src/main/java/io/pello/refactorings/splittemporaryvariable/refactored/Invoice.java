package io.pello.refactorings.splittemporaryvariable.refactored;

/**
* Refactored version
*/
public class Invoice {
	
	public float totalPrice (float price, float vat, float discount) {
		float appliedVat = (vat * 100) / price;		
		System.out.println("Applied vat: " + appliedVat);
		
		float priceWithVat = price + appliedVat;
		System.out.println("Total: " + priceWithVat);
		
		return priceWithVat - discount;
	}

	/*
	 * Another Step
	public float totalPrice (float price, float vat, float discount) {
		return price + appliedVat(price, vat) - discount;
	}

	private float appliedVat (float price, float vat) {
		return (vat * price) / 100;
	}*/
}
