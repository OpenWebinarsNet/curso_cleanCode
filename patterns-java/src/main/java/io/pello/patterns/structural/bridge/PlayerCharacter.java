package io.pello.patterns.structural.bridge;

/**
 * Represents human character
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class PlayerCharacter extends Character {
	private String name;
	
	protected PlayerCharacter(Assignation assignationMethod, String name) {
		super(assignationMethod);
		this.name = name;
	}

	@Override
	public void generateCharacter() {
		int[] values = assignationMethod.generateValues();
		setStrength(values[0]);
		setSpeed(values[1]);
		setIntelligence(values[2]);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
