package Personas;
public class Profesor extends Persona {// Es hijo de persona	
	private String idProfesor;
	public Profesor () {
		super ();
		idProfesor= " Desconocido";
	}
	public Profesor (String nombre, String apellido, int edad) { // Con los de Persona
		super (nombre, apellido, edad);
		idProfesor = " Desconocido";
	}
	// Set
	public void setidProfesor (String idProfesor) {
		this.idProfesor = idProfesor;
	}
	// Get
	public String getidProfesor () {
		return idProfesor;
	}
	public void mostrarDatos () { // Método
		System.out.println(" Datos profesor, profesor de nombre: " + getNombre() + " " + getApellido() + " ID de profesor" + getidProfesor() );
	}
	
}
