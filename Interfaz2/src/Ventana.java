import java.awt.FlowLayout;
import javax.swing.*;
public class Ventana {
	public static void main (String[] args) {
		JFrame miVentana = new JFrame();
		miVentana.setTitle("Wendy");
		JButton btnUno = new JButton("Hola");
		JButton btnDos = new JButton("Adiós");
		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miVentana.setLayout(new FlowLayout());
		miVentana.add(btnUno); // Agrega boton
		miVentana.add(btnDos);
		miVentana.pack(); // Empaqueta todo
		miVentana.setVisible(true);
		miVentana.setSize(300, 200);
	}
}
