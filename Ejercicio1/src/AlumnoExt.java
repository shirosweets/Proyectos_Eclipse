
public class AlumnoExt extends Alumno { // Hijo de Alumno
	// Con 5 personas 3 locales 2 ext
	// nombre, apellido,  edad, carrera, semestre
	private String nacionalidad;
	// Constructor
	public AlumnoExt () {
		this.nacionalidad = " ";
	}
	public AlumnoExt (String nombre, String apellido, int edad, String carrera, String semestre, String nacionalidad) {
		super(nombre, apellido, edad, carrera, semestre);
		this.nacionalidad = nacionalidad;
	}
	// Get
	public String getNacionalidad(){
		return nacionalidad;
	}
	public void mostrarDatos() {
		System.out.println (" Los datos del alumno de intercambio son: " + getNombre() + " " + getApellido() + " " + getEdad() + " " + getCarrera() + " " + getSemestre() + getNacionalidad() );
	}
}
