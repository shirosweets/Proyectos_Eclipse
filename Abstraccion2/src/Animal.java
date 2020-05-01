// Una clase abstracta es una clase que no se puede instanciar
// Se usa para definir subclases (definir todos los hijos)
// No tienen ninguna funcionalidad sus métodos
// Uso indiscriminado y fácil de polimorfismo
public abstract class Animal { 
	private String name;
	public void setname(String name) { // Settea el name
		this.name = name;
	}
	public String getname() { // Devuelve el name
		return this.name;
	}
	// Instanciamos/declaramos el método, se agrega campo en el hijo
	public abstract String tipoAnimal(); 
}
