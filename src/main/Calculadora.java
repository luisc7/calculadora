package main;
import operaciones.Multiplicacion;
import operaciones.Resta;

public class Calculadora {

	public static void main(String[] args) {
		float r2 = 0F;
		float p1 = 3.1F;
		float p2 = 2.5F;
		float i2 = 0;
		int p1e = 4;
		int p2e = 17;
		int r2e = 0;
		
		
		r2 = Multiplicacion.mult2Reales(p1, p2);
		System.out.println(r2);
		
		r2e = Multiplicacion.mult2Enteros(p1e, p2e);
		System.out.println(r2e);
		
		/**
		 * ------------------------------
		 * |							|
		 * |			RESTA			|
		 * |							|
		 * ------------------------------
		 */
		
		//Empezamos con la clase resta
		//Creo los objetos para realizar las distintas operaciones
		Resta rest1 = new Resta(3,2);
		Resta rest2 = new Resta(5,3,8);
		Resta rest3 = new Resta(3);
		
		//Indico que va a empezar la resta
		System.out.println("*----------RESTA----------*");
		
		
		//Realizamos las operaciones haciendo las distintas llamdas a los métodos de la clase
		System.out.print("Resultado de la resta de dos números reales: ");
		rest1.calcularDosReales();
		System.out.print("Resultado de la resta de dos números enteros: ");
		rest1.calcularDosEnteros();
		System.out.print("Resultado de la resta de tres números reales: ");
		rest2.calcularTresReales();
				
		//Aquí realizo la resta de valores que se van introduciendo
		System.out.print("\nMostramos el primer valor a restar:");
		rest3.stringMostrarValor();
		System.out.print("El resultado de la resta es:");
		rest3.calcRestAcu();
		rest3.setN4(5);
		System.out.print("\nMostramos el segundo valor a restar:");
		rest3.stringMostrarValor();
		System.out.print("El resultado de la resta es:");
		rest3.calcRestAcu();
		
	}
	

}
