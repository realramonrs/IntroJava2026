package bucles;

public class BucleWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. Mostrar n asteriscos por pantalla
		int n = 9;
		
		int i = 1;
		
		while(i<=n) {
		    System.out.print("* ");
		    i++;
		}
		
		//2. Calcula la suma de los números que hay entre n y m
		n = 9;
		int m = 15; // suma = 9 + 10 + 11 + 12 + 13 + 14 + 15
		int suma = 0;
		
		i = n;
		while(i<=m) {
			
			suma = suma + i;
			i++;
			
		}
		System.out.println("La suma es : " + suma);
		
		//3. Contar los divisores de un número
		int numero = 25;
		
		i = 2;
		int contador = 2;
		
		while(i<=numero/2) {
			if(numero % i ==0 ) {
				contador++;
			}
			i++;
		}
		
		System.out.println("Tiene " + contador + " divisores.");
		
	}

}
