package io.pello.refactorings.replacetempwithquery;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StudentTest {


	@Test
	public void testAverageGoodAttitude() {
		Student student = new Student("Eugene Krabs", true);
		float expected = 10.1f;
		float actual = student.calculateAverage(9.5f, 8.7f);
		
		assertEquals("Correct assesment", actual, expected, 0.01f);
	}
	
	@Test
	public void testAverageBadAttitude() {
		Student student = new Student("Dani", false);
		float expected = 5.95f;
		float actual = student.calculateAverage(5.5f, 6.4f);
		
		assertEquals("Correct assesment", actual, expected, 0.01f);
	}

}
