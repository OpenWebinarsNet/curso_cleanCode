package io.pello.refactorings.replaceparameterwitexplicitmethod;

import static org.junit.Assert.*;

import org.junit.Test;

import io.pello.refactorings.replaceparameterwitexplicitmethod.Vehicle;

public class VehicleTest {

	@Test
	public void testGetAcceleration() {
		Vehicle vehicle = new Vehicle(3,4);
		
		vehicle.initVehicle(1, 6);
		int expected = 6;
		int actual = vehicle.getAcceleration();
		
		assertEquals("Sets new acceleration", actual, expected);
	}

	@Test
	public void testGetSpeed() {
		Vehicle vehicle = new Vehicle(3,4);
		
		vehicle.initVehicle(3, 6);
		int expected = 6;
		int actual = vehicle.getSpeed();
		
		assertEquals("Sets new acceleration", actual, expected);
	}

}
