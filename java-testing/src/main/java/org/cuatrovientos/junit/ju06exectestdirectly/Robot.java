package org.cuatrovientos.junit.ju06exectestdirectly;

/**
* Simple class representing a robot, with proper methods to show
* a wide range of testing ways
*/
public class Robot {
	
	private String name;
	private double autonomy;

	public Robot(String nombre) {
		this.name = nombre;
		autonomy = 42;
	}
	
	public double getAutonomy () {
		return autonomy;
	}

	public void setAutonomy (double autonomy) {
		if (autonomy <= 0) {
			this.autonomy = 42.0;
		}	else {
			this.autonomy = autonomy;
		}
	}

}