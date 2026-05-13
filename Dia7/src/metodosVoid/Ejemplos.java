package metodosVoid;

public class Ejemplos {

	//Método que muestra por Consola un mensaje
	
	public static void escribir() {
		System.out.println("Bienvenidos a mi mundo!");
	}
	
	public static void escribir(String mensaje) {
		System.out.println(mensaje);
	}
	
	//Método que recibe un array de enteros y lo muestra por pantalla , separando los valores con un guion -
	//Ejemplo: 3 - 6 - 2 - 13 - 0 - 5
	
	public static void mostrarArray(int x[]) {
		
		for(int i = 0;i<x.length;i++) {
			System.out.print(x[i] + " - ");
		}
	}
	
	//Método que recibe un array y cambia los valores negativos por positivos, es decir,
	// si en una posicion hay un -3 -> guarda un 3
	
	public static void positivoArray(int x[]) {
		
		for(int i = 0;i<x.length;i++) {
			if(x[i]<0) {
			//	x[i] = x[i]*(-1);
				x[i] = Math.abs(x[i]);
			}
		}
		
	}
	
	public static int positivoNumero(int x) {
		x = x*(-1);
		return x;
	}
	
	
	
	
}
