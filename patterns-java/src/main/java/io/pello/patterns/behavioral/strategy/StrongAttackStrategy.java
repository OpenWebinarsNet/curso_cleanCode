package io.pello.patterns.behavioral.strategy;

public class StrongAttackStrategy implements AttackStrategy {
	@Override
	public int attack(Unit unit) {
		return unit.getStrength() * (unit.getSpeed()/2);
	}
}
