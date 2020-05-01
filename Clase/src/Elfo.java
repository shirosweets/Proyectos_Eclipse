//Clase papá
public class Elfo {
	//public static void main (String[] args) {}
	private String nombre; 
	private String genero;
	private int ilvl;
	// Constructores 
	public Elfo(String nombre, String genero, int ilvl) { // Clase constructor
		this.nombre = nombre; // tipo privado this.
		this.genero = genero;
		this.ilvl = ilvl;
	}
	// Métodos 
	public String getNombre() {
		return nombre;
	} 
	public String getGenero() {
		return genero;
	}
	public int getIlvl() {
		return ilvl;
	}
}
