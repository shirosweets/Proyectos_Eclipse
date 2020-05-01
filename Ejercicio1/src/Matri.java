import java.util.ArrayList;

public class Matri { // Matricula Hijo de Alumno
	// Con 5 personas 3 locales 2 ext
	// nombre, apellido,  edad, carrera, semestre
	private ArrayList <Alumno> Matri;
	// Constructor
	public Matri () {
		Matri = new ArrayList <Alumno> ();
	}
	// Métodos
	public void addAlumno (Alumno alumno) {
		Matri.add(alumno);
	}
	public void listar () {
		System.out.println (" Se procede a mostar la lista de alumnos existentes: ");
		for (Alumno tmp:Matri) {
			tmp.mostrarDatos();
		}
	}
	// Get
	/* public int getMatricula(){
		return matricula;
	}
	*/
}
