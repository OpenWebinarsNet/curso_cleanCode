 
package io.pello.patterns.creational.factory;


public abstract class Treasure {
	private String name;
	private int value;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}

	public abstract String getType();


	@Override
	public String toString() {
		return "Treasure [name=" + name + ", value=" + value + "]";
	}

}
