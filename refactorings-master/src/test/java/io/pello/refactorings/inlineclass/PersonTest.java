package io.pello.refactorings.inlineclass;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import io.pello.refactorings.inlineclass.Person;

public class PersonTest {

	@Test
	public void testToString() {
		Person person = new Person("Eugene Krabs", new Date(), 1);
		String expected = "Person [name=Eugene Krabs, sex=1]";
		String actual = person.toString();
		
		assertEquals("Sets name and sex correctly", expected, actual);

	}

}
