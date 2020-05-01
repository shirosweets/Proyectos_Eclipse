import javax.swing.*;
import java.awt.*;
public class Ventana extends JFrame {
	public Ventana (String titulo) {
		setTitle(titulo);
		iniciarComponentes();
		mostrarVentana();
	}
	public void iniciarComponentes(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btn1 = new JButton ("Exterminar");
		JButton btn2 = new JButton ("Salvar");
		setLayout(new FlowLayout());
		add(btn1);
		add(btn2);
	}
	public void mostrarVentana() {
		setSize(500, 300);
		setVisible(true);
	}
}
