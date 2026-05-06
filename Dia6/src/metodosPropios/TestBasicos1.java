package metodosPropios;

public class TestBasicos1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Prueba calcularMedia
		int x1 = 5,x2 = 9, x3 = 3;
		double media = Basicos1.calcularMedia(x1, x2, x3);
		
		double media2 = Basicos1.calcularMedia(3, 6, 2);
		
		//Prueba método getMayor:
		int a1 = 5, a2 = 9;
		int mayor = Basicos1.getMayor(a1, a2);
		
	}

}
