package main;
import operaciones.Multiplicacion;
import operaciones.Resta;
import operaciones.Dividir;
import operaciones.Suma;

public class Calculadora {

	public static void main(String[] args) {
		
		/*
		 * ------------------------------
		 * |							|
		 * |	MULTIPLICACION			|
		 * |							|
		 * ------------------------------
		 */
		System.out.println("-----MULTIPLICACION-------");
		float r2 = 0F;
		float p1 = 3.1F;
		float p2 = 2.5F;
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

		
		/*
		 * ------------------------------
		 * |							|
		 * |			RESTA			|
		 * |							|
		 * ------------------------------
		 */
		
		//Empezamos con la clase resta

	
		//Indico que va a empezar la resta
		System.out.println("*----------RESTA----------*");
			
		//Realizamos las operaciones haciendo las distintas llamdas a los m�todos de la clase
		System.out.print("Resultado de la resta de dos números reales: " + Resta.restaDosReales(4.0, 2.0));
		System.out.print("Resultado de la resta de dos números enteros: " + Resta.restaDosEnteros(6, 2));
		System.out.print("Resultado de la resta de tres números reales: " + Resta.restaTres(3.0, 4.0, 2.0));
		
		
		//---------------------------------------------------------------------	
		
		//Aqu� realizo la resta de valores que se van introduciendo
		Resta.restaAcu(8);
		Resta.restaAcu(5);
		Resta.restaAcu(12);
		System.out.println("La resta acumulada es " + Resta.getAcumulador());
		
		

		
		/*
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

		System.out.print("Divisi�n de dos números reales " + fd1 + " entre " + fd2 + " = ");
		res1 = Dividir.div2reales(fd1, fd2);
		System.out.println(res1);
		
		System.out.print("Divisi�n de dos números enteros " + ed1 + " entre " + ed2 + " = ");
		res2 = Dividir.div2enteros(ed1, ed2);
		System.out.println(res2);
		

		System.out.print("Número inverso de " + id1 + " = ");
		res3= Dividir.inversoReal(fd1);
		System.out.println(res3);
		
		System.out.print("Raíz cuadrada de " + rd1 + " = ");
		res4 = Dividir.raiz(fd1);

		System.out.print("Número inverso de " + id1 + " = ");
		res3= Dividir.inversoReal(id1);
		System.out.println(res3);
		
		System.out.print("Raíz cuadrada de " + rd1 + " = ");
		res4 = Dividir.raiz(rd1);

		System.out.println(res4);

		/*
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
				int ac1 = 7;
				int ac2 = 3;
				int ac3 = 4;
				int ac4 = 5;
				int ac5 = 12;
				
				System.out.println("La suma de dos numeros reales es: ");
				R2= Suma.sumaDosReales(n1, n2);
				System.out.println(R2);
				
				System.out.println("La suma de dos numeros enteros es: ");
				E2= Suma.sumaDosEnteros(n1e, n2e);
				System.out.println(E2);
				
				System.out.println("La suma de tres numeros reales es: ");
				R3= Suma.sumaTresReales(n1, n2, n3);
				System.out.println(R3);
					
				Suma.sumaAcumulada(ac1);
				Suma.sumaAcumulada(ac2);
				Suma.sumaAcumulada(ac3);
				Suma.sumaAcumulada(ac4);
				Suma.sumaAcumulada(ac5);
				System.out.println("La suma acumulada de " + ac1
						+ ", " + ac2 + ", " + ac3 + ", " + ac4 + " y " + ac5 + " es: "
						+ Suma.getAcumulador());

	}
	

}
