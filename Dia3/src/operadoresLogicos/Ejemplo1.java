package operadoresLogicos;

public class Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Operador Y --> && -> Devuelve true cuando A y B son true
		boolean c1 = true;
		boolean c2 = false;
		boolean resultado = c1 && c2; // Resultado será false
		
		//Operador OR --> || -> Devuelve true cuando una de las condiciones es true
		boolean resultado2 = c1 || c2; // Resultado2 será true
		
		// Operador NOT --> ! -> Devuelve lo contrario a la condición que evalúa
		
		boolean resultado3 = !c1; // Sería false
		boolean resultado4 = ! c2; // Sería true
	}

}
