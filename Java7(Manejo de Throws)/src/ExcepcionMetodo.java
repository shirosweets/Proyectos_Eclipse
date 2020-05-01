import java.util.Scanner;

public class ExcepcionMetodo {
	public static void main (String[] args) {
		Scanner tec = new Scanner(System.in);
		String str1, str2, respuesta;
		System.out.println("Ingrese el numerador");
		str1 = tec.next();
		System.out.println("Ingrese el denominador");
		str2 = tec.next();
		//str1= "120";
		//str2= "3";
		int num, denom, cociente;
		try {
			num= Integer.parseInt(str1);
			denom= Integer.parseInt(str2);
			rango(num, denom); // Llama al método rango
			cociente= num/denom;
			respuesta=String.valueOf(cociente);
		}
		catch (NumberFormatException ex) {
			respuesta= "Se han introducidos carácteres no numéricos";
		}
		catch (ArithmeticException ex) {
			respuesta= "La división entre 0";
		}
		catch(ExcepcionIntervalo ex){
            respuesta=ex.getMessage();
        }
		System.out.println(respuesta);
		}
		static void rango (int nume, int denome) throws ExcepcionIntervalo {
			if ((nume>100) || (denome<-5)) {
				throw new ExcepcionIntervalo("Números fuera de rango");
		}
	
	}
}
