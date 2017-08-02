package io.pello.patterns.behavioral.visitor;

public class ArmyUnitBlessingVisitor implements ArmyUnitVisitor {

	@Override
	public void spell(Bowman bowman) {
		System.out.println("Bowman was blessed with arrows");
		bowman.setArrows(1000);
	}

	@Override
	public void spell(Knight knight) {
		System.out.println("Knight was blessed with a faster horse");
		knight.setHorseSpeed(500);
	}

	@Override
	public void spell(Army army) {
		System.out.println("Knight was blessed with more knights");
		army.getArmyUnits().add(new Knight());
		army.getArmyUnits().add(new Knight());
	}
}
