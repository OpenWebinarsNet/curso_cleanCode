package io.pello.refactorings.replacedatawithobject;

import static org.junit.Assert.*;

import org.junit.Test;

import io.pello.refactorings.replacedatawithobject.Customer;

public class CustomerTest {

	@Test
	public void testToString() {
		Customer customer = new Customer("Eugene","e@krabs.bb","Bikini Bottom");
		String expected = "Customer [name=Eugene, email=e@krabs.bb, address=Bikini Bottom]";
		String actual = customer.toString();
	
		assertEquals("toString returns all", actual, expected);
	}

}
