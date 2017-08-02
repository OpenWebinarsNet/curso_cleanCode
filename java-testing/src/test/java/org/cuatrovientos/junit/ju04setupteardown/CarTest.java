
package org.cuatrovientos.junit.ju04setupteardown;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileReader;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CarTest {

	private BufferedReader fileReader;
	private Car targetCar;
	private String readedBrand;
	

	@Before
	public void setUp() throws Exception {
		fileReader = new BufferedReader(new FileReader(getClass().getResource("/brand.txt").getFile()));
		readedBrand = fileReader.readLine();
		
		System.out.println("setUp> read brand: " + readedBrand);
		
		targetCar = new Car(readedBrand, Car.DIESEL);
	}
	
	

	@Test
	public void testMarca() {
		// Comprueba que la marca del coche es la misma leida por pantalla
		assertEquals("Brand assignment", targetCar.getBrand(), readedBrand);
	}
	

	@Test
	public void testLoad() {
		targetCar.loadTank();
		assertEquals("Desposit load correct", targetCar.getTank(),50.0,0.1);
	}

	@Test
	public void testConsumo() {
		targetCar.loadTank();
		targetCar.drive(10);
		assertEquals("Consumption test", targetCar.getTank(), (50.0 - (10*0.6)), 0.1);
	}
	

	@Test
	public void testEmptyTank() {
		targetCar.loadTank();
		targetCar.drive(500);
		assertEquals("Empty tank test", targetCar.getTank(), 0.0,0.0);
	}
	
	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown> ending test...");	
		fileReader.close();
	
		targetCar = null;
	}


}
