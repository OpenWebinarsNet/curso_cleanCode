package org.cuatrovientos.junit.ju00intro;

import static org.junit.Assert.*;
import org.junit.Test;

public class HelloTest {

	@Test
	public void testSayHello() {
		Hello target = new Hello();
		String expected = "hello";
		String actual = target.sayHello();
		
		assertEquals("Returns hello",expected, actual);
	}

}
