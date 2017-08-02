package org.cuatrovientos.junit.ju09execalltests;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestRobot {

	Robot r1;
	Robot r2;
	Robot r3;
	Robot r4;

	/**
	 * TestRobot We init some values for testint purposes. jUnit also offers
	 * setUp/tearDown methods for this
	 */
	public TestRobot() {
		r1 = null;
		r2 = new Robot("R2D2");
		r3 = r2;
		r4 = new Robot("Arale");
	}

	/**
	 * checks whether an instance is null
	 */
	@Test
	public void testIfNull() {
		assertNull("Comprobamos que r1 es nulo", r1);
	}

	/**
	 * checks whether an instance is NOT null
	 */
	@Test
	public void testIfNotNull() {
		assertNotNull("Comprobamos que r2 NO es nulo", r2);
	}

	/**
	 * checks whether two variables reference the same instance
	 */
	@Test
	public void testSameObject() {
		assertSame("r2 y r3 hacen referencia a lo mismo", r2, r3);
	}

	/**
	 * checks whether two variables reference different instances
	 */
	@Test
	public void testNotSameObject() {
		assertNotSame("r1 y r2 NO hacen referencia a lo mismo", r1, r2);
	}

	/**
	 * checks whether inital autonomy is 42
	 */
	@Test
	public void testInitialAutonomy() {

		assertEquals("Initial autonomy is 42", 42.0, r2.getAutonomy(), 0.1);
	}

	/**
	 * checks wether an expression is true
	 */
	@Test
	public void testIfItsTrue() {
		r4.setAutonomy(-4.0);

		assertTrue("If we try to set less than 0, then 42.0 is set",
				r4.getAutonomy() == 42.0);
	}

	/**
	 * checks whether an expression is true
	 */
	@Test
	public void testFalso() {
		double testValue = -66.0;
		r4.setAutonomy(testValue);

		assertFalse("If we try to set less than 0, that value is not assigned",
				r4.getAutonomy() == testValue);
	}
}