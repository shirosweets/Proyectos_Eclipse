
public class Main {
	/**
	 * Declaracion de la interfaz Constantes
	 */
	public interface Constantes {
	    double VALOR_MAXIMO = 10000000.0;
	    double VALOR_MINIMO = -0.01;
	}
	public interface Series {
	    int getSiguiente(); //Retorna el siguiente número de la serie
	    void reiniciar(); //Reinicia
	    void setComenzar(int x); //Establece un valor inicial
	}
}
