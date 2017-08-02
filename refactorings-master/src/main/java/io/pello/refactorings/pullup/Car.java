package io.pello.refactorings.pullup;

public class Car extends Vehicle {
	private String plate;
	private String trunk;
	private boolean isTrunkOpened;
	
	public void start() {
	}

	public boolean isTrunkOpen() {
		return isTrunkOpened;
	}
}
