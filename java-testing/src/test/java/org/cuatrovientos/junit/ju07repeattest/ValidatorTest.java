package org.cuatrovientos.junit.ju07repeattest;


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


	@Test
	public void testIsNumber( ) {
		Validator validator = new Validator("31337");
		assertTrue("Number validation correct",validator.isNumber());
		
		validator = new Validator("r2d2");
		assertFalse("False number validation correct",validator.isNumber());
	}
	

	@Test
	public void testIsText( ) {
		Validator validator = new Validator("hacker");
		assertTrue("Text validation correct",validator.isText());
		
		validator = new Validator("h4x0r");
		assertFalse("False text validation correct",validator.isText());
	}


	@Test
	public void testIsSomethingElse( ) {
		Validator validator = new Validator("h4x0r");
		assertTrue("Something else validation correct",validator.isSomethingElse());
		
		validator = new Validator("42");
		assertFalse("False something else validation correct",validator.isSomethingElse());
	}

	
	@Test
	public static TestSuite suite( ) {
		// Podriamos hacer simplemente esto:
		// RepeatedTest (el_test, n�mero_de_veces)
		//return new RepeatedTest(new TestSuite(TestValidador.class),5);
		
		// Pero vamos a usar TestSuite
		TestSuite mySuite = new ActiveTestSuite( );
		
		mySuite.addTest(new RepeatedTest(new ValidatorTest("testIsNumber"),50));
		mySuite.addTest(new RepeatedTest(new ValidatorTest("testIsText"),10));
		mySuite.addTest(new RepeatedTest(new ValidatorTest("testIsSomethingElse"),10));
		
		return mySuite;
	}
}