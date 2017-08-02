package io.pello.refactorings.replacenestedconditionalguardclauses;

import java.util.ArrayList;

/**
 * Remove Conditional with guard clauses
 * This class is intended to be used as a refactoring playground
 * @author PELLO_ALTADILL
 */
public class Flight {
	
	private static final float CHILDREN_DISCOUNT = 0.9f;
	private static final float UNEMPLOYED_DISCOUNT = 0.8f;
	private static final int BASE_PRICE = 20;
	private int distance;
	
	public Flight (int distance) {
		this.distance = distance;
	}

	public float priceForPassenger (Passenger passenger) {
		float price = 0;
		if (passenger.isAChild()) {
			  price = childDiscount();
			} else {
			  if (passenger.isUnemployed()) {
			  price = unemployedDiscount();
			  } else {
			    if (isChristmas()) {
			    price = 0;
			    } else {
			    price = normalPrice();
			    }
			  }
			}
		return price;
	}

	private float unemployedDiscount() {
		return BASE_PRICE * distance * UNEMPLOYED_DISCOUNT;
	}

	private float normalPrice() {
		return BASE_PRICE * distance;
	}

	private boolean isChristmas() {
		return false;
	}

	private float childDiscount() {
		return BASE_PRICE * distance * CHILDREN_DISCOUNT;
	}
}
