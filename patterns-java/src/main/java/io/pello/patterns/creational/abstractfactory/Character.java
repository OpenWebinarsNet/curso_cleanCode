
package io.pello.patterns.creational.abstractfactory;

public abstract class Character {
	protected String name;
	protected int strength;
	protected int speed;
	protected int armor;

	public abstract int attack();

	public abstract int defend();

	public abstract void walk(int position);

	public abstract String toString();
}
