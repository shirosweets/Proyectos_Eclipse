// extends Exception para que la clase NotaMal herede de Exception
public class NotaMal extends Exception{
	public NotaMal() {
		super("Excepcion definida por el usuario, nota incorrecta");
	}
}
