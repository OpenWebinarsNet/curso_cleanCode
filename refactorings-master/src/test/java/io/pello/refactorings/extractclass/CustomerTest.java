package io.pello.refactorings.extractclass;

import static org.junit.Assert.*;

import org.junit.Test;

import io.pello.refactorings.extractclass.Customer;

public class CustomerTest {

	@Test
	public void testGetName() {
		Customer customer = new Customer("Eugene Krabs", "33444222H");
		String expected = "Eugene Krabs";
		String actual = customer.getName();
		
		assertEquals("Name is correctly set", actual, expected);
	}

}
