package io.pello.refactorings.encapsulate.refactored;

/**
 * Refactored version
 */
public class Customer {

	private String name;
	private int id;

	public Customer() {
		init();
	}

	private void init() {
		setName("Eugene Krabs");
		setId(42);
	}

	public String toString() {
		return getId() + ":" + getName();
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}
}
