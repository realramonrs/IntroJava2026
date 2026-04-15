package lecturaTeclado; //PIC
import java.util.InputMismatchException;
import java.util.Scanner;

public class LecturaScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Lectura de un número entero
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduzca un número entero: ");
		int numero = lector.nextInt();
		System.out.println("Número : " + numero);
		//Lectura de un numero float , con captura de excepción en caso de error
		
		try {
			System.out.println("Introduzca ahora un número decimal: ");
			float numero2 = lector.nextFloat();
		
			}catch(InputMismatchException e) {
				System.out.println("Se ha producido un error en el formato de los datos");
			}
		// Lectura de un String
		System.out.println("Seguimos ejecutando... introduce tu nombre");
		String nombre = lector.next();
		System.out.println("Hola ! " + nombre + " , bienvenido");
		// Lectura de un char
		System.out.println("Introduce letra del dni");
		char letra = lector.next().charAt(0);
		System.out.println("Letra DNI: " + letra);
	}

}
