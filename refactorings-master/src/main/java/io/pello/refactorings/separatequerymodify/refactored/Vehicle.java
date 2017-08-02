package io.pello.refactorings.separatequerymodify.refactored;

/**
 * Refactored version
 */
public class Vehicle {
	private int horsePower;
	private String type;

	public Vehicle(int power) {
		init(power);
	}

	private void init(int power) {
		setPower(power);
		setType();
	}

	private void setPower(int power) {
		horsePower = power;
	}

	private void setType() {
		if (horsePower >= 10) {
			type = "Truck";
		} else if (horsePower > 5 && horsePower < 10) {
			type = "Car";
		} else {
			type = "Bike";
		}
	}

	public int getHorsePower() {
		return horsePower;
	}

	public String getType() {
		return type;
	}
}
