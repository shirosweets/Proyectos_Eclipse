import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class VentanaConfirmacion extends JDialog {
	private Container contenedor;
	JLabel lTitulo;
	public VentanaConfirmacion (VentanaPrincipal miVentanaPrincipal, boolean modal) { // boolean modal determina si es un hijo lo que ejecutamos
		super(miVentanaPrincipal, modal); // modal es un nombre nada más
		contenedor = getContentPane();
		contenedor.setLayout(null);
		setTitle("Vale Ventana Confirmación");
		lTitulo = new JLabel();
		lTitulo.setText("Ventana de Confirmación");
		lTitulo.setBounds(20, 20, 180, 23);
		contenedor.add(lTitulo);
		setSize(350, 150);
		setLocationRelativeTo(null);
	}
}
