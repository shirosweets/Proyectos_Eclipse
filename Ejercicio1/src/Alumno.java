
public class Alumno extends Persona { // Hijo de Persona
	// Con 5 personas 3 locales 2 ext
	// nombre, apellido,  edad, carrera, semestre
	private String carrera;
	private String semestre;
	// Constructores
	public Alumno ( ) {
		this.carrera = " ";
		this.semestre = " ";
	}
	public Alumno (String nombre, String apellido, int edad, String carrera, String semestre) {
		super(nombre, apellido, edad);
		this.carrera = carrera;
		this.semestre = semestre;
	}
	// Getters
	public String getCarrera(){
		return carrera;
	}
	public String getSemestre(){
		return semestre;
	}
	public void mostrarDatos() {
		System.out.println (" Los datos del alumno son: " + getNombre() + " " + getApellido() + " " + getEdad() + " " + getCarrera() + " " + getSemestre() );
	}
	
	
}
