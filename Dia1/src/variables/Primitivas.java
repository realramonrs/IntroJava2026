package variables;

public class Primitivas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Mensaje por Consola
		System.out.println("Java es increible");
		
		//Tipos de variables:
		//Numéricas enteras : byte,short,int , long
		//Declaración de variables: Indicar tipo y nombre
		byte edad;
		int puntos,sancion=0;
		//Inicialización de variables:
		edad = 30;
		puntos = 2900;
		//Mostrar por consola el valor de una variable:
		System.out.println("Tu edad es de " + edad);
		System.out.println("Tienes una sanción de " + sancion + " puntos");
		
		//Numéricas con decimales
		float salario=1200.5f;
		double velocidad = 250.78;
		double velocidad2 = 250.78;
		//Aumentar el salario en 100€
		salario = salario + 100;
		//Disminuir la velocidad un 10%
		velocidad = velocidad - (10/100)*velocidad;
		velocidad2 = velocidad2 - 0.1*velocidad;
		
		System.out.println("Velocidad: " + velocidad);
		System.out.println("Velocidad2 " + velocidad2);
		
		//Variables booleanas
		boolean condicion = true;
		boolean condicion2 = false;
		
		//Variable para caracteres:
		char caracter = 'e';
		
		
		
		
		
		
		
	}

}
