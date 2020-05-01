
public class Persona {
	// Con 5 personas 3 locales 2 ext
	// nombre, apellido,  edad, carrera, semestre
	private String nombre;
	private String apellido;
	private int edad;
	// Métodos
	public Persona () { // Vacio o default
		nombre = " ";
		apellido = " ";
		edad= 0;
	}
	public Persona (String  nombre, String apellido, int edad) { // Con parámetros
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	// Getters
	public String getNombre(){
		return nombre;
	}
	public String getApellido(){
		return apellido;
	}
	public int getEdad(){
		return edad;
	}
}
