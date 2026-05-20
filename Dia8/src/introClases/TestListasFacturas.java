package introClases;

import java.util.ArrayList;

public class TestListasFacturas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Factura f1 = new Factura();
		f1.setId("ER45");
		f1.concepto = "Lavado de Coche";
		f1.importe = 35;
		f1.pagada = false;
		
		Factura f2 = new Factura();
		f2.setId("WE34");
		f2.concepto = "Cambio pastilla de frenos";
		f2.importe = 150;
		f2.pagada = true;
		
		Factura f3 = new Factura();
		f3.setId("QW66");
		f3.concepto = "Cambio neumáticos delanteros";
		f3.importe = 350;
		f3.pagada = false;
		
		//Matriz dinámica de Facturas:
		ArrayList<Factura> facturas = new ArrayList<Factura>();
		//Añadir facturas a la lista:
		
		facturas.add(f1);
		facturas.add(f2);
		facturas.add(f3);
		
		//Mostrar facturas pendientes de pago
		
		for(int i = 0;i<facturas.size();i++) {
			if(facturas.get(i).pagada==false) {
				facturas.get(i).imprimirFactura();
			}
		}
		
		//Total Facturado
		float total = 0;
		for(int i = 0;i<facturas.size();i++) {
			
			total = total + facturas.get(i).importe;
		}
		
		//Total cobrado
		float totalCobrado = 0;
		for(int i = 0;i<facturas.size();i++) {
			if(facturas.get(i).pagada) {
			//	totalCobrado+= facturas.get(i).importe;
				totalCobrado= totalCobrado + facturas.get(i).importe;
			}
		}
		
		System.out.println("Total facturado: " + total);
		System.out.println("Total cobrado: " + totalCobrado);
				
	}

}
