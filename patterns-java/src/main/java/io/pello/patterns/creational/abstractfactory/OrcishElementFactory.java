package io.pello.patterns.creational.abstractfactory;

public class OrcishElementFactory extends GameElementFactory {

	@Override
	public Character createCharacter() {
		return new OrcishCharacter();
	}

	@Override
	public Building createBuilding() {
		return new OrcishBuilding();
	}

	@Override
	public Weapon createWeapon() {
		return new OrcishWeapon();
	}

}
