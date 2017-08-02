package org.cuatrovientos.junit.ju09execalltests;


import junit.extensions.ActiveTestSuite;
import junit.extensions.RepeatedTest;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.junit.Test;


/**
* ValidatorText
* Testing class for Validator
* Shows how to perform a test repeatedly
* These comes in handy when we need to test some method
* more than once or when we want to check performance
* TODO: check @Repeat annotation option
*/

public class ValidatorTest extends TestCase {
	
	public ValidatorTest(String testMethodName) {
		super(testMethodName);
	}

	/**
	* testIsNumber
	* tests number checking method
	*/
	@Test
	public void testIsNumber( ) {
		Validator validator = new Validator("31337");
		assertTrue("Number validation correct",validator.isNumber());
		
		validator = new Validator("r2d2");
		assertFalse("False number validation correct",validator.isNumber());
	}
	
	/**
	* testIsText
	* tests text checking method
	*/
	@Test
	public void testIsText( ) {
		Validator validator = new Validator("hacker");
		assertTrue("Text validation correct",validator.isText());
		
		validator = new Validator("h4x0r");
		assertFalse("False text validation correct",validator.isText());
	}

	/**
	* testIsSomethingElse
	* tests text is something else checking method
	*/
	@Test
	public void testIsSomethingElse( ) {
		Validator validator = new Validator("h4x0r");
		assertTrue("Something else validation correct",validator.isSomethingElse());
		
		validator = new Validator("42");
		assertFalse("False something else validation correct",validator.isSomethingElse());
	}

	
}