package io.pello.refactorings.replacearraywithobject;

import java.util.Arrays;

/**
 * Replace Array with Object This class is intended to be used as a refactoring
 * playground
 * 
 * @author PELLO_ALTADILL
 */
public class Airplane {

	private String model;
	private String pilotData[] = new String[3];

	public Airplane(String model) {
		this.model = model;
	}

	public void initPilot(String name, String license, int flightHours) {
		pilotData[0] = name;
		pilotData[1] = license;
		pilotData[2] = Integer.toString(flightHours);
	}

	@Override
	public String toString() {
		return "Airplane [model=" + model + ", pilot=" + pilotData[0] + "]";
	}
}
