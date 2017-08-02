package io.pello.refactorings.extractclass.refactored;

import java.util.Date;

public class CreditCard {
	private String creditCard;
	private Date creditCardDate;
	private int creditCardControlNumber;
	
	public CreditCard(String creditCard, Date creditCardDate, int creditCardControlNumber) {
		this.creditCard = creditCard;
		this.creditCardDate = creditCardDate;
		this.creditCardControlNumber = creditCardControlNumber;
	}

	public boolean isCardExpired () {
		return creditCardDate.before(new Date());
	}

	public boolean isValid () {
		boolean result = false;
		// Some code here...
		return result;
	}
	
	public Date getCreditCardDate() {
		return creditCardDate;
	}

	public void setCreditCardDate(Date creditCardDate) {
		this.creditCardDate = creditCardDate;
	}

	public int getCreditCardControlNumber() {
		return creditCardControlNumber;
	}

	public void setCreditCardControlNumber(int creditCardControlNumber) {
		this.creditCardControlNumber = creditCardControlNumber;
	}
}
