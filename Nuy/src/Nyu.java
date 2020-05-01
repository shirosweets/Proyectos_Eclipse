import java.util.Scanner;
public class Nyu {
	public static void main (String [] args) {
		// ** Solicite un num 0 y 999, y que diga cuántos dígitos tiene el num, el 
		//programa termina cuando ingreso 1000**
		int num;
		Scanner tec = new Scanner (System.in);
		System.out.println("El programa termina al ingresar 1000 ");
		System.out.println("\n-- Ver cuántos dígitos tiene un número --");
		do {
			System.out.println("\n|Ingrese el número|: ");
			num = tec.nextInt();
			/*  int c = num%100;
			 int d = num%10;
			 int cu=0, du=0;
			if (c==0){
				cu++;
			} 
			
			else if (d==0){
				du++;
			}
			if ((du && dc)!=0){
				System.out.println("El número tiene 3 dígitos");
			}
			*/
			if (num>=0 && num<10) {
				System.out.println("El número tiene 1 dígito");
			}
			if (num>=10 && num<100) {
				System.out.println("El número tiene 2 dígitos");
			}
			if (num>=100 && num<=999) {
				System.out.println("El número tiene 3 dígitos");
			}
		}
		while (num!=1000);
	}

}
