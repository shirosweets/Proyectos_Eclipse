
public class Rectangulo3 extends Figuras3 {
	//int area;
	String figura;
	//public 
	public int areaR () {
		return base1*altura;
	}
	public void esFigura () {
		if (altura==base1) {
			System.out.println(" es un cuadrado");
		}
		else {
			System.out.println(" es un rectángulo");
		}
	}
}
