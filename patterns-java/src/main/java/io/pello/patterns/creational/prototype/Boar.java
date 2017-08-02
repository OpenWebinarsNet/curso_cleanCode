
package io.pello.patterns.creational.prototype;

/**
 * The wild boar of the forest...
 * @author Pello Xabier Altadill Izura
 */
public class Boar extends BeastPrototype {

	private static final int BOAR_DEFENSE = 5;
	private static final int BOAR_MANA = 5;

	public Boar() {
		defense = BOAR_DEFENSE;
		mana = BOAR_MANA;
	}

	@Override
	public Boar clone() {
		return new Boar();
	}

	@Override
	public String getType() {
		return "Boar";
	}
}
