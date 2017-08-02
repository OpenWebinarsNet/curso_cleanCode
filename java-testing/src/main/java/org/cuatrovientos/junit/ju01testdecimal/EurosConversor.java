package org.cuatrovientos.junit.ju01testdecimal;


public class EurosConversor {

	private static final double EUROS_PESETAS_CHANGE = 166.386;

	public EurosConversor() {
	}
	

	public double euros2Pesetas (double euros) {
		return euros * EUROS_PESETAS_CHANGE;
	}


	public double pesetas2Euros (double pesetas) {
		return pesetas / EUROS_PESETAS_CHANGE;
	}

}