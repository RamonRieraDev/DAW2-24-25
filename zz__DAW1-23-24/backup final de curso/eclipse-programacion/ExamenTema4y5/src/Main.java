import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Camion c1 = new Camion(5);

		Direccion d1 = new Direccion("Son Ferrer", "Calle Cóndor", "9", "Planta baja");

		Direccion d4 = new Direccion("Palma", "Calle Cervantes", "3", "4º C");
		Direccion d5 = new Direccion("Son Ferrer", "Calle Cóndor", "9", "Planta baja");

		// System.out.println(d1.toString());

		Paquete p1 = new Paquete(101, "Carlos Sogorb", d1);
		Paquete p2 = new Paquete(102, "Pablo López", d1);
		Paquete p3 = new Paquete(103, "David López", d1);
		Paquete p4 = new Paquete(104, "Eva Sánchez", d4);
		Paquete p5 = new Paquete(105, "Susana Martínez", d5);

		System.out.println(p1.toString());
//		System.out.println(p2.toString());
//		System.out.println(p3.toString());
//		System.out.println(p4.toString());
//		System.out.println(p5.toString());

		c1.addPaquete(p1);
		c1.addPaquete(p2);
		c1.addPaquete(p3);
		c1.addPaquete(p4);
		c1.addPaquete(p5);

		c1.showPaquetes();

		System.out.println("\nEl paquete 101 está en la posición " + c1.searchPaquete(101) + ".");

		c1.delPaquete(103);
		c1.delPaquete(20);
		c1.delPaquete(103);
		// c1.showPaquetes();

		System.out.println("\nEl paquete 101 está en la posición " + c1.searchPaquete(101) + ".");
		System.out.println("\nEl paquete 102 está en la posición " + c1.searchPaquete(102) + ".");
		System.out.println("\nEl paquete 104 está en la posición " + c1.searchPaquete(104) + ".");
		System.out.println("\nEl paquete 105 está en la posición " + c1.searchPaquete(105) + ".");

		//c1.showPaquetes("Palma");
		
		c1.showPaquetes("Son Ferrer");
		
		

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ciudad?");
		
		c1.showPaquetes(entrada.nextLine());
		
	}

}
