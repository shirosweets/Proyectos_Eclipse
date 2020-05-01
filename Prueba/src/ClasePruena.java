import java.util.Scanner;
public class ClasePruena { 
	public static void main (String[] args) {
		int nota=0;
		int cont1=0, cont2=0;
		Scanner teclado = new Scanner (System.in);
		do {
			System.out.println("Ingrese la nota del usuario: "); 
			nota = teclado.nextInt();
			if (nota>=7) {
				cont1=cont1+1;
			}
			else if (nota>0) {
				cont2=cont2+1;
			}
		}
		while (nota!=0); // Cuando ingresamos 0 termina el ciclo.
		System.out.println("La cantidad de alumnos que tienen las notas mayores o iguales a 7 son: "+ cont1 
				+ "\n Y la cantidad de alumnos que tienen una nota menor a 7 son: " + cont2);
	}
}
