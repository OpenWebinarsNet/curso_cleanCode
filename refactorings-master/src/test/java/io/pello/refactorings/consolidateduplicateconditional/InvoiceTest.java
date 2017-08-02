package io.pello.refactorings.consolidateduplicateconditional;

import static org.junit.Assert.*;

import org.junit.Test;

public class InvoiceTest {

	@Test
	public void testCalculateTotal() {
		Invoice invoice = new Invoice(new Customer(false), 42.35f, 10);
		float expected = 512.435f;
		float actual = invoice.calculateTotal(21, 10.5f);
		
		assertEquals("Calculate total", actual, expected, 0.01f);
	}
	
	@Test
	public void testCalculateTotalVip() {
		Invoice invoice = new Invoice(new Customer(true), 42.35f, 10);
		float expected = 499.73f;
		float actual = invoice.calculateTotal(21, 10.5f);
		
		assertEquals("Calculate total", actual, expected, 0.01f);
	}

}
