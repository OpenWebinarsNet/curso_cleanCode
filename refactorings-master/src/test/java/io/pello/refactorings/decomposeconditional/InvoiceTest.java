package io.pello.refactorings.decomposeconditional;

import static org.junit.Assert.*;

import org.junit.Test;

public class InvoiceTest {

	@Test
	public void testCalculatePaymentWithdiscount() {
		Invoice invoice = new Invoice(new Customer(17));
		
		float expected = 45.792f;
		float actual = invoice.calculatePayment(42.4f, 0.9f, 1.20f);
		
		assertEquals("Calculate payment with discount", actual, expected, 0.01f);
	}
	
	@Test
	public void testCalculatePaymentWithoutDiscount() {
		Invoice invoice = new Invoice(new Customer(55));
		
		float expected = 50.88f;
		float actual = invoice.calculatePayment(42.4f, 0.9f, 1.20f);
		
		assertEquals("Calculate payment without discount", actual, expected, 0.01f);
	}
	

}
