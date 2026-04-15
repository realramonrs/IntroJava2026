package lecturaTeclado;

import java.io.IO;

public class LecturaIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IO.println("Bienvenidos a Java 23!");
		//Leer un String
		String nombre = IO.readln("Introduce tu nombre: ");
		
		//Leer un entero
		int edad = Integer.parseInt(IO.readln("Introduce tu edad "));
		
		IO.println("Hola " + nombre + " tienes " + edad + " años.");
	}

}
