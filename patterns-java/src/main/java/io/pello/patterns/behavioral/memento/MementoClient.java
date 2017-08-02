package io.pello.patterns.behavioral.memento;

import io.pello.patterns.creational.abstractfactory.HumanWeapon;

/**
 * Client to test memento pattern sample
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class MementoClient {
	public static void main (String args[]) {
		UnitOriginator unit = new UnitOriginator("Conan",100,"General", new HumanWeapon());
		CareTaker careTaker = new CareTaker();
		careTaker.setMemento(unit.createMemento());
		
		System.out.println("Unit is: " + unit.toString());
		
		unit.setLife(50);
		unit.setRange("captain");
		unit.setWeapon(new HumanWeapon());
	
		System.out.println("Unit is: " + unit.toString());

		unit.setUnitMemento(careTaker.getMemento());
		System.out.println("Unit recovered status is: " + unit.toString());
	}
}
