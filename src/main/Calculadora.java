package main;
import operaciones.Multiplicacion;
import operaciones.Resta;

public class Calculadora {

	public static void main(String[] args) {
		
		// MULTIPICACION
		System.out.println("-----MULTIPLICACION-------");
		float r2 = 0F;
		float p1 = 3.1F;
		float p2 = 2.5F;
		float i2 = 0;
		int p1e = 4;
		int p2e = 17;
		int r2e = 0;

		System.out.print("Multiplicación de números reales " + p1 + " por " + p2 + " = ");
		r2 = Multiplicacion.mult2Reales(p1, p2);
		System.out.println(r2);

		System.out.print("Multiplicación de los números enteros " + p1e + " por " + p2e + " = ");
		r2e = Multiplicacion.mult2Enteros(p1e, p2e);
		System.out.println(r2e);
		System.out.println("-----FIN-MULTIPLICACION-------\n");
				
		
		//Creo los objetos para realizar las distintas operaciones
		Resta rest1 = new Resta(3,2);
		Resta rest2 = new Resta(5,3,8);
		Resta rest3 = new Resta(3);
				
		//Realizamos las operaciones haciendo las distintas llamdas a los m�todos de la clase
		System.out.print("Resultado de la resta de dos n�meros reales: ");
		rest1.calcularDosReales();
		System.out.print("Resultado de la resta de dos n�meros enteros: ");
		rest1.calcularDosEnteros();
		System.out.print("Resultado de la resta de tres n�meros reales: ");
		rest2.calcularTresReales();
				
		//Aqu� realizo la resta de valores que se van introduciendo
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
