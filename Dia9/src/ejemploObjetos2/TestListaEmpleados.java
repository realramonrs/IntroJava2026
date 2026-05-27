package ejemploObjetos2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;

public class TestListaEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado e1 = new Empleado("11111111W","Ana Matías",LocalDate.of(2020, 2, 15),2300);
		Empleado e2 = new Empleado("22222222Q","Marcos Pérez",LocalDate.of(2024, 2, 15),1850);
		Empleado e3 = new Empleado("33333333Z","Saúl Sánchez",LocalDate.of(2019, 2, 15),2700);
		Empleado e4 = new Empleado("44444444A","Roberto González",LocalDate.of(2020, 5, 4),2600);
	
		ArrayList<Empleado> plantilla = new ArrayList<Empleado>();
		//LinkedList<Empleado> plantillaMovida = new LinkedList<Empleado>();
	
		//Añadir empleados
		plantilla.add(e1);
		plantilla.add(e2);
		plantilla.add(e3);
		plantilla.add(e4);
		
		//Poner de baja al empleado e4
		plantilla.get(3).tramitarBaja();
		
		//Ver todos los empleados que estén de baja en mi plantilla
		
		for(Empleado e : plantilla) {
			if(e.isBaja()) {
				System.out.println(e);
			}
		}
		
		
	}

}
