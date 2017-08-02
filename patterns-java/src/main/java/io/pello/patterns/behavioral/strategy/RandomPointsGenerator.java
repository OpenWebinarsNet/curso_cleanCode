package io.pello.patterns.behavioral.strategy;

public class RandomPointsGenerator implements PointsGenerator {
	@Override
	public int[] generate() {
		int [] values = new int[3];
		for (int i = 0;i<3;i++) {
			values[i] = (int)(Math.random() * 8);
		}
		return values;
	}
}
