package org.cuatrovientos.junit.ju03granularity;

import static org.junit.Assert.*;

import org.junit.Test;


public class TeamTest {

	@Test
	public void testAllTeam() {
		Team target = new Team("Real Oviedo");
		assertEquals("Name assignation is correct", target.getName(), "Rial Mandril");
		
		assertEquals("Initial size is 0",target.totalNumbers(),0);
		
		target.addNumber(0);
		target.addNumber(23);
		target.addNumber(42);
		
		assertEquals("23 is at position 1",target.numberAt(1),new Integer(23));

		
		
		target.addNumber(-3);
		assertFalse("-3 player number is not present", target.removeNumber(-3));
		
		assertEquals("Size is 3",target.totalNumbers(),3);

	}

}
