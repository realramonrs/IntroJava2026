package ejemploObjetos2;

import java.time.LocalDate;

public class TestManuel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado e1 = new Empleado();		
		Empleado e2 = new Empleado("56783412W","Pedro Sánchez",LocalDate.now(),2500);
		
		
		System.out.println("Datos e2: ");
		System.out.println("Nombre: " + e2.getNombre() + " salario: " + e2.getSalario());
		
		System.out.println(e2);
	}

}
