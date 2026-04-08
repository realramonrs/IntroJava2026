package libreriaMath;

public class Ejemplos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Calcular raices cuadradas -> Math.sqrt(valor)
		int numero = 10;
		double raiz = Math.sqrt(numero);
		
		//Calcular potencias:
		int base = 8;
		double potencia = Math.pow(base, 5);
		
		//Calcular el menor de dos valores:
		int minimo = Math.min(3, 9);
		
		//Ejercicio : Resolver una ecuación de segundo grado e indicar cuál es la solución
		//más pequeña:
		//Coeficientes : a,b ,c
		//Soluciones x1 y x2
		//x1 = -b + Raiz(b2 -4ac) / 2a
		//x2 = -b - Raiz(b2 - 4ac) /2a
		
		int a = 1, b = 3, c = 1;
		double x1, x2;
		double radicando = b*b - 4*a*c;
		x1 = -b + (Math.sqrt(radicando))/(2*a);
		x2 = -b - (Math.sqrt(radicando))/(2*a);
		
		double solMinima = Math.min(x1, x2);
		
		System.out.println(solMinima);
		
		
		

	}

}
