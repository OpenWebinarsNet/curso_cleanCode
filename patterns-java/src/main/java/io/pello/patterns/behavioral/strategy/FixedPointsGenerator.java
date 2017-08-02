package io.pello.patterns.behavioral.strategy;

public class FixedPointsGenerator implements PointsGenerator {
	@Override
	public int[] generate() {
		return new int[]{6,6,6};
	}
}
