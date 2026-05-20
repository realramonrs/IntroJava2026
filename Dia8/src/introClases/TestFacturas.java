package introClases;

public class TestFacturas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaración de variables de tipo factura
		Factura f1; 
		Factura f2,f3;
		
		//Creación (instanciación) de objetos de tipo factura
		f1 = new Factura();
		f2 = new Factura();
		f3 = new Factura();
		
		//Acceso lectura a los atributos(datos) de una factura
		System.out.println("Id: " + f1.getId());
		System.out.println("Importe: " + f1.importe);
		System.out.println("Concepto: " + f1.concepto);
		System.out.println("Pagada: " + f1.pagada);
		
		System.out.println("Factura: " + f1);
		
		//Acceso escritura datos de una factura:
		
		f1.setId("A3");
		f1.importe = 590;
		f1.concepto = "Ordenador HP i7";
		f1.pagada = true;
		
		//Mostrar factura por consola:
		f1.imprimirFactura();
		f2.imprimirFactura();
		f3.imprimirFactura();
	}

}
