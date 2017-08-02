package io.pello.refactorings.replaceconditionalwithpolymorphism.refactored;

public class Plane extends Vehicle {

	public Plane(int vehicleType, int speed, int acceleration) {
		super(vehicleType, speed, acceleration);
	}

	@Override
	public int move() {
		return acceleration * 2;
	}
}
