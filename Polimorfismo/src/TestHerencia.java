import java.util.Calendar;
import Personas.Profesor;
import Personas.ProfesorIterino;
public class TestHerencia {
	public static void main (String [] args) {
		// Creamosel objeto profesor1 de Profesor
		Profesor profesor1= new Profesor("Valentina", "Vispo", 19);
		// profesor1 hereda todos los métodos y atributos de sus padres
		profesor1.setidProfesor("Prof 1596");
		Calendar fecha1 = Calendar.getInstance() ; // Crea un objeto tipo Calendar de nombre fecha1
		// get.Intance() obtiene los valores del calendario.
		fecha1.set(2019, 10, 22); // año, mes, dia
		// Creamos el objeto profesorIterino1 de ProfesorIterino
		ProfesorIterino profesorIterino1 = new ProfesorIterino("Jorge Arturo", "Palmero", 32, fecha1);
		Lista lista1 = new Lista(); // Obj de Lista
		lista1.addProfesor(profesor1); // Agrega al profesor1 a la lista1 de Lista
		lista1.addProfesor(profesorIterino1);
		lista1.listar();
	}
	
}
