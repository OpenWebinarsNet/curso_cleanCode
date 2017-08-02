package io.pello.refactorings.removecontrolflag;

import static org.junit.Assert.*;

import org.junit.Test;

public class FriendsTest {

	@Test
	public void testIndexOfNormalFound() {
		Friends friends = new Friends(new String[]{"Squidward","SpongeBob","Eugene"});
		int expected = 1;
		int actual = friends.indexOf("SpongeBob");
		
		assertEquals("Finds name in friends",expected, actual);
	}
	
	@Test
	public void testIndexOfNormalNotFound() {
		Friends friends = new Friends(new String[]{"Eugene","SpongeBob","Squidward"});
		int expected = -1;
		int actual = friends.indexOf("Juan");
		
		assertEquals("Does not find name in friends",expected, actual);
	}

}
