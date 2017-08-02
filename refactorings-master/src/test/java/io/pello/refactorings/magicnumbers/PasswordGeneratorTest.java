package io.pello.refactorings.magicnumbers;

import static org.junit.Assert.*;

import org.junit.Test;

public class PasswordGeneratorTest {

	
	@Test
	public void testGeneratePassword() throws Exception {
		PasswordGenerator passwordGenerator = new PasswordGenerator();
		int expected = 8;
		int actual = passwordGenerator.generatePassword(8).length();
		
		assertEquals("Password length", actual, expected);
	}
	
	@Test(expected = Exception.class) 
	public void testGeneratePasswordException() throws Exception {
		PasswordGenerator passwordGenerator = new PasswordGenerator();
		int expected = 8;
		int actual = passwordGenerator.generatePassword(4).length();
		
		assertEquals("Password length", actual, expected);
	}

}
