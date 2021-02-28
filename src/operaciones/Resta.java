/**
 * Esta clase representa la clase resta de una calculadora que realiza las 4 operaciones b�sicas
 * @author Nagib Delgado
 * @since 29/02/2021
 * @version 0.2
 * 
 * 	Resta de dos n�meros reales, tendr� 2 par�metros de entrada y uno de salida que ser� la soluci�n.
	Resta de dos n�meros enteros, tendr� 2 par�metros de entrada y uno de salida que ser� la soluci�n.
	Resta de tres n�meros reales, tendr� 3 par�metros de entrada y uno de salida que ser� la soluci�n.
	Resta con valor acumulado, tendr� un par�metro de entrada y la clase deber� de guardar el valor acumulado.

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
	 *Este m�todo realiza la resta de dos n�meros reales. Puede devolver n�meros negativos en caso de que n1 sea mayor que n2
	 * lo hago privado para que el usuario no pueda acceder al m�todo, ya que lo �nico que le interesa es obtener el resultado de la operaci�n
	 * @param n1 representa el primer n�mero a restar
	 * @param n2 representa el segundo n�mero a restar
	 * @return devuelve el resultado de restar n1 - n 2
	 */
		
	public  static double restaDosReales(double R1, double R2) {
		return R1 - R2;
	}
	
	/**
	 *Este m�todo realiza la resta de dos n�meros enteros. Puede devolver n�meros negativos en caso de que n1 sea mayor que n2
	 * lo hago privado para que el usuario no pueda acceder al m�todo, ya que lo �nico que le interesa es obtener el resultado de la operaci�n
	 * @param n1 representa el primer n�mero a restar
	 * @param n2 representa el segundo n�mero a restar
	 * @return devuelve el resultado de restar n1 - n 2
	 */
		
	public  static int restaDosEnteros(int R1, int R2) {
		return R1 - R2;
	}
	
	/**
	 * Este m�todo realiza la resta de tres n�meros reales. Puede devolver n�meros negativos en caso de que n1 sea mayor que n2
	 * lo hago privado para que el usuario no pueda acceder al m�todo, ya que lo �nico que le interesa es obtener el resultado de la operaci�n
	 * @param n1 representa el primer n�mero a restar
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
