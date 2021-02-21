package operaciones;

/**
 * Esta clase contiene varios métodos para la multiplicación de números.
 * @author David Fernandez
 * @since 07/02/2021
 * @version 1.1
 *
 */

public class Dividir {

	/*Clase 4: Cociente. Esta clase implementará todos los métodos que están relacionados con la división de la calculadora. 
	 Esta clase tendrá los siguientes métodos:*/
	/**
	 * <pre>Este método devuelve la división de dos número reales. </pre>
	 * <pre>Casos especiales:</pre>
	 * <pre>- Si el segundo parámetro es cero, resulta en una excepción.</pre>
	 * @param fd1 es el dividendo.
	 * @param fd2 es el divisor.
	 * 
	 * @return Resultado de la division. 
	 */
	
	//División de dos números reales, tendrá 2 parámetros de entrada y uno de salida que será la solución.
	
	public static float div2reales(float fd1, float fd2) {
		float resultado = fd1 / fd2;
		return resultado;
	}
	
	//División de dos números enteros, tendrá 2 parámetros de entrada y uno de salida que será la solución.
	
	/**
	 * <pre>Este método devuelve la división de dos número enteros. </pre>
	 * <pre>Casos especiales:</pre>
	 * <pre>- Si el segundo parámetro es cero, resulta en una excepción.</pre>
	 * @param ed1 es el dividendo.
	 * @param ed2 es el divisor.
	 * 
	 * @return Resultado de la division. 
	 */
	
	public static int div2enteros (int ed1, int ed2) {
		int resultado = ed1 / ed2;
		return resultado;
	}
	
	//Inverso de un número real, tendrá un parámetro de entrada y uno de salida que será la solución.

	/**
	 * <pre>Este método devuelve el inverso de un número real. </pre>
	 * <pre>Casos especiales:</pre>
	 * <pre>- Si el parámetro es cero, resulta en una excepción.</pre>
	 * @param id1 es el número a calcular la división.
	 * 
	 * @return Resultado de la division. 
	 */
	
	public static float inversoReal (float id1) {
		float resultado = 1 / id1;
		return resultado;
	}
		
	//Raíz de un número, tendrá un parámetro de entra y uno de salida que será la solución*/
	
	/**
	 * <pre>Este método devuelve la raíz cuadrada de un número real. </pre>
	 * <pre>Casos especiales:</pre>
	 * <pre>- Si el parámetro pasado es negativo, resulta en una excepción.</pre>
	 * @param rd1 es el número del que se calculará la raíz cuadrada.
	 * 
	 * @return Resultado de la reíz cuadrada. 
	 */
	
	public static double raiz (float rd1) {
		double resultado = Math.sqrt(rd1);
		return resultado;	
	}
}