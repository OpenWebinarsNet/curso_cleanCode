package org.cuatrovientos.junit.ju09execalltests;

import static org.junit.Assert.*;
import org.junit.Test;

public class EurosConversorTest  {

	@Test
	public void testEuros2Pesetas() {
		EurosConversor target = new EurosConversor();
		
		double expected = 998.316d;
		double actual = target.euros2Pesetas(6);
		
		assertEquals("Euros 2 pesetas conversion", expected, actual, 0.01);
	}

	@Test
	public void testPesetas2Euros() {
		EurosConversor target = new EurosConversor();
		
		double expected = 6.01d;
		double actual = target.pesetas2Euros(1000);
		
		assertEquals("Pesetas 2 euros conversion", expected, actual, 0.01);
	}

}
