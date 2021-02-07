/**
 * Esta clase representa la clase resta de una calculadora que realiza las 4 operaciones básicas
 * @author Nagib Delgado
 * @since 29/02/2021
 * @version 0.1
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
	private double n1;
	private double n2;
	private double n3;
	private int n4;
	private int acu =0;
	
	//Zona constructores
	
	/**
	 * Este constructor es el constructor que realizará la operación resta de dos números reales y enteros
	 * @param n1 representa el primer número a restar
	 * @param n2 representa el segundo número a restar
	 */
	public Resta(double n1, double n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	/**
	 * Este constructor es el constructor que realizará la operación resta de tres números reales
	 * @param n1 representa el primer número a restar
	 * @param n2 representa el segundo número a restar
	 * @param n3 representa el tercer número a restar
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
	
	Zona de GET/SET

	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}

	public double getN3() {
		return n3;
	}

	public void setN3(double n3) {
		this.n3 = n3;
	}
		
	public int getN4() {
		return n4;
	}

	public void setN4(int n4) {
		this.n4 = n4;
	}
		
	//Zona métodos
		
	//Metodo para guardar el valor
	public int guardaNumero() {
		return n4;
	}
		
	/**
	 *Este método realiza la resta de dos números reales. Puede devolver números negativos en caso de que n1 sea mayor que n2
	 * lo hago privado para que el usuario no pueda acceder al método, ya que lo único que le interesa es obtener el resultado de la operación
	 * @param n1 representa el primer número a restar
	 * @param n2 representa el segundo número a restar
	 * @return devuelve el resultado de restar n1 - n 2
	 */
		
	private double restaDos() {
		return n1 - n2;
	}
		
	/**
	 * Este método realiza la resta de tres números reales. Puede devolver números negativos en caso de que n1 sea mayor que n2
	 * lo hago privado para que el usuario no pueda acceder al método, ya que lo único que le interesa es obtener el resultado de la operación
	 * @param n1 representa el primer número a restar
	 * @return
	 */
	private double restaTres() {
		return n1 - n2 - n3;
	}
	
	/**
	* 
	* @param n4 es el valor que se va guardando
	* @return devuelve la resta acumulada de los distintos valores introducidos
	*/
	
	private int restaAcu(int n4) {
		acu = acu - n4;
		return acu;
	}
	
	/**
	 * Este método nos muestra un String con el resultado de la resta de dos números reales
	 */
	public void calcularDosReales() {
		System.out.println(restaDos());
	}
	
	/**
	 * Este método nos muestra un String con el resultado de la resta de tres números reales
	 */
	
	public void calcularTresReales() {
		System.out.println(restaTres());
	}
	
	/*
	 * Este método nos muestra un String con el resultado de la resta de dos números enteros
	 */
	
	public void calcularDosEnteros() {
		System.out.println((int)restaDos());
	}
	
	/*
	 * Este método nos muestra un String con el número que se va guardando
	 * Nos sirve para comprobar que vamos guardando el número que introducimos
	 */
	
	public void stringMostrarValor() {
		System.out.println(guardaNumero());
	}
	
	/*
	 * Este método nos muestra un String con el resultado de la resta acumulativa
	 */
	
	public void calcRestAcu() {
		System.out.println(restaAcu(n4));
	}
}
