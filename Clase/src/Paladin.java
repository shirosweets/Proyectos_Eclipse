// Clase subclase hijo de la superclase papá Elfo
public class Paladin extends Elfo {
	// Campos específicos de la subclase
	private String IdPaladin; // public Elfo(String nombre, String genero, int ilvl) Clase constructor papá ; atributo Paladin
	// Constructor de la subclase hijo
	public Paladin (String nombre, String genero, int ilvl) {
		super(nombre, genero, ilvl); // Instrucción que llamo a llamar los atributos de la superclase papá Elfo
		IdPaladin = "desconocido";
	}
	// Método específicos para la clase subclase hijo
	public void setIdPaladin (String IdPaladin) { // Setter
		this.IdPaladin = IdPaladin;
	}
	public String getIdPaladin () { // Getter
		return IdPaladin;
	}
	public void mostrarNombreGeneroBIlvl () {
		// public Elfo(String nombre, String genero, int ilvl) sino no se puede acceder a ellos porque son privados
		System.out.println("Paladin de nombre: " + getNombre() + " :) " + getGenero() + " :) " + "ID Bliz "+ getIdPaladin());
	}
}
