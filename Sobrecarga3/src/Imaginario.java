//import java.lang.Math;

public class Imaginario {
	private int real, imaginario;
	public Imaginario() { // Constructor vac�o
		real = 0;
		imaginario = 0;
	}
	public Imaginario(int x, int y) { // Constructor con par�metros
		real = x;
		imaginario = y;
	}
	public void mostrar() { // 
		System.out.println("El n�mero imaginario es: " + real + " + " + imaginario + "i");
	}
}
