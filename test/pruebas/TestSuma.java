package pruebas;

/**
 * Esta clase contiene las pruebas unitarias de la clase Sumar
 * @author Nagib Delgado
 * @since 24/02/2021
 * @version 1.0
 */
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

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
	 * El resultado de la prueba será positivo cuando devuelva la suma de dos números reales
	 */
	@Test
	void testsumasumaDosReales() {
		Suma s1 = new Suma();
		
		assertEquals(4.3, s1.sumaDosReales(2.1f, 2.2f), 0.1);
	}
	/**
	 * En esta prueba voy a comprobar si el metodo sumaDosReales funciona cuando se le pasa un número negativo
	 */
	@Test
	void testSumaDosRealesUnoNegativo() {
		Suma s1 = new Suma();

		assertEquals(-1.1, s1.sumaDosReales(-3.2f,2.1f),0.1);
		
	}
	
	/**
	 * En esta prueba voy a comprobar que el metodo sumaDosEnteros funciona adecuadamente.
	 * El resultado de la prueba será positivo cuando devuelva la suma de dos números reales
	 */
	@Test
	void testSumaDosEnteros() {
		Suma s1 = new Suma();

		assertEquals(4, s1.sumaDosEnteros(2,2));
		
	}
	/**
	 * En esta prueba voy a comprobar si el metodo sumaDosEnteros funciona cuando se le pasa un número negativo
	 */
	@Test
	void testSumaDosEnterosUnoNegativo() {
		Suma s1 = new Suma();

		assertEquals(-1, s1.sumaDosEnteros(-3,2));
		
	}
	
	/**
	 * En esta prueba voy a comprobar que el metodo sumaTresReales funciona adecuadamente.
	 * El resultado de la prueba será positivo cuando devuelva la suma de tres números reales
	 */
	@Test
	void testSumaTresReales() {
		Suma s1 = new Suma();
		
		assertEquals(6.6f, s1.sumaTresReales(2.1f, 2.2f, 2.3f),0.1);
	}
	
	/**
	 * En esta prueba realizamos el test sobre la suma Acumulada
	 */
	@Test
	void testsumaAcumulada() {
		Suma s1 = new Suma();
		
		s1.sumaAcumulada(3);
		s1.sumaAcumulada(2);
		
		assertEquals(5, s1.getAcumulador());
	}



}
