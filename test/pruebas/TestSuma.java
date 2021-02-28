package pruebas;

/**
 * Esta clase contiene las pruebas unitarias de la clase Sumar
 * @author Nagib Delgado
 * @since 24/02/2021
 * @version 1.0
 */
import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import operaciones.Suma;

class TestSuma {
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception{
	}
	
	/**
	 * En esta prueba voy a comprobar que el metodo sumaDosReales funciona adecuadamente.
	 * El resultado de la prueba ser� positivo cuando devuelva la suma de dos n�meros reales
	 */
	@Test
	void testsumasumaDosReales() {
		
		assertEquals(4.3, Suma.sumaDosReales(2.1f, 2.2f), 0.1);
	}
	/**
	 * En esta prueba voy a comprobar si el metodo sumaDosReales funciona cuando se le pasa un n�mero negativo
	 */
	@Test
	void testSumaDosRealesUnoNegativo() {

		assertEquals(-1.1, Suma.sumaDosReales(-3.2f,2.1f),0.1);
		
	}
	
	/**
	 * En esta prueba voy a comprobar que el metodo sumaDosEnteros funciona adecuadamente.
	 * El resultado de la prueba ser� positivo cuando devuelva la suma de dos n�meros reales
	 */
	@Test
	void testSumaDosEnteros() {
		
		assertEquals(4, Suma.sumaDosEnteros(2,2));
		
	}
	/**
	 * En esta prueba voy a comprobar si el metodo sumaDosEnteros funciona cuando se le pasa un n�mero negativo
	 */
	@Test
	void testSumaDosEnterosUnoNegativo() {
		

		assertEquals(-1, Suma.sumaDosEnteros(-3,2));
		
	}
	
	/**
	 * En esta prueba voy a comprobar que el metodo sumaTresReales funciona adecuadamente.
	 * El resultado de la prueba ser� positivo cuando devuelva la suma de tres n�meros reales
	 */
	@Test
	void testSumaTresReales() {
		
		assertEquals(6.6f, Suma.sumaTresReales(2.1f, 2.2f, 2.3f),0.1);
	}
	
	/**
	 * En esta prueba realizamos el test sobre la suma Acumulada
	 */
	@Test
	void testsumaAcumulada() {
				
		Suma.sumaAcumulada(3);
		Suma.sumaAcumulada(2);
		
		assertEquals(5, Suma.getAcumulador());
	}



}
