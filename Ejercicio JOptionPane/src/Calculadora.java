import javax.swing.*;
public class Calculadora {
	/* Ejercicio con JOptionPane que sea una calculadora, que haga 4 
	c�lculos (suma, resta, multiplicaci�n y divisi�n) con cuatro 
	variables (a, b, c, d), se usa con switch, y un 5to 
	caso con switch que haga 5 preguntas (de dos opciones, 
	y si contesto algo que no va que arroja un resultado. 
	Ejemplo: esa no es tu edad) y que construya un argumento/texto 
	de las respuestas dadas.
	*/
	public static void main (String[] args) {
		int a, b, c, d;
		//System.out.println("Seleccione su opci�n: ");
		JOptionPane.showMessageDialog(null, "Seleccione su opci�n: ", "Bienvenido!", JOptionPane.INFORMATION_MESSAGE);
		String opcion = JOptionPane.showInputDialog("\n Ingrese el n�mero a seleccionar \n(1) Suma. (2) Resta. (3) Multiplicaci�n. (4) Divisi�n. (5) ??");
		int opcionm = Integer.parseInt(opcion);
		switch (opcionm) { // Men�
		case 1:{ //"suma"
			JOptionPane.showMessageDialog(null, "Seleccion� (1) Suma: ", "menu>suma", JOptionPane.INFORMATION_MESSAGE);
			String v1 = JOptionPane.showInputDialog("Ingrese su primer valor para sumar");
			a= Integer.parseInt(v1);
			String v2 = JOptionPane.showInputDialog("Ingrese su segundo valor para sumar");
			b= Integer.parseInt(v2);
			String v3 = JOptionPane.showInputDialog("Ingrese su tercer valor para sumar");
			c= Integer.parseInt(v3);
			String v4 = JOptionPane.showInputDialog("Ingrese su cuarto valor para sumar");
			d= Integer.parseInt(v4);
			JOptionPane.showMessageDialog(null, "La suma es: " + (a+b+c+d), "Total de la suma", JOptionPane.INFORMATION_MESSAGE);
		}
		break;
		case 2:{ //resta
			JOptionPane.showMessageDialog(null, "Seleccion� (2) Resta: ", "menu>resta", JOptionPane.INFORMATION_MESSAGE);
			String v1 = JOptionPane.showInputDialog("Ingrese su primer valor para restar");
			a= Integer.parseInt(v1);
			String v2 = JOptionPane.showInputDialog("Ingrese su segundo valor para restar");
			b= Integer.parseInt(v2);
			String v3 = JOptionPane.showInputDialog("Ingrese su tercer valor para restar");
			c= Integer.parseInt(v3);
			String v4 = JOptionPane.showInputDialog("Ingrese su cuarto valor para restar");
			d= Integer.parseInt(v4);
			JOptionPane.showMessageDialog(null, "La resta es: " + (a-b-c-d), "Total de la resta", JOptionPane.INFORMATION_MESSAGE);
		}
		break;
		case 3:{ //multiplicacion
			JOptionPane.showMessageDialog(null, "Seleccion� (3) Multiplicaci�n: ", "menu>multiplicacion", JOptionPane.INFORMATION_MESSAGE);
			String v1 = JOptionPane.showInputDialog("Ingrese su primer valor para multiplicar");
			a= Integer.parseInt(v1);
			String v2 = JOptionPane.showInputDialog("Ingrese su segundo valor para multiplicar");
			b= Integer.parseInt(v2);
			String v3 = JOptionPane.showInputDialog("Ingrese su tercer valor para multiplicar");
			c= Integer.parseInt(v3);
			String v4 = JOptionPane.showInputDialog("Ingrese su cuarto valor para multiplicar");
			d= Integer.parseInt(v4);
			JOptionPane.showMessageDialog(null, "La multiplicaci�n es: " + (a*b*c*d), "Total de la multiplicaci�n", JOptionPane.INFORMATION_MESSAGE);
		}
		break;
		case 4:{ // division
			JOptionPane.showMessageDialog(null, "Seleccion� (4) Divisi�n: ", "menu>division", JOptionPane.INFORMATION_MESSAGE);
			String v1 = JOptionPane.showInputDialog("Ingrese su primer valor para dividir");
			a= Integer.parseInt(v1);
			//if (a!=0) {
				String v2 = JOptionPane.showInputDialog("Ingrese su segundo valor para dividir");
				b= Integer.parseInt(v2);
				String v3 = JOptionPane.showInputDialog("Ingrese su tercer valor para dividir");
				c= Integer.parseInt(v3);
				String v4 = JOptionPane.showInputDialog("Ingrese su cuarto valor para dividir");
				d= Integer.parseInt(v4);
				JOptionPane.showMessageDialog(null, "La division es: " + (((a/b)/c)/d), "Total de la divisi�n", JOptionPane.INFORMATION_MESSAGE);
			/*}
			else {
				JOptionPane.showMessageDialog(null, "Ingres� un valor incorrecto", "Valor inv�lido", JOptionPane.WARNING_MESSAGE);
			*/	
			}
		break;
		case 5:{
			// Selecci�n
						// 1 �Cu�l es tu edad? op1
						// 19 edad (op1a) 50000000 edad (op1b)
						// if (op1==op1b){ "NO MIENTAS, no ten�s esa edad"}else{String textC1= "Hace 19 a�os..."}
			int op1 = JOptionPane.showOptionDialog(null, "1 �Cu�l es tu edad?", "S�lo los sabios saben la respuesta correcta", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object [] { "Mayor o igual 19 a�os", "50000000 a�os" }, "vvvv");
			int text = 1;
			if (op1==1){ 
				JOptionPane.showMessageDialog(null, "NO MIENTAS, no ten�s esa edad");
			}
			else {
				text++; // 2
				String textC1 = "Hace 19 a�os...";
			}
			// 2 �Perros o gatos? op2
			// Perro (op2b) Gato (op2a)
			// if (op2==op2a){ "Los gatos son mejores, pos miau"}else{String textC2= " los gatos dominar�n el mundo..."}
			
			int op2 = JOptionPane.showOptionDialog(null, "2) �Perros o gatos?", "S�lo los sabios saben la respuesta correcta", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object [] { "Perros", "Gatos"}, "vvvv");
			if (op2==0) {
				JOptionPane.showMessageDialog(null, "Los gatos son mejores, pos miau");
			}
			else {
				text++; //3
				String textC2 = " los gatos dominar�n el mundo...";
			}
			// 3 �Caf� con az�car o caf� con edulcorante? op3
			// if (op3==op3b){ "A vos no te gusta el edulcorante >:C "}else{String textC3= " mientras toman caf� junto a su amo..."}
			int op3 = JOptionPane.showOptionDialog(null, "3) �Caf� con az�car o caf� con edulcorante?", "S�lo los sabios saben la respuesta correcta", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object [] { "Caf� con az�car", "Caf� con edulcorante"}, "vvvv");
			if (op3==1) {
				JOptionPane.showMessageDialog(null, "A vos no te gusta el edulcorante >:C ");
			}
			else {
				text++; // 4
				String textC3 = " mientras toman caf� junto a su amo...";
			}
			// 4 �Qu� prefieres, no saber nada o saberlo todo? op4 **
			// No saber nada (op4a) Saberlo todo (op4b)
			// if (op4==op4a){ "La ignoracia te hace feliz"}else{String textC4= " con el saber absoluto..."}
			int op4 = JOptionPane.showOptionDialog(null, "4) �Qu� prefieres, no saber nada o saberlo todo?", "S�lo los sabios saben la respuesta correcta", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object [] { "No saber nada", "Saberlo todo"}, "vvvv");
			if (op4==0) {
				 JOptionPane.showMessageDialog(null, "La ignoracia te hace feliz");
			}
			else {
				text++; //5
				String textC4= " con el saber absoluto...";
			}
			// 5 �Amargo o dulce? op5 **
			// Amargo(op5a) Dulce (op5b)
			// if (op5==op5a){ ""}else{String textC5= " ..."}
			int op5 = JOptionPane.showOptionDialog(null, "5) �Amargo o dulce?", "S�lo los sabios saben la respuesta correcta", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object [] { "Amargo", "Dulce"}, "vvvv");
			if (op5==0) {
				 JOptionPane.showMessageDialog(null, "Aguante el amargo (?)");
			}
			else {
				text++; //6
				String textC5= " comiendo dulces...";
			}
			//JOptionPane.showMessageDialog(null, "" + textC1 + textC2 + textC3 + textC4 + textC5);
			//JOptionPane.showMessageDialog(null, "El valor es: " + text);
			if (text==6) {
				JOptionPane.showMessageDialog(null, "Hace 19 a�os... los gatos dominar�n el mundo... mientras toman caf� junto a su amo... con el saber absoluto... comiendo dulces...");
			}
			else {
				JOptionPane.showMessageDialog(null, "Usted no es chevere");
			}
		}
		default: {
			JOptionPane.showMessageDialog(null, "Ingres� una opci�n incorrecta o finaliz� el programa", "Opci�n inv�lida o fin del programa", JOptionPane.WARNING_MESSAGE);
		}
		break;
		}
	}
}
