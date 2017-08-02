package org.cuatrovientos.junit.ju04setupteardown;


/**
 * Represents a car, depending on the type of engine
 * consumption will be different
 */
public class Car {
	
	private String brand;
	private double tankCapacity = 50.0;
	private double tankStatus = 0.0;
	private int type;

	public static final int DIESEL = 0;
	public static final int GASOLINE = 1;
	private static final double DIESEL_CONSUMPTION = 0.6;
	private static final double GASOLINE_CONSUMPTION = 0.9;

	public Car(String brand, int type) {
		this.brand = brand;
		this.type = type;
	}
	
	public void loadTank () {
		tankStatus = tankCapacity;
	}
	
	public String getBrand () {
		return brand;
	}
	
	public double getTank () {
		return tankStatus;
	}
	
	public void drive (int kilometers) {
		double result = 0;
		
		result = (tankStatus - calculateComsumption(kilometers));
		
		tankStatus = (result > 0)?result:0;

	}
	
	private double calculateComsumption (int kilometers) {
		double comsumed = 0;
		
		switch (this.type) {
			case DIESEL :  
							comsumed = DIESEL_CONSUMPTION * kilometers;
						   	break;
			case GASOLINE :
							comsumed = GASOLINE_CONSUMPTION * kilometers; 
							break;
			default :		
							comsumed = 0;
							break;
		}	
		
		return comsumed;
	}
	

}