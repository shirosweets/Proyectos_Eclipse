import java.util.Scanner;
import java.math.*;
public class Menu {
	public static void main (String[] args) { 
		String menu;
		System.out.println(">>>>>>>Men�<<<<<<<\n");
		System.out.println("\n'Cantidad' \n'Geometria' \n'Vida' \n'Salir'");
		System.out.println("Seleccione una opci�n: \n>>");
		Scanner tec = new Scanner (System.in);
		menu = tec.next();
		switch (menu){
		case "Cantidad": { // 1er
			System.out.println("Ingrese la cantidad de n�meros que desea ingresar: \n>>");
			int num= tec.nextInt(); //4
			int a;
			int cpares=0;
			int pares []= new int [num-1]; // Arreglo
			int cimpares=0;
			int impares []= new int [num];
			for (int i=0; i<=num ;i++) {
				System.out.println("\nIngrese el num " + (i+1));
				a = tec.nextInt();
				if ((a%2)==0) {
					//
					pares [i] = a;
					cpares++;
				}
				else {
					impares [i] = a;
					cimpares++;
				}
			}
			System.out.println("La cantidad de pares es: " + cpares);
			System.out.println("Y los n�meros pares son: "); // Recorre pares [] 
			for (int i=0; pares.length<=i; i++) {
				System.out.println( pares [i] + " ");
			}
			System.out.println("La cantidad de impares es: " + cimpares);
			for (int i=0; impares.length<=i; i++) { // Recorre impares [] 
				System.out.println( impares [i] + " ");
			}
			/*switch (num){
			case:{}}*/
			break;
		}
		/*case "Calculadora": { // 2do
			String calcu; 
			int numc=0;
			switch (calcu) {
			case "Multiplicar": {
				System.out.println("\n Seleccion� la opci�n Calculadora>Multiplicar \n �Cu�ntos n�meros desea multiplicar?: \n>>");
			}
			case "Sumar": {
				System.out.println("\n Seleccion� la opci�n Calculadora>Sumar \n �Cu�ntos n�meros desea sumar?: \n>>");
			}
			case "Restar": {
				System.out.println("\n Seleccion� la opci�n Calculadora>Restar \n �Cu�ntos n�meros desea restar?: \n>>");
			}
			}
		}*/
		case "Geometria": { // 3er
			int menugeo;
			System.out.println("\n1) Circulo \n2) Triangulo \nElija su opci�n \n>>");
			menugeo = tec.nextInt();
			switch (menugeo) {
			case 1:{ // Circulo
				double ac=0, pc;
				int r;
				System.out.println("\n Seleccion� la opci�n Geometria>Circulo Ingrese el radio del circulo \n>>");
				// Ingreso del radio
				r= tec.nextInt();
				ac= Math.PI*r; // �rea del c�rculo
				pc= Math.PI*(r^2); // Per�metro del c�rculo
				System.out.println("\nEl �rea del c�rculo es: " + ac);
				System.out.println("\nEl �rea del c�ruclo es: " + pc);
				break;
			}
			case 2:{ // Triangulo
				double at, pt;
				int b, h, l1, l2, l3, pc;
				System.out.println("\n Seleccion� la opci�n Geometria>Triangulo Ingrese la base \n>>");
				// Ingreso de la base b
				b= tec.nextInt();
				// Ingreso de la altura h;
				System.out.println("\nIngrese la altura del triangulo \n>>");
				h= tec.nextInt();
				// Ingreso de los lados l1
				System.out.println("\nIngrese los lados del triangulo \n>>");
				l1= tec.nextInt();
				System.out.println("\n>>");
				l2= tec.nextInt();
				System.out.println("\n>>");
				l3= tec.nextInt();
				//
				at= (b*h)/2;  // �rea del tri�ngulo
				System.out.println("\nEl �rea del tri�ngulo es: " + at);
				if (l1==l2 && l3==l1) {
					pc = l1+12+l3;
					System.out.println("\nEs equil�tero y sus lados son (" + l1 + l2 + l3 + ")");
					System.out.println("\nEl �rea del tri�ngulo es: " + pc);
				}
				else if (((l1==l2)&& l1!=l3) || ((l2==l3) && l2!=l1) || ((l3==l1)&& l3!=l2)) {
					pc = (l1*2)+l3;
					System.out.println("\nEs is�sceles ("+ l1 + l2 + l3 + ")");
					System.out.println("\nEl �rea del tri�ngulo es: " + pc);
				}
				else {
					pc = l1+l2+l3;
					System.out.println("\nEs escaleno ("+ l1 + l2 + l3 + ")");
					System.out.println("\nEl �rea del tri�ngulo es: " + pc);
				}
			}
			break;
			}
		}
		case "Vida":{ // 4to
			System.out.println("Vida");
			break;
		}
		default :{
			System.out.println("default");
			break;
		}
	}
	}
	//System.out.println("\n Gracias, adi�s");
}
