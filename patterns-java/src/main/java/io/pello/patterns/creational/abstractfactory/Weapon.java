
package io.pello.patterns.creational.abstractfactory;

public abstract class Weapon {
	protected String name;
	protected int type;

	public abstract int attackPoints();

	public abstract int defensePoints();
}
