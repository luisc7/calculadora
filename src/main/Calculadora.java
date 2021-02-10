package main;

import operaciones.*;

public class Calculadora {

	public static void main(String[] args) {
		

		
		
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
