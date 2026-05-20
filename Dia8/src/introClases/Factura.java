package introClases;

public class Factura {

	//Atributos (datos - estado - propiedades)
	 private String id;
	 String concepto;
	 float importe;
	 boolean pagada;
	 
	 //Métodos de acceso al id
	 
	 public void setId(String identificador) {
		 //El id tiene que estar compuesto por una letra y un dígito
		 if(identificador.length()==2) {
			 if(Character.isLetter(identificador.charAt(0)) && 
					 Character.isDigit(identificador.charAt(1))){
				 	id = identificador;
			 }
		 }
	 }
	 
	 public String getId() {
		 return id;
	 }
	 
	 //Métodos
	 public void imprimirFactura() {
		 System.out.println("***********************");
		 System.out.println("Datos factura: ");
		 System.out.println("Id: " + id);
		 System.out.println("Concepto: " + concepto);
		 System.out.println("Importe: " + importe);
		 if(pagada) {
			 System.out.println("Estado: Pagada");
		 }
		 else {
			 System.out.println("Estado: Pendiente");
		 }
		 System.out.println("***********************");
	 }
	 
	 public void pagarFactura() {
		 if(!pagada) {
			 pagada = true;
		 }
		 
	 }
	 
	 
	 
	 
	 
	 
}
