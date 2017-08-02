package io.pello.refactorings.removeparameterassignment;

import static org.junit.Assert.*;

import org.junit.Test;

public class StudentTest {

	@Test
	public void testEvaluateTermPass() {
		Student student = new Student();
		float expected = 7.7f;
		float actual = student.evaluateTerm(6.5f, 7.9f, 0.5f);
		
		assertEquals("Evaluates the term correctly", expected, actual, 0.01f);
	}
	
	@Test
	public void testEvaluateTermFail() {
		Student student = new Student();
		float expected = 3.25f;
		float actual = student.evaluateTerm(4.5f, 3.9f, 0.5f);
		
		assertEquals("Evaluates the term correctly", expected, actual, 0.01f);
	}

}
