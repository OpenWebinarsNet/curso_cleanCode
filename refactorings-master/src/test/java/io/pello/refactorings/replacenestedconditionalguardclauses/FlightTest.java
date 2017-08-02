package io.pello.refactorings.replacenestedconditionalguardclauses;

import static org.junit.Assert.*;

import org.junit.Test;

public class FlightTest {

	@Test
	public void testPriceForPassenger() {
		Flight flight = new Flight(100);
		float expected = 2000;
		float actual = flight.priceForPassenger(new Passenger(false, false));
		
		assertEquals("Price for unemployed", expected, actual, 0.01f);
	}
	
	@Test
	public void testPriceForPassengerUnemployed() {
		Flight flight = new Flight(100);
		float expected = 1600;
		float actual = flight.priceForPassenger(new Passenger(true, false));
		
		assertEquals("Price for unemployed", expected, actual, 0.01f);
	}
	
	@Test
	public void testPriceForPassengerChildren() {
		Flight flight = new Flight(100);
		float expected = 1800;
		float actual = flight.priceForPassenger(new Passenger(false, true));
		
		assertEquals("Price for child", expected, actual, 0.01f);
	}

}
