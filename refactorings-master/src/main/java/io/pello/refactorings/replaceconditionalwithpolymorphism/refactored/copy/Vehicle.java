package io.pello.refactorings.replaceconditionalwithpolymorphism.refactored.copy;

public abstract class Vehicle {
	protected int vehicleType;
	protected int speed;
	protected int acceleration;

	public Vehicle(int vehicleType, int speed, int acceleration) {
		this.vehicleType = vehicleType;
		this.speed = speed;
		this.acceleration = acceleration;
	}
	
	 public abstract int move ();
}
