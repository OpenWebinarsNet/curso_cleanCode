package io.pello.refactorings.extractmethod;

import static org.junit.Assert.*;

import org.junit.Test;

public class UrlNormalizerTest {

	@Test
	public void testNormalize() {
		UrlNormalizer urlNormalizer = new UrlNormalizer();
		String expected = "why-junit-is-great";
		String actual = urlNormalizer.normalize("  \tWhy, Junit: is Great?  \n\t");
		
		assertEquals("Normalizes correctly", expected, actual);
	}

}
