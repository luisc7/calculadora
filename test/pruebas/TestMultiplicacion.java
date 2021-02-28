package pruebas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;

import operaciones.Multiplicacion;

class TestMultiplicacion {
	
	
	
	/**
	 * En esta prueba unitaria se prueba que el metodo mult2Reales
	 * solo devuelve un resultado correcto con dos numeros reales,
	 * en este caso se eligen un numero negativo y otro numero decimal.
	 */
		
	@Test
	void testMult2Reales() {
		//fail("Not yet implemented");
		float resultado = Multiplicacion.mult2Reales(-1, 1.5F);
		float esperado = 1.5F;
		assertNotEquals(esperado, resultado, 0.02);
					
		
	}
	
	/**
	 * En esta prueba unitaria se prueba que el metodo mult2Enteros,
	 * realiza la operacion multiplicar de dos numeros enteros.
	 */
	
	@Test
	void testMult2Enteros() {
		//fail("Not yet implemented");
		int resultado = Multiplicacion.mult2Enteros(2, 4);
		int esperado = 8;
		assertEquals(resultado, esperado);
		
			
	}
	
	
	/**
	 * En esta prueba unitaria se prueba que el metodo mult3Reales, realiza
	 * la operacion multiplicar de tres numeros reales (2, -1, 0.5).
	 */

	@Test
	void testMult3Reales() {
		//fail("Not yet implemented");
		double resultado = Multiplicacion.mult3Reales(2, -1, 0.5);
		double esperado = -1;
		assertEquals(esperado, resultado, 0.2);
				
		
	}
	
	/**
	 * En esta prueba unitaria se prueba que el metodo potencia
	 * devuelve 1 cuando el exponente es 0.
	 */
	
	@Test
	void testPotencia() {
		double resultado = Multiplicacion.potencia(3, 0);
		int esperado = 1; // 3^0
		assertEquals(esperado, resultado);
		
			
	}

	
	}
	

