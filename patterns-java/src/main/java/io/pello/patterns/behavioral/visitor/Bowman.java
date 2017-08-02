package io.pello.patterns.behavioral.visitor;

public class Bowman  implements ArmyUnit {
	private int arrows = 10;
	
	@Override
	public void accept(ArmyUnitVisitor visitor) {
		visitor.spell(this);
	}

	@Override
	public String toString() {
		return "Bowman [arrows=" + arrows + "]";
	}

	public int getArrows() {
		return arrows;
	}

	public void setArrows(int arrows) {
		this.arrows = arrows;
	}
}
