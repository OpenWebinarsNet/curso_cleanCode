package io.pello.refactorings.introducenullobject;

import static org.junit.Assert.*;

import org.junit.Test;

public class WarriorTest {

	private static final int DAMAGE = 10;

	@Test
	public void testGetDamage() {
		Warrior warrior = new Warrior(new Weapon(DAMAGE));
		int actual = warrior.attack();
		
		for (int i = 0; i< 100; i++)
			assertTrue("Testing attack value", actual >= DAMAGE && actual <= DAMAGE+4);			
	}
	


}
