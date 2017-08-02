package io.pello.patterns.structural.composite;

import java.util.ArrayList;
import io.pello.patterns.creational.singleton.Die;

/**
 * Implements war unit interface
 * 
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class Knight implements WarUnitComponent {

	private static final int KNIGHT_MODIFIER = 4;

	/**
	 * adds a new WarUnitComponent, but not applicable here
	 */
	public void add(WarUnitComponent unit) {
		// there is a choice between transparency and safety
		// In these case, as we area extending an interface
		// we leave this blank.
	}

	public void del(WarUnitComponent unit) {
		// same ass add method
	}

	public int attack() {
		return Die.getInstance().roll() + KNIGHT_MODIFIER;
	}
	
	public int defend() {
		return Die.getInstance().roll() + (KNIGHT_MODIFIER - 1);
	}

	/**
	 * if it's a composite, it holds more components.
	 */
	public ArrayList<WarUnitComponent> getChild() {
		return null;
	}
}
