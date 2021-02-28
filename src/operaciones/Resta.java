/**
 * Esta clase representa la clase resta de una calculadora que realiza las 4 operaciones básicas
 * @author Nagib Delgado
 * @since 29/02/2021
 * @version 0.2
 * 
 * 	Resta de dos números reales, tendrá 2 parámetros de entrada y uno de salida que será la solución.
	Resta de dos números enteros, tendrá 2 parámetros de entrada y uno de salida que será la solución.
	Resta de tres números reales, tendrá 3 parámetros de entrada y uno de salida que será la solución.
	Resta con valor acumulado, tendrá un parámetro de entrada y la clase deberá de guardar el valor acumulado.

 */
package operaciones;

public class Resta {
	/**
	 * Zona definicion de atributos
	 * 
	 */
	
	private static int acumulador = 0;
	


	public static int getAcumulador() {
		return acumulador;
	}

		
	/**
	 *Este método realiza la resta de dos números reales. Puede devolver números negativos en caso de que n1 sea mayor que n2
	 * lo hago privado para que el usuario no pueda acceder al método, ya que lo único que le interesa es obtener el resultado de la operación
	 * @param n1 representa el primer número a restar
	 * @param n2 representa el segundo número a restar
	 * @return devuelve el resultado de restar n1 - n 2
	 */
		
	public  static double restaDosReales(double R1, double R2) {
		return R1 - R2;
	}
	
	/**
	 *Este método realiza la resta de dos números enteros. Puede devolver números negativos en caso de que n1 sea mayor que n2
	 * lo hago privado para que el usuario no pueda acceder al método, ya que lo único que le interesa es obtener el resultado de la operación
	 * @param n1 representa el primer número a restar
	 * @param n2 representa el segundo número a restar
	 * @return devuelve el resultado de restar n1 - n 2
	 */
		
	public  static int restaDosEnteros(int R1, int R2) {
		return R1 - R2;
	}
	
	/**
	 * Este método realiza la resta de tres números reales. Puede devolver números negativos en caso de que n1 sea mayor que n2
	 * lo hago privado para que el usuario no pueda acceder al método, ya que lo único que le interesa es obtener el resultado de la operación
	 * @param n1 representa el primer número a restar
	 * @return
	 */
	public static double restaTres(double R1, double R2, double R3) {
		return R1 - R2 - R3;
	}
	
	/**
	* 
	* @param n4 es el valor que se va guardando
	* @return devuelve la resta acumulada de los distintos valores introducidos
	*/
	
	public static void restaAcu(int acu) {
		acumulador -= acu;
	}
	
}
