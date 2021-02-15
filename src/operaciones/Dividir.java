package operaciones;

public class Dividir {

	int dividir;
	
	/*Clase 4: Cociente. Esta clase implementará todos los métodos que están relacionados con la división de la calculadora. 
	 Esta clase tendrá los siguientes métodos:*/

	
	//División de dos números reales, tendrá 2 parámetros de entrada y uno de salida que será la solución.
	
	public static float div2reales(float fd1, float fd2) {
		float resultado =fd1 / fd2;
		return resultado;
	}
	
	//División de dos números enteros, tendrá 2 parámetros de entrada y uno de salida que será la solución.
	
	public static int div2enteros (int ed1, int ed2) {
		int resultado = ed1 / ed2;
		return resultado;
	}
	
	//Inverso de un número real, tendrá un parámetro de entrada y uno de salida que será la solución.
	
	public static float  inversoReal (float id1) {
		float resultado = 1/id1;
		return resultado;
	}
	
	
	//Raíz de un número, tendrá un parámetro de entra y uno de salida que será la solución*/
	
	public static double raiz (float rd1) {
		double resultado= Math.sqrt(rd1);
		return resultado;
	
}
}