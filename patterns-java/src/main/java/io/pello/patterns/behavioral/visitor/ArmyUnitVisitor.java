package io.pello.patterns.behavioral.visitor;

public interface ArmyUnitVisitor {
	public void spell(Bowman bowman);
	public void spell(Knight knight);
	public void spell(Army army);
}
