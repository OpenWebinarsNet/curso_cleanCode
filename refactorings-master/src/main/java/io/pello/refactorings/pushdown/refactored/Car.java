package io.pello.refactorings.pushdown.refactored;

import io.pello.refactorings.pushdown.Insurance;

public class Car extends Vehicle {
	private String trunk;
	private boolean isTrunkOpened;
	protected String plate;
	protected Insurance insurance;


	public boolean isTrunkOpen() {
		return isTrunkOpened;
	}


	public void start() {
	}

}
