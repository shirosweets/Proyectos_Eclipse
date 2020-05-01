import java.util.HashMap;
import java.util.Scanner;
import java.util.Iterator;
public class Ejemplo {
	// Acá van los métodos
	public static void guardarProducto (String codigo, float precio, HashMap <String, Float> ListaProductos) {
		if (ListaProductos.containsKey(codigo)) {
			System.out.println("\n No se puede introducir el producto porque el código está repetido");
		}
		else {
			ListaProductos.put(codigo, precio);
		}
	}
	public static void modificaPrecio (String codigo, HashMap <String, Float> ListaProductos) {
		Scanner tec = new Scanner (System.in);
		if (ListaProductos.containsKey(codigo)) {
			System.out.println("\nIntroduce el precio del producto: ");
			ListaProductos.put(codigo, tec.nextFloat());
		}
		else {
			System.out.println("\n No hay ningún producto con ese código!! ");
		}
	}
	public static void mostrarProducto (HashMap <String, Float> ListaProductos) {
		String clave;
		Iterator <String> productos = ListaProductos.keySet().iterator();
		System.out.println("\n Hay los siguientes productos: \n");
		while (productos.hasNext()) {
			clave = productos.next();
			System.out.println(clave + " - " + ListaProductos.get(clave));
		}
	}
	public static void eliminarProducto (String codigo, HashMap <String, Float> ListaProductos){
		if (ListaProductos.containsKey(codigo)) {
			ListaProductos.remove(codigo);
		}
		else {
			System.out.println("\n No hay ningún producto con ese código!! ");
		}
	}
	public static void main (String[] args) { // Este es un método, el método main
		HashMap <String, Float> ListaProductos = new HashMap <String, Float> (); // Declaración
		Scanner tec = new Scanner (System.in);
		int opcion = 0;
		float precio;
		String codigo;
		// Creamos los métodos que no van acá porque esto ES un método y no es correcto tener un método dentro de otro.
		while (opcion!=5) {
			System.out.println("\nIngrese la opcion que desee elegir \n1) Introducir producto \n2) Modificar precio \n3) Mostrar todos los productos \n4) Eliminar producto \n5) Saliir");
			opcion = tec.nextInt();
			switch (opcion) {
			case 1: {
				System.out.println("\n>> Introducir el código del producto <<");
				codigo = tec.next();
				System.out.println("\n>> Introducir el precio del producto <<");
				precio = tec.nextFloat();
				guardarProducto (codigo, precio, ListaProductos);
			}
			break;
			case 2: {
				System.out.println("\n>> Introducir el código del producto que desea cambiar el precio <<");
				codigo = tec.next();
				modificaPrecio (codigo, ListaProductos);
			}
			break;
			case 3: {
				mostrarProducto (ListaProductos);
			}
			break;
			case 4: {
				System.out.println("\n>> Introducir el código del producto que desea eliminar <<");
				codigo = tec.next();
				eliminarProducto (codigo, ListaProductos);
			}
			break;
			case 5: {}
			break;
			default: {
				System.out.println("\n Pues miau :( No elegiste una opción válida ");
			}
			break;
			} // Fin switch		
		}
	}
}
