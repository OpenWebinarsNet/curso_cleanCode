package io.pello.refactorings.splittemporaryvariable;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import io.pello.refactorings.splittemporaryvariable.Invoice;

public class InvoiceTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testTotalPrice() {
		Invoice invoice = new Invoice();
		float expected = 50.48f;
		float actual = invoice.totalPrice(42.15f, 20, 0.1f);
		
		assertEquals("Applies vat and discount", actual, expected, 0.01f);
	}

}
