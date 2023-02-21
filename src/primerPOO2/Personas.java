package primerPOO2;

public class Personas {

	String nombres;
	byte edad;
	double estatura;
	
	public void saludar() 
	{
		System.out.println("HOLA mi nombre es :" + nombres);
		System.out.println("encantado de conocerte");
	}
	
	public void cumpliranios()
	{
		edad++; //incremento en 1
	}
	
	public void crecer(Double incremento) 
		{
		estatura += incremento;
		}
}
