package io.pello.refactorings.introduceforeignmethod;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PasswordCheckerTest {
	private PasswordChecker passwordChecker;
	
	@Before
	public void setUp () {
		passwordChecker = new PasswordChecker();
	}
	
	@Test
	public void testWithGoodPassword() {
		String expected = "josua";
		String actual = passwordChecker.improvePassword("josua");
		
		assertEquals("With bad password", actual, expected);
	}
	

}
