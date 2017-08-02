package org.cuatrovientos.junit.ju03granularity;

import java.util.Vector;

/**
* Represents a team with players. Players are represented by numbers
*/
public class Team {
	
	private Vector<Integer> numbers;
	private String name;


	public Team(String name) {
		numbers = new Vector<Integer>();
		this.name = name;
	}
	

	public String getName () {
		return name;
	}
	

	public int totalNumbers () {
		return numbers.size();
	}
	

	public void addNumber (Integer number) {
		if (number >= 0 && number <= 99) {
			numbers.addElement(number);
		}	
	}
	

	public Integer numberAt (int position) {
		if (totalNumbers() > 0)
			return numbers.elementAt(position);
		else
			return -1;
	}

	public boolean removeNumber (Integer number) {
			return numbers.removeElement(number);
	}


	public void removeNumberAt (int position) {
		numbers.removeElementAt(position);
	}
}