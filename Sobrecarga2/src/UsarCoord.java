import java.lang.Math;

public class UsarCoord {
	public static void main (String[] args) {
		Coordenadas p = new Coordenadas();
		p.coordenadas(10, 20);
		// Clase nombreObj; 
		// nombreObj = new Clase();
		// int a; a = 4;
		System.out.println("La distancia es: " + p.distancia(5, 6));
		p.puntomedio(5, 6);
	}
}
