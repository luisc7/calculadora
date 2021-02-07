/**
 * Esta clase representa la clase resta de una calculadora que realiza las 4 operaciones b�sicas
 * @author Nagib Delgado
 * @since 29/02/2021
 * @version 0.1
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
	private double n1;
	private double n2;
	private double n3;
	private int n4;
	private int acu =0;
	
	//Zona constructores
	
	/**
	 * Este constructor es el constructor que realizar� la operaci�n resta de dos n�meros reales y enteros
	 * @param n1 representa el primer n�mero a restar
	 * @param n2 representa el segundo n�mero a restar
	 */
	public Resta(double n1, double n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	/**
	 * Este constructor es el constructor que realizar� la operaci�n resta de tres n�meros reales
	 * @param n1 representa el primer n�mero a restar
	 * @param n2 representa el segundo n�mero a restar
	 * @param n3 representa el tercer n�mero a restar
	 */

	public Resta(double n1, double n2, double n3) {
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;	
	}	
	
	/**
	 * Este es el constructor para almacenar el valor introducido para luego utilizarlo para ir restando.
	 * @param n4 representa el valor introducido que se va a ir almacenando
	 */
	
	public  Resta ( int  n4 ) {
		this.n4 = n4;
	}
}
