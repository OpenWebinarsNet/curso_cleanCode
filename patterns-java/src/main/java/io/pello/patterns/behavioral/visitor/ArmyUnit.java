package io.pello.patterns.behavioral.visitor;


public interface ArmyUnit {
	public void accept(ArmyUnitVisitor visitor);
}
