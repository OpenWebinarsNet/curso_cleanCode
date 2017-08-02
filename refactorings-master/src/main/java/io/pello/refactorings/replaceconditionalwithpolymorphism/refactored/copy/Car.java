package io.pello.refactorings.replaceconditionalwithpolymorphism.refactored.copy;

public class Car extends Vehicle {
	
	public Car(int vehicleType, int speed, int acceleration) {
		super(vehicleType, speed, acceleration);

	}
	
	 @Override
	 public int move () {
		    return speed * acceleration * 5;
	}

}
