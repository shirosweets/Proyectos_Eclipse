import java.util.ArrayList;

import Personas.Profesor;
public class Lista {
	private ArrayList <Profesor> Lista;
	// Constructores
	public Lista () {
		Lista = new ArrayList <Profesor> ();
	}
	// Métodos
	public void addProfesor (Profesor profesor){ // Obj profesor de la clase Profesor
		Lista.add(profesor);
	}
	public void listar () {
		System.out.println (" Se procede a mostar la lista de profesores existentes: ");
		for (Profesor tmp:Lista) {
			tmp.mostrarDatos();
		}
	}
}
