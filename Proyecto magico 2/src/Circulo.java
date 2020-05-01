import java.lang.Math;

public class Circulo extends Figuras {
	String tamano;
	double areaC () {
		return Math.PI*Math.pow(radio, 2);
	}
	public double diametroC () {
		return Math.PI*2*radio;
	}
	public void mostrarTamano () {
		System.out.println("El circulo es " + tamano);
	}
	
}
