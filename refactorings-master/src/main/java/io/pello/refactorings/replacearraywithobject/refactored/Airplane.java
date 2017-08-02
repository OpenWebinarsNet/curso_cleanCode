package io.pello.refactorings.replacearraywithobject.refactored;

import java.util.Arrays;

/**
 * Refactored version
 */
public class Airplane {

	private String model;
	private Pilot pilot;

	public Airplane(String model) {
		this.model = model;
	}

	public void initPilot(String name, String license, int flightHours) {
		pilot = new Pilot(name, license, flightHours);
	}

	@Override
	public String toString() {
		return "Airplane [model=" + model + ", pilot=" + pilot + "]";
	}
}
