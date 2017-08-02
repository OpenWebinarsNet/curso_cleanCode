package io.pello.refactorings.hidedelegate;

import java.util.Random;

public class Die {
	private Random random = new Random();
	
	public int roll() {
		return random.nextInt(6) + 1;
	}
}
