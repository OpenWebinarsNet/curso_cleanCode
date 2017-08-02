package io.pello.refactorings.parameterobject;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OrderTest {
	
	private Order order;

	@Before
	public void setUp() throws Exception {
		order = new Order();
		order.addItem(1, "Product 1", 2, 10.0f, 0f); // 20
		order.addItem(2, "Product 2", 1, 15.4f, 0.10f); // 13,86
		order.addItem(3, "Product 3", 4, 30.2f, 0.50f);
	}

	@Test
	public void testCalculateTotal() {
		float expected = 94.26f;
		float actual = order.calculateTotal();
		assertEquals("Order total is correct", actual, expected, 0.01f);
	}

}
