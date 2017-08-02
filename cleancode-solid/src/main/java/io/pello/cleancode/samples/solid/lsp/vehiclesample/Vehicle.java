package io.pello.cleancode.samples.solid.lsp.vehiclesample;

public class Vehicle {
	protected String model;
	protected String plate;
	protected int range;

	public void start() {
		if (range > 2) 
			range = range - 2;
	}
	
	public void accelerate () {
		if (range > 0) 
			range--;
	}
	
	public void brake() {
		
	}
	public void stop () {
		if (range > 0) 
			range--;
	}

	public void charge(int petrol) {
		range = range + petrol;
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}
}
