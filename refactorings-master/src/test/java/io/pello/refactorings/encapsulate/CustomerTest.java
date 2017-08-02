package io.pello.refactorings.encapsulate;

import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerTest {

	@Test
	public void testToString() {
		Customer customer = new Customer();
		String expected = "42:Eugene Krabs";
		String actual = customer.toString();
		
		assertEquals("Check whether initial values are set", actual, expected);
	}

}
