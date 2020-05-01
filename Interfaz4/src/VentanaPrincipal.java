import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class VentanaPrincipal extends JFrame implements ActionListener{ // ActionListener escuchar botones etiquetas o ventanas (escuchar: teclado o puntero interact�an con el programa)
	private Container contenedor;
	JButton bcambiar;
	JLabel labelTitulo; // Crea una etiqueta u objeto de tipo label
	private VentanaPrincipal miVentanaPrincipal; // Creo VentanaPrincipal
	public VentanaPrincipal () {
		iniciarComponentes();
		setTitle("Vale esta es mi ventana principal");
		setSize(400, 300);
		setLocationRelativeTo(null);
	}
	public void setVentanaPrincipal (VentanaPrincipal miVentanaP) {
		miVentanaPrincipal = miVentanaP;
	}
	public void iniciarComponentes() {
		contenedor = getContentPane(); // Instanciamos el contenedor
		contenedor.setLayout(null);
		// Propiedades del bot�n
		bcambiar = new JButton();
		bcambiar.setText("Iniciar");
		bcambiar.setBounds(100, 80, 80, 23); // Coordenadas del bot�n
		bcambiar.addActionListener(this); // Reaccione cuando lo presiono "Escuchando el bot�n"
		// Propiedades de la etiqueta
		labelTitulo = new JLabel();
		labelTitulo.setText("Ventana Principal");
		labelTitulo.setBounds(80, 20, 120, 23);
		contenedor.add(labelTitulo);
		contenedor.add(bcambiar);
	}
	public void actionPerformed (ActionEvent evento) { // 
		if (evento.getSource()==bcambiar) { // .getSource() instrucci�n que eval�a la acci�n del bot�n
			VentanaConfirmacion miVentanaConfirmacion = new VentanaConfirmacion (miVentanaPrincipal, true); // Ocurre si el bot�n es true
			miVentanaConfirmacion.setVisible(true);
		}
	}
}
