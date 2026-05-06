package algoritmosCadenas;

public class ComparacionStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a1 = "Ejemplo";
		String a2 = new String("Ejemplo");
		String a3 = "Ejemplo";
	
		boolean iguales = a1 == a2;
		boolean iguales2 = a1.equals(a2);
		boolean iguales3 = a1 == a3;
		
		System.out.println(iguales);
		System.out.println(iguales2);
		System.out.println(iguales3);
		
		
		
	}

}
