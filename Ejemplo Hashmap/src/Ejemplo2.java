import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
public class Ejemplo2 {
	public static void ingresarLibro(String nombre, String codigo, HashMap <String, String> Libros, String autor){
		if (Libros.containsKey(nombre)) {
			System.out.println("\n No se puede ingresar el libro porque ya existe uno con ese nombre");
		}
		else {
			Libros.put(nombre, codigo);
		}
	}
	public static void modificarLibro(String nombre, String codigo, HashMap <String, String> Libros){
		Scanner tec = new Scanner (System.in);
		if (Libros.containsKey(nombre)) {
			System.out.println("\n Ingrese el nombre del libro: ");
			Libros.put(tec.next(), codigo);
		}
		else {
			System.out.println("\n No hay ningún libro con ese nombre!! ");
		}
	}
	public static void mostrarLibros(HashMap <String, String> Libros, String autor){
		String clave;
		Iterator <String> librito = Libros.keySet().iterator();
		System.out.println("Hay los siguientes libros: \n");
		while (librito.hasNext()) {
			clave = librito.next();
			System.out.println(clave + " - " + Libros.get(clave));
		}
	}
	public static void eliminarLibro(String nombre, String codigo, HashMap <String, String> Libros, String autor) {
		if (Libros.containsKey(nombre)) {
			Libros.remove(nombre);
		}
		else {
			System.out.println("\n No hay ningún libro con ese nombre!! ");
		}
	}
	public static void main (String [] args) {
		// Biblioteca ingresar libros, codigo icbn, nombre del libro, autor, introducir libro, modificar icbn, mostrar los libros y eliminar libro
		Scanner tec = new Scanner (System.in);
		HashMap <String, String> Libros = new HashMap <String, String> ();
		int opcion=0;
		System.out.println("\n Bienvenido a la biblioteca internacional, nuestras opciones son: \n1) Ingresar libro a la biblioteca \n 2) Modificar libro de la biblioteca \n 3) Mostrar todos los libros de la biblioteca \n 4) Eliminar un libro de la biblioteca \n 5) Salir");
		System.out.println("\n Por favor, elija una opción: ");
		opcion = tec.nextInt();
		String nombre;
		String autor;
		String codigo;
		switch (opcion) {
		case 1: { // Ingresar libro
			System.out.println("\n Ingrese el nombre del libro ");
			nombre = tec.next();
			System.out.println("\n Ingrese el codigo ICBN del libro ");
			codigo = tec.next();
			System.out.println("\n Ingrese el autor del libro ");
			autor = tec.next();
			ingresarLibro(nombre, codigo, Libros, autor);
		}
		break;
		case 2: { // Modificar libro
			System.out.println("\n Ingrese el nombre del libro que quiere modificar");
			nombre = tec.next();
			modificarLibro(nombre, codigo, Libros);
		}
		break;
		case 3: { // Mostrar los libros
			System.out.println("\n Todos los libros de la biblioteca son: ");
			mostrarLibros(Libros, autor);
		}
		case 4: { // Eliminar un libro
			System.out.println("\n Ingrese el nombre del libro que desea eliminar");
			nombre = tec.next();
			eliminarLibro(nombre, codigo, Libros, autor);
		}
		break;
		case 5: { // Salir
		}
		break;
		default: {
			System.out.println("\n Opción inválida");
		}
		break;
		}
	}
}
