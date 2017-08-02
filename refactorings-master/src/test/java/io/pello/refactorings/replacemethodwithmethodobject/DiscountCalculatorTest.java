package io.pello.refactorings.replacemethodwithmethodobject;

import static org.junit.Assert.*;

import org.junit.Test;

import io.pello.refactorings.replacemethodwithmethodobject.refactored1.DiscountCalculator;

public class DiscountCalculatorTest {

	@Test
	public void testApplyDiscount() {
		DiscountCalculator discountCalculator = 
				new DiscountCalculator(66.6d, new Customer(false, false, Customer.NORMAL), 10.0d);
		double expected = discountCalculator.applyDiscount();
		double actual = 70.58d;
		assertEquals("Applies discount to Normal", expected, actual, 0.01f);
	}
	
	@Test
	public void testApplyDiscountVip() {
		DiscountCalculator discountCalculator = 
				new DiscountCalculator(66.6d, new Customer(false, false, Customer.VIP), 10.0d);
		double expected = discountCalculator.applyDiscount();
		double actual = 59.26d;
		assertEquals("Applies discount to Normal", expected, actual, 0.01f);
	}

}
