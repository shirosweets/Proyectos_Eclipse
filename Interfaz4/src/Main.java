import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Main {
	public static void main (String[] args) {
		VentanaPrincipal miVentanaPrincipal;
		miVentanaPrincipal= new VentanaPrincipal();
		miVentanaPrincipal.setVentanaPrincipal(miVentanaPrincipal); // Env�o el objeto como par�metro para que sea el �nico en la aplicaci�n
		miVentanaPrincipal.setVisible(true);
	}
}
