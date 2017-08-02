package io.pello.refactorings.pullup.refactored;

public class Car extends Vehicle {
	private String trunk;
	private boolean isTrunkOpened;
	
	public boolean isTrunkOpen() {
		return isTrunkOpened;
	}
}
