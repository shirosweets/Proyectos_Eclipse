package Main;
import java.util.ArrayList;
public class Main {
	public static ArrayList <selecDeFutbol> integrantes = new ArrayList <selecDeFutbol> (); // Obj
	public static void main (String [] args) { // Método main
		Entrenador delBosque = new Entrenador (1, "Vicente ", "del Bosque", 60, "284eZ89"); // Obj de 5 variables 
		Futbolista iniesta = new Futbolista (2, "Andes", "Iniesta", 29, 6, "Interior derecho"); // Obj de 6 variables
		Masajista raulMartinez= new Masajista (3, "Raúl", "Martinez", 41, "Lic. en fisioterapia", 18); // Ojb de 6  variables
		integrantes.add(delBosque);
		integrantes.add(iniesta);
		integrantes.add(raulMartinez);
		System.out.println(" Todos los integrantes comienzan una concentración (todos ejecutan el mismo método)");
		for (selecDeFutbol integrante :integrantes) {
			System.out.println(integrante.getNombre() + " " + integrante.getApellido() + " ");
			integrante.concentrarse():
		}
		// Viaje
		System.out.println("Todos los integrantes viajan para jugar un partido (todos ejecutan el mismo método)");
		for (selecDeFutbol integrante :integrantes) {
			System.out.println(integrante.getNombre() + " " + integrante.getApellido() + " " );
			integrante.viajar(); 
		}
		// Entrenamiento
		
	}
}
