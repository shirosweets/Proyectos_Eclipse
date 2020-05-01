
public class Triangulo extends DosDimensiones{
	String estilo;
	double areaT () {
		return (base*altura)/2;
	}
	void mostrarEstilo () {
		System.out.println(" El triangulo es: " + estilo);
	}
}
