package algoritmosCadenas;

public class ClaseCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Clase Character
		char caracter = 'w';
		
		boolean esLetra = Character.isLetter(caracter);
		boolean esNumero = Character.isDigit(caracter);
		boolean esMayusc = Character.isUpperCase(caracter);
		boolean esMinusc = Character.isLowerCase(caracter);
		boolean espacio = Character.isWhitespace(caracter);
		
		char caracterMinusc = Character.toLowerCase(caracter);
		char caracterMayusc = Character.toUpperCase(caracter);
		
		
		
	}

}
