import javax.swing.*;
import java.awt.*;

public class Dialogo { // Pido informacion
	// Dialogo>> ventana emergente volatil (pido o doy información)
	public static double areaCirculo (int radio) {
		return Math.pow(radio, 2)*Math.PI;
	}
	public static double areaTriangulo (int base, int altura) {
		return (base*altura)/2;
	}
	public static double areaCuadrado (int lado) {
		return lado*lado;
	}
	public static void main (String[] args) {
		String texto="";
		Double resultado = 0.;
		JOptionPane.showMessageDialog(null, "Cuidado ella es Valentina", "Warning_Message", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "Me faltó un punto y coma :(", "ERROR", JOptionPane.ERROR_MESSAGE);
		JOptionPane.showMessageDialog(null, "Uy que inteligente", "Information_Message", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "¿Quiénes somos?", "Question_Message", JOptionPane.QUESTION_MESSAGE);
		// Opcion multiple en contedor
		Object color = JOptionPane.showInputDialog(null, "Seleccione un color", "Colores", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Seleccione", "Amarillo", "Azul", "Rojo"}, "Seleccione");
		// Opcion multiple con botones
		 int resp = JOptionPane.showConfirmDialog(null, "¿Te gusta Java?");
		if (JOptionPane.OK_OPTION == resp) { // .OK_OPTION "Si" "No" "Cancelar"
			System.out.println("Selecciona una opcion afirmativa");
		}
		else {
			System.out.println("No selecciona una opcion afirmativa");	
		} 
		// Mensaje de diálogo setteadas
		JCheckBox check = new JCheckBox("Reprobado");
		int seleccion = JOptionPane.showOptionDialog(null, "Te gusta la programación, ¿verdad? (O_O)", "Sólo los sabios saben la respuesta correcta", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object [] { "Yo busco la verdad", "Yo conozco la verdad", "YO soy la verdad", "Yo no sé qué hacer", check}, "Yo busco la verdad");
		//
		if (seleccion!=-1) {
			System.out.println("Tu respuesta es: " + (seleccion+1));
		}
		if (check.isSelected()) {
			System.out.println("No mereces el conocimiento (¬_¬*)");
		}
		String eleccion = JOptionPane.showInputDialog("Introduce una figura: circulo, triangulo o cuadrado"); // Mensaje emergente
		JOptionPane.showMessageDialog(null, "Seleccionaste " + eleccion);
		switch(eleccion){
		case "circulo": {
			texto=JOptionPane.showInputDialog("Introduce el radio");
			int radio = Integer.parseInt(texto);
			resultado = areaCirculo(radio);
		}	
		break;
		case "triangulo": {
			texto = JOptionPane.showInputDialog("Introduzca la base");
			int base=Integer.parseInt(texto);
			texto = JOptionPane.showInputDialog("Intruzca la altura");
			int altura=Integer.parseInt(texto);
			resultado = areaTriangulo(base, altura);
		}
		break;
		case "cuadrado": {
			texto = JOptionPane.showInputDialog("Introduzca el lado");
			int lado=Integer.parseInt(texto);
			resultado = areaCuadrado(lado);
		}
		break;
		default: {
			JOptionPane.showMessageDialog(null, "No ingresó una opción válida", "Uy que bruto", JOptionPane.INFORMATION_MESSAGE);
		}
		break;
		}
		System.out.println("El área del " + eleccion + " es " + resultado);
		
	}
}
