package io.pello.refactorings.replaceconditionalwithpolymorphism;

import static org.junit.Assert.*;

import org.junit.Test;

public class VehicleTest {

	@Test
	public void testMoveCar() {
		Vehicle vehicle = new Vehicle(0, 30, 50);
		int expected = 7500;
		int actual = vehicle.move();
		
		assertEquals("Car moves test", expected, actual);
	}
	
	@Test
	public void testMoveBike() {
		Vehicle vehicle = new Vehicle(1, 30, 50);
		int expected = 300;
		int actual = vehicle.move();
		
		assertEquals("Car moves test", expected, actual);
	}

	@Test
	public void testMovePlane() {
		Vehicle vehicle = new Vehicle(2, 30, 50);
		int expected = 100;
		int actual = vehicle.move();
		
		assertEquals("Car moves test", expected, actual);
	}
}
