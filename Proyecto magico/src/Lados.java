
public class Lados {
	public static void main (String[] args) {
		
		Triangulo t1 = new Triangulo ();
		Triangulo t2 = new Triangulo ();
		
		t1.base = 4.0;
		t1.altura = 4.0;
		t1.estilo = " Estilo 1";
		
		t2.base = 8.;
		t2.altura = 12.;
		t2.estilo  = " Estilo 2";
		
		System.out.println (" Informaci�n para t1");
		t1.mostrarEstilo();
		t1.mostrarDimension();
		System.out.println (" Su �rea es: " + t1.areaT() );
		System.out.println();
		
		System.out.println (" Informaci�n para t2");
		t2.mostrarEstilo();
		t2.mostrarDimension();
		System.out.println (" Su �rea es: " + t2.areaT() );
		System.out.println();
		
		
	}
}
