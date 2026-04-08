package lecturaTeclado;

import java.util.Scanner;

public class EjemploMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char opcion;
		
		do {
		System.out.println("Escoja una opción a,b o c");
		System.out.println("a) Calcular letra del DNI");
		System.out.println("b) Renovar DNI");
		System.out.println("c) Eliminar DNI");
		
		
		//Lectura por teclado
		
		Scanner lector = new Scanner(System.in);
		
		opcion = lector.next().charAt(0);
				
		switch(opcion) {
		case 'a':
			System.out.println("Opción escogida:a) Calcular letra DNI");
			break;
		case 'b':
			System.out.println("Opción escogida:b) Renovar DNI");
			break;
		case 'c':
			System.out.println("Opción escogida:c) Eliminar el DNI");
			break;
			default:
				System.out.println("Error en la opción escogida");
			break;
		}
		
		}while(opcion!='a' && opcion!='b' && opcion!='c');
		
		
		
	}

}
