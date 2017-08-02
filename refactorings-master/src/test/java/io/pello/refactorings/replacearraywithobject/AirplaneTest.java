package io.pello.refactorings.replacearraywithobject;

import static org.junit.Assert.*;

import org.junit.Test;

public class AirplaneTest {

	@Test
	public void testToString() {
		Airplane airplane = new Airplane("Boeing 666");
		airplane.initPilot("Red Five", "6656", 42);
		
		String expected = "Airplane [model=Boeing 666, pilot=Red Five]";
		String actual = airplane.toString();
		
		assertEquals("toString returns correct data", actual, expected);
	}
	
}
