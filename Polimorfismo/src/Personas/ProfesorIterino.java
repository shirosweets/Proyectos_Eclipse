package Personas;
import java.util.Calendar;
public class ProfesorIterino extends Profesor{
	private Calendar fechaComienzoIterinato;
	// Constructor para calendario
	public ProfesorIterino (Calendar fechaComienzoIterinatO) { // Método que fija la fecha
		super(); // Nos permite acceder a los métodos o atributos de Profesor y Persona
		fechaComienzoIterinatO = fechaComienzoIterinato;
	}
	public ProfesorIterino (String nombre, String apellido, int edad, Calendar fechaComienzoIterinatO) { // Con los de Profesor y propios
		super(nombre, apellido, edad);
		fechaComienzoIterinatO= fechaComienzoIterinato;
	}
	// Método para obtener la fecha del Iterinato
	public Calendar getfechaComienzoIterinato () {
		return fechaComienzoIterinato;
	}
	// Método para mostrar datos
	public void mostrardatos () { // Atributo = objeto;
		System.out.println("Datos del profesor iterino comienza: " + fechaComienzoIterinato.getTime().toString() );
		// getTime() método de la clase Calendar, obtiene el tiempo del objeto; 
		// toString() método de la clase Calendar, convierte el tiempo en una cadena;
	}
}
