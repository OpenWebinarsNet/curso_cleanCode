package io.pello.patterns.behavioral.visitor;

public class Knight  implements ArmyUnit {
	private int horseSpeed = 1;

	@Override
	public void accept(ArmyUnitVisitor visitor) {
		visitor.spell(this);
	}

	public int getHorseSpeed() {
		return horseSpeed;
	}

	public void setHorseSpeed(int horseSpeed) {
		this.horseSpeed = horseSpeed;
	}

	@Override
	public String toString() {
		return "Knight [horseSpeed=" + horseSpeed + "]";
	}
}
