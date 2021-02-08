package operaciones;
/**
 * Esta clase contiene varios métodos para la multiplicación de números.
 * @author Luis Cifuentes
 * @since 07/02/2021
 * @version 1.1
 *
 */

public class Multiplicacion {
	
	/**
	 * <pre>Este método devuelve la multiplicación de dos número reales. </pre>
	 * <pre>Casos especiales:</pre>
	 * <pre>- Resultado sobrepasa el tamaño máximo de float da error.</pre>
	 * @param f1 es el primer factor.
	 * @param f2 es el segundo factor.
	 * 
	 * @return Resultado del producto. 
	 */
	
	public static float mult2Reales(float f1, float f2) {
		float resultado = f1 * f2;
		
		return resultado;
	}
	
	
	/** 
	 * <pre>Este método devuelve la multiplicación de dos números enteros.</pre>
	 * <pre>Casos especiales:</pre>
	 * <pre>- Si es mayor al tamaño de una variable entera, puede 
	 * desbordar y devolver un dato erróneo sin avisar del error.</pre>
	 * <pre>- Si se necesita trabajar con factores o resultado mayores, utilizar 
	 * @see mult3Reales con un factor igual a uno.</pre>
	 * @param f1 es el primer factor.
	 * @param f2 es el segundo factor.
	 * @return Resultado del producto.
	 */
		
	public static int mult2Enteros(int f1, int f2) {
		int resultado = f1 * f2;
		
		return resultado;
	}
	
	/**
	 * <pre>Este método devuelve la multiplicación de tres factores con 
	 * doble precisión.</pre>
	 * <pre>Casos especiales:</pre>
	 * <pre>- Resultado sobrepasa el tamaño máximo de double da error.</pre>
	 * @param f1 es el primer factor.
	 * @param f2 es el segundo factor.
	 * @param f3 es el tercer factor.
	 * @return el producto de los tres factores.
	 */
	
	public static double mult3Reales(double f1, double f2, double f3) {
		double resultado = f1 * f2 * f3;
		
		return resultado;
	}
	
	/**
	 * <pre>Este método realiza la potencia de un número al exponente 
	 * pasado.El exponente debe ser un entero positivo.</pre>
	 * <pre>Casos especiales:</pre>
	 * <pre>- Siempre es uno con exponente 0.</pre>
	 * <pre>- Devuelve error si se sobrepasa el rango de double.</pre>
	 * @param base es el número a elevar.
	 * @param exponente es exponente al que elevamos la base. Entero positivo.
	 * @return la potencia "exponente" del número "base".
	 */
	
	public static double potencia(double base, int exponente) {
		
		double resultado = 0;
		
		if (exponente == 0) {
			resultado = 1; 
		} else {
			for (int i=1; i<=exponente; i++) {
				resultado *= base;
			}
		}
				
		return resultado;
	}
}
