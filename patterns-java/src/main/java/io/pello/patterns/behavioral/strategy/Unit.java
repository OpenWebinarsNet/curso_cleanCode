package io.pello.patterns.behavioral.strategy;

/**
 * This class will be able to use different strategies to assing values
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class Unit {
	private int strength;
	private int speed;
	private int intelligence;
	private PointsGenerator pointsGenerator;
	private AttackStrategy attackStrategy;
	
	public Unit (PointsGenerator pointsGenerator, AttackStrategy attackStrategy) {
		this.pointsGenerator = pointsGenerator;
		this.attackStrategy = attackStrategy;
		init();
	}
	
	 // this method makes use of the strategy
	private void init() {
		int [] values = pointsGenerator.generate();
		strength = values[0];
		speed = values[1];
		intelligence = values[2];
	}
	
	public int attack () {
		return attackStrategy.attack(this);
	}

	public int getStrength() {
		return strength;
	}

	public int getSpeed() {
		return speed;
	}

	public int getIntelligence() {
		return intelligence;
	}

	@Override
	public String toString() {
		return "Unit [strength=" + strength + ", speed=" + speed
				+ ", intelligence=" + intelligence + "]";
	}
	
	
}
