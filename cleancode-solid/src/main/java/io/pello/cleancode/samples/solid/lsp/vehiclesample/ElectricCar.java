package io.pello.cleancode.samples.solid.lsp.vehiclesample;

public class ElectricCar extends Vehicle {

	@Override
	public void start() {
		// Range is not changed
	}

	@Override
	public void brake() {
		range++; // electric cars use brake to recharge!
	}

	@Override
	public void stop() {
		// Range should decrease slowly!!
	}

}
