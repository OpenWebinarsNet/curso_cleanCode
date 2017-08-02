package io.pello.patterns.behavioral.visitor;

public class ArmyUnitCurseVisitor implements ArmyUnitVisitor {

	public void spell(Bowman bowman) {
		System.out.println("Bowman was cursed with arrow loss");
		bowman.setArrows(0);
	}

	@Override
	public void spell(Knight knight) {
		System.out.println("Knight was cursed with a slow horse");
		knight.setHorseSpeed(-10);
	}

	@Override
	public void spell(Army army) {
		System.out.println("Army is cursed");
		army.getArmyUnits().clear();
	}
}
