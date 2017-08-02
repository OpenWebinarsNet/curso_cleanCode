package io.pello.refactorings.encapsultacollection;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class TeamTest {

	@Test
	public void testTotalPlayers() {
		Team team = new Team("Oviedo", new Date());
		int expected = 0;
		int actual = team.totalPlayers();
		
		assertEquals("Starting players zero", actual, expected);
	}

}
