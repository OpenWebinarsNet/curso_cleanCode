package io.pello.refactorings.extractclass.refactored;

import java.util.Date;

/**
* Refactored version
*/
public class Customer {
	private String name;
	private String dni;
	private CreditCard creditCard;


	public Customer(String name, String dni) {
		this.name = name;
		this.dni = dni;

	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	
}
