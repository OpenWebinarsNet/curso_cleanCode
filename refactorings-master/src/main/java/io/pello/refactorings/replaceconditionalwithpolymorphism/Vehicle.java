package io.pello.refactorings.replaceconditionalwithpolymorphism;

public class Vehicle {

	private static final int CAR = 0;
	private static final int BIKE = 1;
	private static final int PLANE = 2;
	private int vehicleType;
	private int speed;
	private int acceleration;

	public Vehicle(int vehicleType, int speed, int acceleration) {
		this.vehicleType = vehicleType;
		this.speed = speed;
		this.acceleration = acceleration;
	}
	
	public int move () {
		  int result = 0;
		  switch (vehicleType) {
		    case CAR:
		              result = speed * acceleration * 5;
		              break;
		    case BIKE:
		              result = speed * 10;
		              break;
		    case PLANE:
		              result = acceleration * 2;
		              break;
		  }
		  return result;
		}
}
