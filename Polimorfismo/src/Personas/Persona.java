package Personas;
public class Persona {
	// Creamos los atributos de la clase <Persona>
	private String nombre;
	private String apellido;
	private int edad;
	// Creamos el método persona
	public Persona () {
		nombre = " ";
		apellido = " ";
		edad = 0;
	}
	public Persona (String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	// Creamos los métodos Get
	public String getNombre () {
		return nombre;
	}
	public String getApellido () {
		return apellido;
	}
	public int getEdad () {
		return edad;
	}
}
