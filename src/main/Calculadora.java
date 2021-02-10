package main;
import operaciones.Multiplicacion;
import operaciones.Resta;
import operaciones.dividir;

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
		
		
		//Realizamos las operaciones haciendo las distintas llamdas a los m�todos de la clase
		System.out.print("Resultado de la resta de dos n�meros reales: ");

				
		//Realizamos las operaciones haciendo las distintas llamdas a los m�todos de la clase
		System.out.print("Resultado de la resta de dos n�meros reales: ");
		rest1.calcularDosReales();
		System.out.print("Resultado de la resta de dos n�meros enteros: ");
		rest1.calcularDosEnteros();
		System.out.print("Resultado de la resta de tres n�meros reales: ");
		rest2.calcularTresReales();
		
		
		//---------------------------------------------------------------------	
		
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
		

		
		/**
		 * ------------------------------
		 * |							|
		 * |			DIVIDIR			|
		 * |							|
		 * ------------------------------
		 */
		
		

		float res1 = 0F;
		float fd1 = 1.2F;
		float fd2 = 4.5F;
		float res2 = 0F;
		int ed1 = 4;
		int ed2 = 8;
		float res3 = 0F;
		float id1 = 5.6F;
		double res4 = 0;
		float rd1 = 9F;
		

		System.out.println("-------------------DIVISION---------------------");

		System.out.print("División de dos números reales " + fd1 + " entre " + fd2 + " = ");
		res1 = dividir.div2reales(fd1, fd2);
		System.out.println(res1);
		
		System.out.print("División de dos números enteros " + ed1 + " entre " + ed2 + " = ");
		res2 = dividir.div2enteros(ed1, ed2);
		System.out.println(res2);
		
		System.out.print("Número inverso de " + id1 + " = ");
		res3= dividir.inversoReal(fd1);
		System.out.println(res3);
		
		System.out.print("Raíz cuadrada de " + rd1 + " = ");
		res4 = dividir.raiz(fd1);
		System.out.println(res4);

		/**
		 * ------------------------------
		 * |							|
		 * |			SUMA		|
		 * |							|
		 * ------------------------------
		 */
		
		//COMIENZO SUMA
		
		System.out.println("-------SUMA------");
				
				float n1= 1.2f;
				float n2= 2.5f;
				float n3= 3.6f;
				float R2= 0f;
				float R3= 0f;
				int n1e= 5;
				int n2e= 6;
				int E2=0;
				
				System.out.println("La suma de dos numeros reales es: ");
				R2= Suma.sumaDosReales(n1, n2);
				System.out.println(R2);
				
				System.out.println("La suma de dos numeros enteros es: ");
				E2= Suma.sumaDosEnteros(n1e, n2e);
				System.out.println(E2);
				
				System.out.println("La suma de tres numeros reales es: ");
				R3= Suma.sumaTresReales(n1, n2, n3);
				System.out.println(R3);
		
	}
	

}
