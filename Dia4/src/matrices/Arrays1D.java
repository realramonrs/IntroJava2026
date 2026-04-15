package matrices;

import java.util.Random;

public class Arrays1D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int notas[] = new int[5];
		float temps[] = {4, 6.7f , 32 , 5.6f , 9 };
		//Los arrays no pueden modificar su capacidad , son inmutables.
		//La capacidad de un array utilizamos la propiedad length
		int capacidad = notas.length;
		int ultimoIndice = notas.length - 1;
		
		//Acceder a las posiciones del array
		notas[0] = 9;
		notas[1] = 6;
		notas[2] = 7;
		int ultimaNota = notas[notas.length - 1];
		
		
		//0. Llenar un array con valores aleatorios
		Random generador = new Random();
		int array[] = new int[30];
		for(int i = 0;i<array.length;i++) {
			array[i] = generador.nextInt(11);
		}
				
		//1. Mostrar todos los valores del array por consola.
		System.out.println("Valores generados aleatoriamente ");
		for(int i = 0;i<array.length;i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		//2. Calcular la nota media
		
		
		//3 Calular el número de suspensos
		
		
		
		//4. Calcular la nota más alta y en qué posición está
		
		
		
		//5. Ordenar los valores de menor a mayor
		
		
	}

}
