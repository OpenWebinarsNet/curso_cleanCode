package io.pello.refactorings.parametrizemethod;

import static org.junit.Assert.*;

import org.junit.Test;

import io.pello.refactorings.parametrizemethod.Customer;
import io.pello.refactorings.parametrizemethod.Invoice;

public class InvoiceTest {

	@Test
	public void testChargeNormal() {
		Invoice invoice = new Invoice(100,new Customer(20, false));
		float expected = 100f;
		float actual = invoice.charge();
		
		assertEquals("Test charge for underage", actual, expected, 0.01f);
	}
	
	@Test
	public void testChargeUnderage() {
		Invoice invoice = new Invoice(100,new Customer(17, false));
		float expected = 50f;
		float actual = invoice.charge();
		
		assertEquals("Test charge for underage", actual, expected, 0.01f);
	}
	
	@Test
	public void testChargeCash() {
		Invoice invoice = new Invoice(100,new Customer(19, true));
		float expected = 80f;
		float actual = invoice.charge();
		
		assertEquals("Test charge for underage", actual, expected, 0.01f);
	}

}
