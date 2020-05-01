
public class Calculos3 {
	
	public static void main (String[] args) {
		
		Rectangulo3 r1 = new Rectangulo3 ();
		Rectangulo3 r2 = new Rectangulo3 ();
		Rectangulo3 c3 = new Rectangulo3 ();
		
		r1.altura = 20;
		r1.base1 = 10;
		r1.mostrarValores();
		System.out.println("El �rea de la figura que");
		r1.esFigura();
		System.out.println(" es " + r1.areaR() );
		
		r2.altura = 10;
		r2.base1 = 15;
		r2.mostrarValores();
		System.out.println("El �rea de la figura que");
		r2.esFigura();
		System.out.println(" es " + r2.areaR() );
		
		// Es polimorfismo porque el m�todo areaR originalmente recib�a de par�metros
		// de entrada base1 y altura para la figura del rect�ngulo, pero
		// al s�lo recibir la altura el m�todo se comporta para calcular
		// el �rea del cuadrado
		
		int altura12 = 5;
		
		c3.altura = altura12;
		c3.base1 = altura12;
		c3.mostrarValores();
		System.out.println("El �rea de la figura que");
		c3.esFigura();
		System.out.println(" es " + c3.areaR() );
	}
}
