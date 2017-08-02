package io.pello.patterns.behavioral.strategy;

public class FastAttackStrategy implements AttackStrategy {
	@Override
	public int attack(Unit unit) {
		return unit.getSpeed() + unit.getIntelligence();
	}
}
