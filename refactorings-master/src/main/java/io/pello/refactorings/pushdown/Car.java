package io.pello.refactorings.pushdown;

public class Car extends Vehicle {
	private String trunk;
	private boolean isTrunkOpened;
	
	public void start() {
	}

	public boolean isTrunkOpen() {
		return isTrunkOpened;
	}

}
