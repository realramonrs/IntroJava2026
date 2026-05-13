package metodosVoid;

public class TestMetodosVoid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Método escribir
		Ejemplos.escribir();
		Ejemplos.escribir("Esto es la bomba!");
		
		//Método positivoArray
		int[] array = {9,5,-2,-7};
		Ejemplos.positivoArray(array);
		Ejemplos.mostrarArray(array);
		
		//Método positivoNumero
		int n = 5;
		n = Ejemplos.positivoNumero(n);
		System.out.println();
		System.out.println("n = " + n);
		
	}

}
