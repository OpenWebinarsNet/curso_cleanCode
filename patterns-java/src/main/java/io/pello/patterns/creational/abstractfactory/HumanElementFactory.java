package io.pello.patterns.creational.abstractfactory;

public class HumanElementFactory extends GameElementFactory {

	@Override
	public Character createCharacter() {
		return new HumanCharacter();
	}

	@Override
	public Building createBuilding() {
		return new HumanBuilding();
	}

	@Override
	public Weapon createWeapon() {
		return new HumanWeapon();
	}
}
