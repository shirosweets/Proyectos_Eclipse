import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Main {
	public static void main (String[] args) {
		VentanaPrincipal miVentanaPrincipal;
		miVentanaPrincipal= new VentanaPrincipal();
		miVentanaPrincipal.setVentanaPrincipal(miVentanaPrincipal); // Envío el objeto como parámetro para que sea el único en la aplicación
		miVentanaPrincipal.setVisible(true);
	}
}
