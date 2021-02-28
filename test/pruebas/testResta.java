package test;

/**
 * Esta clase contien las pruebas unitarias de Resta
 * @author David Fernandez Peralta
 * @since 25/02/2021
 * @version 1.0
 *
 */

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import operaciones.Resta;

class test1 {

	
	@Test
	void testRestaDosEnteros() {
				
		assertEquals(5, Resta.restaDosEnteros(10,5));
	}	
	@Test
	void testRestaDosReales() {
		
		assertEquals(5.0, Resta.restaDosReales(10.0,5.0),0.0);
	}	
	@Test
	void testRestaTresReales() {
		
		assertEquals(2.0, Resta.restaTres(10.0,4.0,4.0),0.0);
	}	
	@Test
	void testrestaAcu () {
		Resta.restaAcu(5);
		Resta.restaAcu(8);
		Resta.restaAcu(2);

		assertEquals(-15, Resta.getAcumulador());
	}
	
	
}
