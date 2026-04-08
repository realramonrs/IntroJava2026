package sentenciaIf;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Programa que determina si un número es par o imparç
		int valor = 9;
		
		if(valor % 2 == 0) {
			System.out.println(valor + " es un número par");
		}
		else {
			System.out.println(valor + " es un múmero impar");
		}
		
		//Programa que determina si un número es divisor de otro
		int n1 = 10;
		int n2 = 3;
		
		if(n1 % n2 == 0) {
			System.out.println(n2 + " es divisor de " + n1);
		}
		else {
			System.out.println(n2 + " no es divisor de " + n1);
		}
		
		
	}

}
