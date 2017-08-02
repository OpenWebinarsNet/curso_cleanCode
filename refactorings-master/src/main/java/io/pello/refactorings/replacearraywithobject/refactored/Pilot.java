package io.pello.refactorings.replacearraywithobject.refactored;

public class Pilot {
	private String name;
	private String license;
	private int flightHours;

	public Pilot (String name, String license, int flightHours) {
		this.name = name;
		this.license = license;
		this.flightHours = flightHours;
	}

	public String toString() {
		return name;
	}
}
