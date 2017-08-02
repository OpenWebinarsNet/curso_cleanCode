package io.pello.patterns.structural.composite;

import java.util.ArrayList;
import io.pello.patterns.creational.singleton.Die;

/**
 * Squad implements war unit interface, and contains more than one
 * war unit as well. 
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class Squad implements WarUnitComponent {

	private ArrayList<WarUnitComponent> units = new ArrayList<WarUnitComponent>();

	public void add(WarUnitComponent unit) {
		units.add(unit);
	}

	public void del(WarUnitComponent unit) {
		units.remove(unit);
	}

	public int attack() {
		int total = 0;
		for (WarUnitComponent unit: units) {
			total = total + unit.attack();
		}
		return total;
	}

	public int defend() {
		int total = 0;
		for (WarUnitComponent unit: units) {
			total = total + unit.defend();
		}
		return total;
	}

	/**
	 * if it's a composite, it holds more components.
	 */
	public ArrayList<WarUnitComponent> getChild() {
		return units;
	}

}
