package io.pello.refactorings.introducelocalextension;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void testConvert() {
		Main main = new Main();
		double expected = 14d;
		double actual = main.convert(10);
		
		assertEquals("Converts correctly", actual, expected, 0.01d);
	}

}
