
public class EjemploAbstract2 {
	public static void main (String[] args) {
		Animal [] misAnimales = new Animal [2];
		misAnimales [0] = new Perro("Firulais");
		misAnimales [1] = new Gato("Murcielagito");
		for(Animal e: misAnimales) { // for Extendido
			System.out.println(e.tipoAnimal());
		}
	}
}
