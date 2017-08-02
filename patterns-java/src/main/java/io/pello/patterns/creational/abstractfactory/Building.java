package io.pello.patterns.creational.abstractfactory;

public abstract class Building {
	protected int type;
	protected int armor;

	public abstract void build();

	public abstract void destroy();

	public abstract void upgrade();

	public abstract String toString();
}