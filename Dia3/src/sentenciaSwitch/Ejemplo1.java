package sentenciaSwitch;

public class Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("a) Calcular letra del DNI");
		System.out.println("b) Renovar DNI");
		System.out.println("c) Eliminar DNI");
		
		char opcion = 'f';
		
		switch(opcion) {
		case 'a':
			System.out.println("Calcular letra DNI");
			break;
		case 'b':
			System.out.println("Renovar DNI");
			break;
		case 'c':
			System.out.println("Eliminar el DNI");
			break;
			default:
				System.out.println("Error en la opción escogida");
			break;
		}
		
		
		
	}

}
