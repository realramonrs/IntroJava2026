package operadores;

public class Matematicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Operadores Matemáticos -> + , - , * , / , %
		
		//Ejemplo Operadores + , - y *
		int n1 = 10, n2 = 13, resultado,resultadoResta;
		resultado = n1 + n2;
		resultadoResta = n1 - n2;
		System.out.println("Resultado n1 + n2 = " + resultado);
		System.out.println("Resultado n1 - n2 = " + resultado);
		
		// Ejemplo con variables tipo byte o short
		byte b1 = 10,b2 = 120, resultadoSuma;
		//Cast Explícito : El operador + devuelve un valor de tipo int
		resultadoSuma =  (byte) (b1 + b2); 
		System.out.println("Resultado Suma: " + resultadoSuma);
		
		//Ejemplo con float y double:
		double d1 = 9.5 , d2 = 4.7;
		float resultado2 = (float) (d1 + d2);
		
		//Ejercicio: Calcular el valor de la variable z , a partir de a , b y c
		//a y b son de tipo byte , c es de tipo double , y z es de tipo float
		byte a = 7, b = 4;
		double c = 5;
		float z = (float) (((float)a/b)*2 + 10*c);
		//z = (a/b)*2 + 10*c
		System.out.println("z = " + z);
		
		//Ejemplo % -> Resto división entera:
		int resto = 128 % 2;
		
		
		//Operadores Asignación -> += , -= , *= , /=
		int x = 10;
		//Sumarle 2 a x
		x = x + 2;
		x+=2;
		
		//Operadores de comparación -> <,<=,>,>= , == , !=
		//Devuelven un valor de tipo boolean
		
		boolean par = 24 % 2 == 0;
		int n3 = 10;
		boolean condicion1 = n3 > 0;
		boolean concidion2 = n1 != 0;
		
		//Operador incremento ++ y decremento --
		
		int c1 = 5;
		c1++;
		++c1;
		System.out.println("c1 = " + c1);
		int c2 = 5;
		int c3 = c2++;
		System.out.println("postincremento: ");
		System.out.println("c3 = " + c3);
		System.out.println("c2 = " + c2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
