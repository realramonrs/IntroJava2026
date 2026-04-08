package sentenciaIf;

public class IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Programa que aplica un % descuento en función del precio de la compra
		//Si la compra > 300€ se aplica un 15%
		//Si la compra > 250€ se aplica un 10%
		//Si la compra > 100€ se aplica un 5%
		
		float precioCompra = 277;
		float precioConDescuento = 0;
		
		if(precioCompra > 300) {
			precioConDescuento = precioCompra*0.85f;
		}
		else if(precioCompra > 250) {
			precioConDescuento = precioCompra*0.9f;
			}
		else if(precioCompra > 100) {
			precioConDescuento = precioCompra*0.95f;
		}
		else {
			precioConDescuento = precioCompra;
		}
		
		System.out.println("Precio con descuento: " + precioConDescuento);
		System.out.printf("Precio con descuento %.2f ", precioConDescuento);
		System.out.println();
		
		
		//Programa que evalúa a un estudiante a partir de la media de 3 notas
		//Si la media es < 5 -> Suspenso
		//Si la media está entre 5 y 8 Aprobado
		//Si la media está entre 8 y 10 Sobresaliente
		//Si la nota es < 0 o > 10 ->  "Error en la nota"
		
		int n1 , n2 , n3;
		double media;
		n1 = 4;
		n2 = 9;
		n3 = 5;
		
		media = (n1 + n2 + n3)/3f;
		
		if(media < 0 || media > 10) {
			System.out.println("Error en la nota");
		}
		else if(media < 5) {
			System.out.println("Suspenso");
		}
		else if ( media <8) {
			System.out.println("Aprobado");
		}
		else {
			System.out.println("Sobresaliente");
		}
		
		
		
		
		
	}

}
