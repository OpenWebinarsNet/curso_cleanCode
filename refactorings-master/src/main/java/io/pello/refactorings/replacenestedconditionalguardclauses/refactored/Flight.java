package io.pello.refactorings.replacenestedconditionalguardclauses.refactored;

import java.util.ArrayList;

/**
 * Refactored version
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
		if (passenger.isAChild()) return childDiscount();
		if (passenger.isUnemployed()) return unemployedDiscount();
		if (isChristmas()) return 0;
		return normalPrice();

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
