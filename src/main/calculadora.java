package main;
import operaciones.Multiplicacion;

public class calculadora {

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
	}

}
