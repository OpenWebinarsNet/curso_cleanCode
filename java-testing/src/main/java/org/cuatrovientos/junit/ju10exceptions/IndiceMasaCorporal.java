package org.cuatrovientos.junit.ju10exceptions;


/**
* clase IndiceMasaCorporal
* Dado un peso y una altura la clase calcula el �ndice de 
* Masa Corporal que relacion peso y seg�n el valor de una
* valoraci�n.
*/
public class IndiceMasaCorporal {
	
	private float altura;
	private float peso;

	
	IndiceMasaCorporal (float peso, float altura)
	{
		this.peso = peso;
		this.altura = altura;
	}
	
	IndiceMasaCorporal (String peso, String altura) throws NumberFormatException
	{
		this.peso = Float.parseFloat(peso);
		this.altura = Float.parseFloat(altura);
	}
	
	public float calcularIMC ()  throws Exception {
		if (peso < 0 || altura < 0) {
			throw new Exception("No pueden ser negativos!");
		}
		return (peso / (altura * altura)) * 10000;
	}
	
	public String diagnostico () throws Exception {		
		float imc = calcularIMC();
		
		if (imc < 18) {
			return "Tienes que engordar";
		} else if (imc >= 18 && imc < 25) {
			return "Muy bien";
		} else {
			return "Sobrepeso";
		} 
	}
	
}