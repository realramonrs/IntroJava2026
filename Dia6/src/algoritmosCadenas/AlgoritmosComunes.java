package algoritmosCadenas;

public class AlgoritmosComunes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cadena = "En un lugar de la Mancha";

		//Validar que un String empieza por letra
		if(Character.isLetter(cadena.charAt(0))) {
			System.out.println("Empieza por letra");
		}
		else {
			System.out.println("No empieza por letra");
		}
		
		//Comprobar si empieza por "A"
		if(cadena.charAt(0)=='A') {
			
		}
		
		if(cadena.startsWith("A")) {
			
		}
		
		//Validar que un String contiene al menos una mayuscula
		//Método largo
		boolean hayMayuscula = false;
		for(int i = 0;i<cadena.length();i++) {
			if(Character.isUpperCase(cadena.charAt(i))) {
				hayMayuscula = true;
				break;
			}
		}
		//Método Corto
		if(!cadena.equals(cadena.toLowerCase())) {
			hayMayuscula = true;
		}
		
		//Contar cuantas veces aparece el caracter 'z' en un string
		int contadorZetas = 0;
		
		for(int i = 0;i<cadena.length();i++) {
			if(cadena.charAt(i) == 'z') {
				contadorZetas++;
			}
		}
		
		//Obtener el número de palabras de un String
		
		int numeroPalabras = cadena.split(" ").length;
				
		//Obtener número de palabras que contienen un dígito
		
		
		
	}

}
