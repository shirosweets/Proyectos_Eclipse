import java.util.Scanner;
public class Uno {
	public static void main (String[] args) {
		int num, edad;
		Scanner tec = new Scanner (System.in);
		System.out.println("¿Cuántos años tienes?: ");
		edad= tec.nextInt();
		System.out.println("Su edad es: "+ edad);
		switch (edad){
		case 0: {
			System.out.println("Acabas de nacer hace poco, no has cumplido el año");
			break;
		}
		case 18: {
			System.out.println("Sos mayor de edad");
			break;
		}
		case 65: {
			System.out.println("Podés jubilarte abuelo");
			break;
		}
		default: {
			System.out.println("No le importas a nadie, no aportas nada ni robas");
		}
		}
	}
}
