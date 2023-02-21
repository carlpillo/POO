package primerPOO2;

import java.util.Scanner;


public class Controlador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Personas person = new Personas();
		person.edad = 18;
		person.nombres = "carlos alberto";
		person.estatura = 1.56;
		person.cumpliranios();
		person.saludar();
		System.out.println("cuando cumplas años tendras" + person.edad);
		System.out.println("cuanto has crecido :");
		double incremento = new Scanner(System.in).nextDouble();
//		incremento =Locale.(Locale.US);
		person.crecer(incremento);
		System.out.printf("tu estatura ahora es : %.2f",person.estatura);
	
	
	}

}
