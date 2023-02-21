package primerPOO;

public class Controlador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animales miAnimal = new Animales();
// instanciar la clase.. miAnimal como un objeto de la clase animal
		
		miAnimal.nombres = "misifu";
		miAnimal.id = 1;
		miAnimal.edad = 14;
		miAnimal.mostrarNombres();
		miAnimal.mostrarCaracteristicas(miAnimal.nombres, miAnimal.edad, miAnimal.id);
		miAnimal.nombres = "Guffi";
		miAnimal.mostrarNombres();
	}

}
