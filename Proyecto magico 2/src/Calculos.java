
public class Calculos {
	public static void main(String[] args) {
		Circulo c1 = new Circulo();
		Circulo c2 = new Circulo();
		Circulo c3 = new Circulo();
		
		c1.diametro = 10.0;
		c1.radio = 15.0;
		c1.tamano = "Chiquito";
		
		c2.diametro = 20.0;
		c2.radio = 25.0;
		c2.tamano = "Grande";
		
		c3.diametro = 30.0;
		c3.radio = 35.0;
		c3.tamano = "Grandototote";
		
		System.out.println("La informaci�n para el c�rculo uno ");
		c1.mostrarTamano();
		System.out.println("El �rea es: " + c1.areaC() );
		System.out.println("El di�metro es: " + c1.diametroC() );
		c1.mostrarValores();
		
		System.out.println("La informaci�n para el c�rculo dos ");
		c2.mostrarTamano();
		System.out.println("El �rea es: " + c2.areaC() );
		System.out.println("El di�metro es: " + c2.diametroC() );
		c2.mostrarValores();
		
		System.out.println("La informaci�n para el c�rculo tres ");
		c3.mostrarTamano();
		System.out.println("El �rea es: " + c3.areaC() );
		System.out.println("El di�metro es: " + c3.diametroC() );
		c3.mostrarValores();
	}
}
