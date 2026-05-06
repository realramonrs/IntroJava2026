package algoritmosCadenas;

public class Modificacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Los strings son inmutables
		//Reemplaza caracter por otro
		String cadena = "Hala Celta";
		cadena = cadena.replace('a', 'o');
		
		System.out.println(cadena);
		
		//Añadir caracteres a un String
		cadena = cadena + " oe oe oe";
		String himno = cadena.concat(" na ledicia son celesta ");
		
		//Eliminar espacios al principio y al final
		cadena = cadena.trim();
		
		
		StringBuilder cadenaDinamica = new StringBuilder("Hala Celta");
		
		cadenaDinamica.append(" a demostrar , por historia ");
		cadenaDinamica.delete(5,10);
		
	}

}
