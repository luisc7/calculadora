package pruebas;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import operaciones.Dividir;

/**
 * Esta clase contiene las pruebas unitarias en JUnit5 para la clase Dividir.
 * @author Luis Cifuentes
 * @since 22/02/2021
 * @version 1.0
 *
 */

class TestDividir {
	
	////////DIVISION REALES ////////

	/**
	 * Probar si el resultado es exacto.
	 */
	@Test
	void testDiv2Reales1() {		
		assertEquals(1.5, Dividir.div2reales(3, 2), 0);
	}
	
	/**
	 * Probar si devuelve infinito cuando dividimos un número positivo entre cero.
	 */
	@Test
	void testDiv2RealesPosEntreCero() {
		assertEquals(Double.POSITIVE_INFINITY, Dividir.div2reales(3, 0), 0);
	}
	
	/**
	 * Probar si devuelve menos infinito cuando dividimos un número negativo entre cero.
	 */
	@Test
	void testDiv2RealesNegEntreCero() {
		assertEquals(Double.NEGATIVE_INFINITY, Dividir.div2reales(-3, 0), 0);
	}
	
	/**
	 * Probar si devuelve NaN cuando dividimos cero entre cero.
	 */
	@Test
	void testDiv2RealesCeroEntreCero() {
		assertEquals(Double.NaN, Dividir.div2reales(0, 0), 0);
	}
	
	//////// DIVISION ENTEROS ////////
	
	/**
	 * Probar si devuelve una excepción al dividir entre cero.
	 */
	@Test
	void testDiv2EnterosEntreCero() {
		Exception excep = assertThrows(ArithmeticException.class, () -> Dividir.div2enteros(7, 0));
		assertTrue(excep.getMessage().contains("/ by zero"));
	}
	
	/**
	 * Probar si devuelve una excepción al dividir cero entre cero.
	 */
	@Test
	void testDiv2EnterosCeroEntreCero() {
		Exception excep = assertThrows(ArithmeticException.class, () -> Dividir.div2enteros(0, 0));
		assertTrue(excep.getMessage().contains("/ by zero"));
	}
	
	/**
	 * Probar si el resultado tiene un error menor o igual a la precisión de un entero (1.0).
	 */
	@Test
	void testDiv2Enteros1() {		
		assertEquals(9, Dividir.div2enteros(57, 7), 1.0);
	}
	
	/**
	 * Probar si el signo es coherente, con primer parámetro negativo.
	 */
	@Test
	void testDiv2EnterosSigno1() {		
		assertTrue(Dividir.div2enteros(-56, 7) < 0);
	}
	
	/**
	 * Probar si el signo es coherente, con segundo parámetro negativo.
	 */
	@Test
	void testDiv2EnterosSigno2() {		
		assertTrue(Dividir.div2enteros(56, -7) < 0);
	}
	
	/**
	 * Probar si el signo es coherente, con ambos parámetros negativos.
	 */
	@Test
	void testDiv2EnterosSigno3() {		
		assertTrue(Dividir.div2enteros(-56, -7) > 0);
	}
	
	//////// INVERSO REAL ////////
	
	/**
	 * Probar si el signo es coherente, con parámetro positivo.
	 */
	@Test
	void testInversoRealSigno1() {		
		assertTrue(Dividir.inversoReal(63) > 0);
	}
	
	/**
	 * Probar si el signo es coherente, con parámetro negativo.
	 */
	@Test
	void testInversoRealSigno2() {		
		assertFalse(Dividir.inversoReal(-63) > 0);
	}
	
	/**
	 * Probar si devuelve infinito calculando la inversa de cero.
	 */
	@Test
	void testInversoRealCero() {		
		assertEquals(Double.POSITIVE_INFINITY, Dividir.inversoReal(0), 0);
	}
	
	//////// RAIZ CUADRADA ////////
	
	/**
	 * Probar si funciona y es exacto con el cálculo de un número positivo.
	 */
	@Test
	void testRaizExacto() {		
		assertEquals(25, Dividir.raiz(625), 0);
	}
	
	/**
	 * Probar si devuelve NaN al querer calcular la raiz de un número negativo.
	 */
	@Test
	void testRaizNegativo() {		
		assertEquals(Float.NaN, Dividir.raiz(-625), 0);
	}
}
