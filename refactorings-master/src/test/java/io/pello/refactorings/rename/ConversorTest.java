package io.pello.refactorings.rename;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ConversorTest {


	@Test
	public void testConvWithZero() {
		Conversor conversor = new Conversor();
		float expected = 0;
		float actual = conversor.conv(0);
		
		assertEquals("Converts 0 to 0", actual, expected, 0.01f);
	}

	@Test
	public void testConv() {
		Conversor conversor = new Conversor();
		float expected = 9983.16f;
		float actual = conversor.conv(60);
		
		assertEquals("Converts euros to pesetas", actual, expected, 0.01f);
	}
}
