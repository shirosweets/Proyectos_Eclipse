//import java.lang.Math;

public class Imaginario {
	private int real, imaginario;
	public Imaginario() { // Constructor vacío
		real = 0;
		imaginario = 0;
	}
	public Imaginario(int x, int y) { // Constructor con parámetros
		real = x;
		imaginario = y;
	}
	public void mostrar() { // 
		System.out.println("El número imaginario es: " + real + " + " + imaginario + "i");
	}
}
