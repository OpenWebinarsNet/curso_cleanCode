package io.pello.patterns.behavioral.strategy;

/**
 * Simple class to make use of Strategy pattern sample
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class StrategyClient {
	public static void main (String args[]) {
		Unit randomUnit = new Unit(new RandomPointsGenerator(), new FastAttackStrategy());
		Unit fixedUnit = new Unit(new FixedPointsGenerator(), new StrongAttackStrategy());
		
		System.out.println(randomUnit);
		System.out.println(fixedUnit);
	}
}
