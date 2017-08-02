package io.pello.patterns.creational.singleton;

/**
 * Die, implemented using singleton pattern
 * @author Pello Xabier Altadill Izura
 */
public class Die {
	
	// The reference to itself
	private static Die die;
	private final static int SIDES = 6;
	
	private Die () { }
	
	public static Die getInstance() {
		if (null == die) {
			die = new Die();
		} 
		return die;
	}
	
	public int roll () {
		return (int) (Math.random() * SIDES) + 1;
	}
}
