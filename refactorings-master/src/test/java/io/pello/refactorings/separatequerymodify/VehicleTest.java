package io.pello.refactorings.separatequerymodify;

import static org.junit.Assert.*;

import org.junit.Test;

public class VehicleTest {

	@Test
	public void testGetTypeTruck() {
		Vehicle car = new Vehicle(15);
		String expected = "Truck";
		String actual = car.getType();
		
		assertEquals("Truck is the most powerful", actual, expected);
	}

	@Test
	public void testGetTypeCar() {
		Vehicle car = new Vehicle(9);
		String expected = "Car";
		String actual = car.getType();
		
		assertEquals("Car is the quite powerful", actual, expected);
	}
	
	@Test
	public void testGetTypeBike() {
		Vehicle car = new Vehicle(3);
		String expected = "Bike";
		String actual = car.getType();
		
		assertEquals("Bike is the less powerful", actual, expected);
	}
}
