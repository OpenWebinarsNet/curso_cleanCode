package io.pello.patterns.structural.bridge;

/**
 * Represents game character
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public abstract class Character {
	protected Assignation assignationMethod;
	private int strength;
	private int speed;
	private int intelligence;
	
	protected Character (Assignation assignationMethod) {
		this.assignationMethod = assignationMethod;
	}
	
	public abstract void generateCharacter ();
	
	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	@Override
	public String toString() {
		return "Character [assignationMethod=" + assignationMethod + ", strength=" + strength + ", speed=" + speed
				+ ", intelligence=" + intelligence + "]";
	}
	
	
}
