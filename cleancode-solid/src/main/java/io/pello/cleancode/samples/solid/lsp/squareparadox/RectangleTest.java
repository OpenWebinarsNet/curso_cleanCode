package io.pello.cleancode.samples.solid.lsp.squareparadox;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RectangleTest {
	Rectangle rectangle;
	
	@Before
	public void setUp() {
		rectangle = new Square();
	}

	@Test
	public void testGetHeight() {
		rectangle.setHeight(10);
		rectangle.setWidth(20);
		
		int expected = 10;
		int actual = rectangle.getHeight();
		
		assertEquals("getHeight returns expected value",actual, expected);
	}

	@Test
	public void testGetWidth() {
		rectangle.setWidth(20);
		rectangle.setHeight(10);
		
		int expected = 20;
		int actual = rectangle.getWidth();
		
		assertEquals("getWidth returns expected value",actual, expected);
	}

	@Test
	public void testArea() {
		rectangle.setWidth(10);
		rectangle.setHeight(20);
		
		int expected = 200;
		int actual = rectangle.area();
		
		assertEquals("Area returns expected value",actual, expected);
	}

}
