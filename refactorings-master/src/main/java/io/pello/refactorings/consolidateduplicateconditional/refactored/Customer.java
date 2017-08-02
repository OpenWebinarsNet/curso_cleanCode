package io.pello.refactorings.consolidateduplicateconditional.refactored;

public class Customer {
	private boolean isVip;
	
	public Customer (boolean isVip) {
		this.isVip = isVip;
	}

	public boolean isVip () {
		return isVip;
	}
}
