package io.pello.refactorings.consolidateconditional;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Test;

public class InvoiceTest {

	@Test
	public void testCalculateTotal() {
		Invoice invoice = new Invoice(new Customer(28), new GregorianCalendar().get(Calendar.YEAR));
		float expected = 50.82f;
		float actual = invoice.calculateTotal(42.35f, 1.2f);
		
		assertEquals("Calculates total, normal case ", expected, actual, 0.01f);
	}
	
	@Test
	public void testCalculateTotalSpecialCase() {
		Invoice invoice = new Invoice(new Customer(17), 1989);
		float expected = 0;
		float actual = invoice.calculateTotal(42.35f, 1.2f);
		
		assertEquals("Calculates total, special case", expected, actual, 0.01f);
	}

}
