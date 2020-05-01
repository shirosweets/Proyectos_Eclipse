
public class Main {
	// Con 5 personas 3 locales 2 ext
	// nombre, apellido,  edad, carrera, semestre
	// Alumno>> String nombre, String apellido, int edad, String carrera, String semestre
	// AlumnoExt>> String nombre, String apellido, int edad, String carrera, String semestre, String nacionalidad
	public static void main (String[] args) {
		Alumno alum1 = new Alumno ("Hugo", "Gomez", 20, "Geólogo", "Primero");
		Alumno alum2 = new Alumno ("Lorena", "Lopez", 18, "Bioquímica", "Primero");
		Alumno alum3 = new Alumno ("Helena", "Torrez", 21, "Astronauta", "Segundo");
		AlumnoExt alumExt1 = new AlumnoExt ("Jorge", "Gimenez", 24, "Médico", "Cuarto", " Nicaragua");
		AlumnoExt alumExt2 = new AlumnoExt ("Emiliana", "Villa", 18, "Enfermera", "Primero", " Venezuela");
		Matri matri1 = new Matri ();
		matri1.addAlumno(alum1);
		matri1.addAlumno(alum2);
		matri1.addAlumno(alum3);
		matri1.addAlumno(alumExt1);
		matri1.addAlumno(alumExt2);
		matri1.listar();
	}
}
