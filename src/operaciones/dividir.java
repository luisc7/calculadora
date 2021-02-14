package operaciones;
/**
 * Esta clase realiza la operación de division
 * @author David Fernández
 * @version 2.0
 * @since 14/02/2021
 * 
 */
public class dividir {

	int dividir;
	
	/*Clase 4: Cociente. Esta clase implementará todos los métodos que están relacionados con la división de la calculadora. 
	 Esta clase tendrá los siguientes métodos:*/

	
	/**
	  * Este metodo realiza la division de dos números reales.Al pedir números reales he elegido usar el tipo float.
	  * @param fd1 representa el primer número a dividir
	  * @param fd2 representa el segundo número a dividir
	  * @return devuelve el resultado de la operación de dividirReales, si el valor del divisor es 0 avisamos de que no puede tomar ese valor
	  */

	public static float div2reales(float fd1, float fd2) {
		float resultado =fd1 / fd2;
		return resultado;
	}
	
	//División de dos números enteros, tendrá 2 parámetros de entrada y uno de salida que será la solución.
	

	/**
	 * Este metodo realiza la division de dos números enteros.Al pedir números enteros uso el tipo de dato int.
	 * En esta oacación solo nos vamos a quedar con el dividendo omitiendo el resto de la división
	 * @param ed1 representa el primer número a dividir
	 * @param ed2 representa el segundo número a dividir
	 * @return devuelve el resultado de la operación de dividirEnteros, si el valor del divisor es 0 avisamos de que no puede tomar ese valor
	 */

	public static int div2enteros (int ed1, int ed2) {
		int resultado = ed1 / ed2;
		return resultado;
	}
	
	//Inverso de un número real, tendrá un parámetro de entrada y uno de salida que será la solución.
	
	/**
	 * Este metodo realiza el inverso de un número. Uso el tipo de dato float.
	 * @param id1 representa el valor introducido por el usuario para realizar el inverso
	 * @return devuelve el resultado de la operación, si el valor de a es 0 avisamos de que no puede tomar ese valor
	 */

	public static float  inversoReal (float id1) {
		if (id1==0) {
			return "El divisor no puede ser 0";
		}
		else {
			float resultado = 1/id1;
			return resultado;
		}
	
	
	//Raíz de un número, tendrá un parámetro de entra y uno de salida que será la solución*/
	

	/**
	 * Este metodo se utilizará para realizar raíz cuadrada de un valor introducido por el usuario
	 * Para la calcular la raiz cuadrada no haría falta hacer ninguna operación ya que disponemos del paquete Math de operaciones matemáticas y dentro de este la clase
	 * sqrt para calcular la raíz cuadrada
	 * @param rd1 representa el valor de la base introducido por el usuario
	 * @return devuelve la raiz del número
	 */

	public static double raiz (float rd1) {
		double resultado= Math.sqrt(rd1);
		return resultado;
	
}
}