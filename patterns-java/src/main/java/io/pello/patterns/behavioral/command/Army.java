package io.pello.patterns.behavioral.command;

/**
 * Represents an army
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class Army {
	private int totalLife = 10;
	
	public void move () {
		System.out.println("Army on the move");
	}
	
	public int attack () {
		System.out.println("Army attacking");
		return (int)Math.random() * 6;
	}

	public int defend () {
		System.out.println("Army defending");
		return (int)Math.random() * 6;
	}

	// getters/setters...
	public int getTotalLife() {
		return totalLife;
	}

	public void setTotalLife(int totalLife) {
		this.totalLife = totalLife;
	}

	@Override
	public String toString() {
		return "Army [totalLife=" + totalLife + "]";
	}
	
	
}
