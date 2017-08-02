package io.pello.refactorings.replaceconditionalwithpolymorphism.refactored.copy;

import static org.junit.Assert.*;

import org.junit.Test;

public class VehicleTest {

	@Test
	public void testMoveCar() {
		Car car = new Car(0, 30, 50);
		int expected = 7500;
		int actual = car.move();
		
		assertEquals("Car moves test", expected, actual);
	}
	
	@Test
	public void testMoveBike() {
		Bike bike = new Bike(1, 30, 50);
		int expected = 300;
		int actual = bike.move();
		
		assertEquals("Car moves test", expected, actual);
	}

	@Test
	public void testMovePlane() {
		Plane plane = new Plane(2, 30, 50);
		int expected = 100;
		int actual = plane.move();
		
		assertEquals("Car moves test", expected, actual);
	}
}
