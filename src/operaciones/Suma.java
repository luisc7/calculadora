package operaciones;

/**
 * Esta clase calcula la suma de dos y tres n�meros reales
 * Calcula la suma entre dos numeros enteros
 * Tambien recoge la suma calculada de estos digitos en la clase
 * @author Ana Bel�n Arias
 * @version 1.0
 * 
 */

public class Suma {


	private static int acumulador = 0;

	/**
	 * Este metedo suma dos numeros reales
	 * 
	 * @param n1 representa el primer numero a sumar
	 * @param n2 representa el segundo numero a sumar
	 * @return resultado de la suma de dos numeros reales
	 */


	//comienza metodos

	public static float sumaDosReales(float n1, float n2) {

		float resultado = n1 + n2;

		return resultado; //suma dos numeros reales 
	}

	/**
	 * Este metodo suma dos numeros enteros
	 * @param n1e representa el primer numero a sumar
	 * @param n2e representa el segundo numero a sumar
	 * @return resultado suma  dos numeros enteros
	 */

	public static int sumaDosEnteros(int n1e, int n2e) {

		int resultado = n1e + n2e;

		return resultado; // suma dos numeros enteros
	}

	/**
	 * Este metodo suma tres numeros reales
	 * @param n1 representa el primer numero a sumar
	 * @param n2 representa el segundo numero a sumar
	 * @param n3 representa el tercer numero a sumar
	 * @return resultado suma numeros reales
	 */

	public static float sumaTresReales(float n1, float n2, float n3) {

		float resultado = n1 + n2 + n3;

		return resultado; //suma de tres numeros reales
	}

	/**
	 * Este metodo recoge el valor de la suma acumulativa y lo guarda en la clase Suma.
	 * Se elige un valor de tipo int para evitar decimales.
	 * @param acu representa la variable que contiene el valor de la suma acumulada
	 * en la clase.
	 * 
	 */
	public static void sumaAcumulada(int acu) {
		acumulador += acu;
	}

	public static int getAcumulador() {
		return acumulador;
	}

	public static void setAcumulador(int acu) {
		acumulador = acu;
	}

}