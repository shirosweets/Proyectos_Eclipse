import java.io.*;

// Donde evualamos las calificaciones
public class Notas {
	public static void main(String[] args) {
		double media=0, total=0, nota=0;
		int contador=0;
		String notaTxt = "";
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		// .equals() compara el contenido de una variable u objeto
		// Ocurre el while mientras la notaTxt no contenga una z.
		while (!notaTxt.equals("Z")) {
			try {
				System.out.println("Tecla la calificación del 1 al 10 y presione Z para terminar");
				notaTxt = entrada.readLine().toUpperCase(); // .toUpperCase() vuelve todo a mayúsculas
				// .valueOf() transforma String a Double
				nota = Double.valueOf(notaTxt).doubleValue(); 
				if(nota<0 || nota>10) throw new NotaMal(); {
					total+= nota;
					contador = contador+1;
				}
			}
			catch (NotaMal nm) {
				System.out.println("\n " + nm.getMessage());
			}
			catch (NumberFormatException nfe) {
				if(!notaTxt.equals("Z")) {
					System.out.println("Error de formato numérico " + nfe.toString());
				}
			}
			catch (IOException ioe) {
				System.out.println("Error de formato y salida " + ioe.toString());
			}
			catch (Exception e) {
				System.out.println(e.toString());
			}
		}
		if(contador!=0) {
			media = (double)total/contador; // (double)>> fuerza a que el resultado sea double
			System.out.println("\n El promedio del grupo es " + media);
		}
		else {
			System.out.println("\n No se introdujeron calificaciones");
		}
	}
}
