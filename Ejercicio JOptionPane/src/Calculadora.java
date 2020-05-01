import javax.swing.*;
public class Calculadora {
	/* Ejercicio con JOptionPane que sea una calculadora, que haga 4 
	cálculos (suma, resta, multiplicación y división) con cuatro 
	variables (a, b, c, d), se usa con switch, y un 5to 
	caso con switch que haga 5 preguntas (de dos opciones, 
	y si contesto algo que no va que arroja un resultado. 
	Ejemplo: esa no es tu edad) y que construya un argumento/texto 
	de las respuestas dadas.
	*/
	public static void main (String[] args) {
		int a, b, c, d;
		//System.out.println("Seleccione su opción: ");
		JOptionPane.showMessageDialog(null, "Seleccione su opción: ", "Bienvenido!", JOptionPane.INFORMATION_MESSAGE);
		String opcion = JOptionPane.showInputDialog("\n Ingrese el número a seleccionar \n(1) Suma. (2) Resta. (3) Multiplicación. (4) División. (5) ??");
		int opcionm = Integer.parseInt(opcion);
		switch (opcionm) { // Menú
		case 1:{ //"suma"
			JOptionPane.showMessageDialog(null, "Seleccionó (1) Suma: ", "menu>suma", JOptionPane.INFORMATION_MESSAGE);
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
			JOptionPane.showMessageDialog(null, "Seleccionó (2) Resta: ", "menu>resta", JOptionPane.INFORMATION_MESSAGE);
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
			JOptionPane.showMessageDialog(null, "Seleccionó (3) Multiplicación: ", "menu>multiplicacion", JOptionPane.INFORMATION_MESSAGE);
			String v1 = JOptionPane.showInputDialog("Ingrese su primer valor para multiplicar");
			a= Integer.parseInt(v1);
			String v2 = JOptionPane.showInputDialog("Ingrese su segundo valor para multiplicar");
			b= Integer.parseInt(v2);
			String v3 = JOptionPane.showInputDialog("Ingrese su tercer valor para multiplicar");
			c= Integer.parseInt(v3);
			String v4 = JOptionPane.showInputDialog("Ingrese su cuarto valor para multiplicar");
			d= Integer.parseInt(v4);
			JOptionPane.showMessageDialog(null, "La multiplicación es: " + (a*b*c*d), "Total de la multiplicación", JOptionPane.INFORMATION_MESSAGE);
		}
		break;
		case 4:{ // division
			JOptionPane.showMessageDialog(null, "Seleccionó (4) División: ", "menu>division", JOptionPane.INFORMATION_MESSAGE);
			String v1 = JOptionPane.showInputDialog("Ingrese su primer valor para dividir");
			a= Integer.parseInt(v1);
			//if (a!=0) {
				String v2 = JOptionPane.showInputDialog("Ingrese su segundo valor para dividir");
				b= Integer.parseInt(v2);
				String v3 = JOptionPane.showInputDialog("Ingrese su tercer valor para dividir");
				c= Integer.parseInt(v3);
				String v4 = JOptionPane.showInputDialog("Ingrese su cuarto valor para dividir");
				d= Integer.parseInt(v4);
				JOptionPane.showMessageDialog(null, "La division es: " + (((a/b)/c)/d), "Total de la división", JOptionPane.INFORMATION_MESSAGE);
			/*}
			else {
				JOptionPane.showMessageDialog(null, "Ingresó un valor incorrecto", "Valor inválido", JOptionPane.WARNING_MESSAGE);
			*/	
			}
		break;
		case 5:{
			// Selección
						// 1 ¿Cuál es tu edad? op1
						// 19 edad (op1a) 50000000 edad (op1b)
						// if (op1==op1b){ "NO MIENTAS, no tenés esa edad"}else{String textC1= "Hace 19 años..."}
			int op1 = JOptionPane.showOptionDialog(null, "1 ¿Cuál es tu edad?", "Sólo los sabios saben la respuesta correcta", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object [] { "Mayor o igual 19 años", "50000000 años" }, "vvvv");
			int text = 1;
			if (op1==1){ 
				JOptionPane.showMessageDialog(null, "NO MIENTAS, no tenés esa edad");
			}
			else {
				text++; // 2
				String textC1 = "Hace 19 años...";
			}
			// 2 ¿Perros o gatos? op2
			// Perro (op2b) Gato (op2a)
			// if (op2==op2a){ "Los gatos son mejores, pos miau"}else{String textC2= " los gatos dominarán el mundo..."}
			
			int op2 = JOptionPane.showOptionDialog(null, "2) ¿Perros o gatos?", "Sólo los sabios saben la respuesta correcta", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object [] { "Perros", "Gatos"}, "vvvv");
			if (op2==0) {
				JOptionPane.showMessageDialog(null, "Los gatos son mejores, pos miau");
			}
			else {
				text++; //3
				String textC2 = " los gatos dominarán el mundo...";
			}
			// 3 ¿Café con azúcar o café con edulcorante? op3
			// if (op3==op3b){ "A vos no te gusta el edulcorante >:C "}else{String textC3= " mientras toman café junto a su amo..."}
			int op3 = JOptionPane.showOptionDialog(null, "3) ¿Café con azúcar o café con edulcorante?", "Sólo los sabios saben la respuesta correcta", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object [] { "Café con azúcar", "Café con edulcorante"}, "vvvv");
			if (op3==1) {
				JOptionPane.showMessageDialog(null, "A vos no te gusta el edulcorante >:C ");
			}
			else {
				text++; // 4
				String textC3 = " mientras toman café junto a su amo...";
			}
			// 4 ¿Qué prefieres, no saber nada o saberlo todo? op4 **
			// No saber nada (op4a) Saberlo todo (op4b)
			// if (op4==op4a){ "La ignoracia te hace feliz"}else{String textC4= " con el saber absoluto..."}
			int op4 = JOptionPane.showOptionDialog(null, "4) ¿Qué prefieres, no saber nada o saberlo todo?", "Sólo los sabios saben la respuesta correcta", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object [] { "No saber nada", "Saberlo todo"}, "vvvv");
			if (op4==0) {
				 JOptionPane.showMessageDialog(null, "La ignoracia te hace feliz");
			}
			else {
				text++; //5
				String textC4= " con el saber absoluto...";
			}
			// 5 ¿Amargo o dulce? op5 **
			// Amargo(op5a) Dulce (op5b)
			// if (op5==op5a){ ""}else{String textC5= " ..."}
			int op5 = JOptionPane.showOptionDialog(null, "5) ¿Amargo o dulce?", "Sólo los sabios saben la respuesta correcta", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object [] { "Amargo", "Dulce"}, "vvvv");
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
				JOptionPane.showMessageDialog(null, "Hace 19 años... los gatos dominarán el mundo... mientras toman café junto a su amo... con el saber absoluto... comiendo dulces...");
			}
			else {
				JOptionPane.showMessageDialog(null, "Usted no es chevere");
			}
		}
		default: {
			JOptionPane.showMessageDialog(null, "Ingresó una opción incorrecta o finalizó el programa", "Opción inválida o fin del programa", JOptionPane.WARNING_MESSAGE);
		}
		break;
		}
	}
}
