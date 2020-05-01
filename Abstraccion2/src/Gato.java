
public class Gato extends Animal{ // Animal es abstracto
	public Gato (String name) {
		super.setname(name); // Porque hereda de Animal
	}
	// Hay que definir todos los métodos que nos hereda el padre que sean de tipo abstracto
	public String tipoAnimal() {
		// super.getname() porque su papá es abstracto y privado
		return " El animal es un gato y se llama " + super.getname(); 
	}
}
