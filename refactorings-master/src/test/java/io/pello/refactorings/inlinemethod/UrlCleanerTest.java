package io.pello.refactorings.inlinemethod;

import static org.junit.Assert.*;

import org.junit.Test;


public class UrlCleanerTest {

	@Test
	public void testUrlClean() {
		UrlCleaner urlCleaner = new UrlCleaner();
		String expected = "why-junit-is-great";
		String actual = urlCleaner.clean("  \tWhy, Junit: is Great?  \n\t");
		
		assertEquals("Normalizes correctly", expected, actual);
	}

}
