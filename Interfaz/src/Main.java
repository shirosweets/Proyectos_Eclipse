import java.awt.Container; // vieja
import javax.swing.JFrame; // nueva

/*public class Main extends JFrame {
	//public 
	private Container contenedor;
	public static void main (String[] args) {
		public Main() { // Constructor
			contenedor = getContentPane();
			contenedor.setLayout(null);
			setTitle("Esta es mi ventana");
			setSize(400, 200); // Alto x Ancho
			setLocationRelativeTo(null);
		}
	}
}*/
public class Main{
	public static void main (String[] args) {
		
		JFrame miVentana = new JFrame("Título extraordinario");
		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Agrega _ [] X
		miVentana.setSize(300, 200); // Fija tamaño (Horizontal x Vertical)(Altura x Ancho) se mide en pixeles
		miVentana.setVisible(true); // Lo muestra
		
		JFrame miVentana2 = new JFrame("Título triste");
		miVentana2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cierra TODO
		miVentana2.setSize(300, 200);
		miVentana2.setVisible(true);
		miVentana2.setLocationRelativeTo(null); // Posición por default (centro)
		
		JFrame miVentana3 = new JFrame("Título imposible");
		miVentana3.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // Impide cerrarla
		miVentana3.setSize(300, 200);
		miVentana3.setVisible(true);
		miVentana3.setLocationRelativeTo(null); // Posición por default (centro)
		
		JFrame miVentana4 = new JFrame("Título disvariando");
		miVentana4.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); // La esconde
		miVentana4.setSize(300, 200);
		miVentana4.setVisible(true);
		miVentana4.setLocationRelativeTo(null); // Posición por default (centro)
	}
}