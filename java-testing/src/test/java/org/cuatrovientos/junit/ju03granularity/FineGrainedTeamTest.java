package org.cuatrovientos.junit.ju03granularity;

import static org.junit.Assert.*;

import org.junit.Test;

public class FineGrainedTeamTest {

	@Test
	public void testName () {
		Team target = new Team("Real Oviedo");
		assertEquals("Name assignation is correct", target.getName(), "Rial Mandril");		
	}

	@Test
	public void testInitialSize () {
		Team target = new Team("Real Oviedo");
		assertEquals("Initial size is 0",target.totalNumbers(),0);
	}

	@Test
	public void testTotalNumber () {
		Team target = new Team("Real Oviedo");
		target.addNumber(0);
		target.addNumber(23);
		target.addNumber(42);
		
		assertEquals("Size is 3",target.totalNumbers(),3);
	}
	
	@Test
	public void testNumberAt () {
		Team target = new Team("Real Oviedo");
		target.addNumber(0);
		target.addNumber(23);
		target.addNumber(42);
		
		assertEquals("23 is at position 1",target.numberAt(1),new Integer(23));
	}

	@Test
	public void testRemoveNumber() {
		Team target = new Team("Real Oviedo");
		target.addNumber(-3);
		assertFalse("-3 player number is not present", target.removeNumber(-3));
	}

}
