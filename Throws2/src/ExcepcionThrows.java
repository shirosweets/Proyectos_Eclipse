import java.io.*;

public class ExcepcionThrows {
	public static double capturaNum() throws NumberFormatException, IOException {
		//
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		String txt = entrada.readLine();
		double num = Double.parseDouble(txt);
		return num;
	}
	public static void main (String[] args) {
		double op1, op2, resd;
		while(true) {
			try {
				System.out.println("Nueva división \n Numerador");
				op1=capturaNum();
				System.out.println("\n Denominador");
				op2=capturaNum();
				if(op2==0) throw new ArithmeticException(); {
					resd = op1/op2;
					System.out.println("Resultado= " + Double.toString(resd));
				}
			}
			catch(ArithmeticException ae) {
				System.out.println("Error aritmético " + ae.toString());
			}
			catch(NumberFormatException nfe) {
				System.out.println("Error de formato numérico " + nfe.toString());
			}
			catch (IOException ioe) { // Entrada y salida
				System.out.println("Error de entrada y salida " + ioe.toString());
			}
			catch (Exception e) {
				System.out.println(e.toString());
			}
		}
	}
}
