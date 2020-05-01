import java.util.Scanner;
public class NewPr {
	public static void main (String[] args) {
			int num=1, cont1=0, cont2=0, cont3=0, r=0;
			Scanner tec = new Scanner (System.in);
			System.out.println("*****Ingrese la cantidad de números a ingresar*****: ");
			int cant; // 4
			cant = tec.nextInt();
			System.out.println("\n---------------");
			do {
				System.out.println("\n Ingrese su número: ");
				num = tec.nextInt();
				if (num<=15){
					cont1++;			
				}
				else if (num<=45 && num>=25) {
					cont2++;
				}
				else if (num>=50){
					cont3++;
				}
				r++;
			}
			while (r<cant);
			System.out.println("Los números menores a 15 son: " + cont1);
			System.out.println("Los números entre 25 y 45 son: " + cont2);
			System.out.println("Los números mayores a 50 son: " + cont3);
			System.out.println("\n---------------");
	}
			/*do {
				System.out.println("\n Ingrese num: ");
				num = tec.nextInt();
				if (num!=0) {
					if (num<=15) {
						cont1++;
					}
					if (num>15) {
						if (num>50) {
							cont2++;
						}
						else if (num>=25 && num<=45) {
							cont3++;
						}	
					}
				}
			}
			while (num!=0);
			System.out.println("Los números menores a 15 son: " + cont1);
			System.out.println("Los números mayores a 50 son: " + cont3);
		System.out.println("Los números entre 25 y 45 son: " + cont2); }*/
}

