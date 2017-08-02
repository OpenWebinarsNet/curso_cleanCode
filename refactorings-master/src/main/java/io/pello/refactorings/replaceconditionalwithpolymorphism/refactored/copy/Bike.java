package io.pello.refactorings.replaceconditionalwithpolymorphism.refactored.copy;

public class Bike extends Vehicle {
	
	public Bike(int vehicleType, int speed, int acceleration) {
		super(vehicleType, speed, acceleration);

	}
	
	 @Override
	 public int move () {
		    return speed * 10;
	}

}
