package io.pello.patterns.behavioral.visitor;

import java.util.ArrayList;

public class Army implements ArmyUnit {
	private ArrayList<ArmyUnit> armyUnits = 
			new ArrayList<ArmyUnit>();
	
	public Army() {
		armyUnits.add(new Bowman());
		armyUnits.add(new Bowman());
		armyUnits.add(new Bowman());
		armyUnits.add(new Knight());
		armyUnits.add(new Knight());
	}
	
	@Override
	public void accept(ArmyUnitVisitor visitor) {
		 for (ArmyUnit unit : armyUnits) {
	            unit.accept(visitor);
	        }
	        visitor.spell(this);	
	}
	
	public ArrayList<ArmyUnit> getArmyUnits() {
		return armyUnits;
	}

	@Override
	public String toString() {
		return "Army [armyElements=" + armyUnits + "]";
	}
}
