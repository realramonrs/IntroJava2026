package metodosPropios;

public class Basicos1 {

	// Método que calcula la media de 3 números
	public static double calcularMedia(int n1,int n2,int n3) {
		double media = (n1 + n2 + n3) / 3;
		
		return media;
	
	}
	
	//Método que devuelve el número mayor de dos que recibe como parámetro
	
	public static int getMayor(int n1,int n2) {
		if(n1>=n2) {
			return n1;
		}
		return n2;
	}
	
	//Método que devuelve la suma de los valores de un array
	public static int getSumaArray(int[] x) {
		
	}
	
	//Método que devuelve true si un número es par y false si es impar
	
	
	//Método que devuelve la primera letra vocal de un String que recibe como parámetro
}
