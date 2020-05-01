
public class Main {
	public static int nume=10;
	public static Integer denom=0;
	public static float div;
	public static void main (String[] args) {
		System.out.println("Antes de hacer la división");
		try {
			div=nume/denom;
		}
		catch(ArithmeticException ex){
			div=0;
			System.out.println("Error: " + ex.getMessage());
		}
		finally {
			System.out.println("División: " + div);
			System.out.println("Después de hacer la división");
		}
	}
}
