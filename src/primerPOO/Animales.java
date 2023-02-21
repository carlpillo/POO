package primerPOO;

public class Animales {
	// atributos
	String nombres;
	int id;
	int edad;

	public void mostrarNombres() //comportamientos o metodos
		{
			System.out.println(nombres);
		}
	public void mostrarCaracteristicas(String nombre, int edad, int id) 
	{
		System.out.println("mi animal se llama :"+nombre+" tiene :"+ edad+" años y su id es :"+id);
	}
}
