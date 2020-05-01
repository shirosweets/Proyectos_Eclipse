import java.lang.Math;

public class Coordenadas { // (x, y)
	private int x;
	private int y;
	public void coordenadas(int x1, int y1) {
		x=x1;
		y=y1;
	}
	/*public void cooco(int x1, int y1) {
		x=x1;
		y=y1;
	}*/
	public double distancia(int x1, int y1) {
		double d=Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
		return d;
	}
	public void puntomedio(int x1, int y1){
		double p1=(x+x1)/2, p2=(y+y1)/2;
		System.out.println("El punto medio es: " + p1 + " " + p2);
	}
}
