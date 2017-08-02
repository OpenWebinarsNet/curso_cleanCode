package org.cuatrovientos.junit.ju10exceptions;




import org.junit.Test;
import static org.junit.Assert.*;

/**
* TestIndiceMasaCorporal
* Clase de testeo para la clase {@link IndiceMasaCorporal}.
* La clase IndiceMasaCorporal puede lanzar excepciones en uno
* de sus constructores y en un m�todo de c�lculos.
* Queremos provocar un error para comprobar que la clase
* IndiceMasaCorporal lanza una excepci�n cuando debe.
*
* Lo que se debe hacer al testear es provocar un error con
* la orden fail() en caso de que NO se haya lanzado una excepci�n.
* De la excepci�n ya se encarga jUnit y sigue adelante con el resto
* de los tests.

*/
public class TestIndiceMasaCorporal {
	
	
	/**
	* testEsNumero
	* comprueba que una cadena es un n�mero
	*/
	@Test
	public void testCalcularIMC( )  {
		IndiceMasaCorporal indiceMasaCorporal = new IndiceMasaCorporal(74.0F, 173.0F);
		float esperado = (74.0F / (173.0F * 173.0F)) * 10000F;
		try {
			assertEquals("C�lculo de IMC correcto, margen 0.1",indiceMasaCorporal.calcularIMC(),esperado,0.1);
		} catch (Exception e) {
		}
	}
	
	/**
	* testDiagnostico
	* comprueba que el dian�stico es correcto
	*/
	@Test
	public void testDiagnostico( ) {
		IndiceMasaCorporal indiceMasaCorporal = new IndiceMasaCorporal("67.0", "168.0");
		try {
			assertEquals("Diagn�istico de IMC correcto",indiceMasaCorporal.diagnostico(),"Muy bien");
		} catch (Exception e) {
		}
	}
	
	/**
	* testExcepcion
	* comprueba que este test lanza excepci�n, pasando
	* par�metros incorrectos al constructor
	*/
	@Test
	public void testExcepcion( ) {
		try {
			IndiceMasaCorporal indiceMasaCorporal = new IndiceMasaCorporal("67.0", "JEJE");
			assertTrue("ERROR, deb�a haber lanzado excepci�n", false);
		} catch (NumberFormatException nfe) {
			System.out.println("Excepci�n tal y como se esperaba: " + nfe.getMessage());
		}
	}
	
	/**
	* testExcepcionNegativos
	* comprueba que este test lanza excepci�n, pasando
	* par�metros negativos a la operaci�n de c�lculo
	*/
	@Test
	public void testExcepcionNegativos( ) {
		IndiceMasaCorporal indiceMasaCorporal = new IndiceMasaCorporal("67.0", "-5.0");

		try {
			assertEquals("Diagn�istico de IMC correcto",indiceMasaCorporal.diagnostico(),"Muy bien");
			fail("ERROR, deb�a haber lanzado excepci�n por n�meros negativos");
		} catch (Exception e) {
			System.out.println("Excepci�n por negativos tal y como se esperaba: " + e.getMessage());
		}
	}
	
	@Test(expected = Exception.class)
	public void testExcepcionNegativosAnotaciones( ) throws Exception {
		IndiceMasaCorporal indiceMasaCorporal = new IndiceMasaCorporal("67.0", "-5.0");
			assertEquals("Diagn�istico de IMC correcto",indiceMasaCorporal.diagnostico(),"Muy bien");

	}
}