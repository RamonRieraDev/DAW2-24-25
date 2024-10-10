package ejemplo10Coche;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		Coche coche1 = new Coche();
//
//		coche1.matricula = "9111KSL";
//		coche1.marca = "Ford";
//		coche1.modelo = "Courier";
//		coche1.averia = "Pinchazo rueda derecha delantera.";
//		coche1.quilometros = 52_434;
		// Para números largos int permite poner "_" para facilitar la visualización de
		// la cifra.

		// Otra manera:
//		Coche coche2 = new Coche();
//		coche2.leeDatos();
//		coche2.mostrar();

		// Otra manera usando el constructor:
		Coche coche1 = new Coche("5555TRB", "PORSCHE", "Cayenne", "Volante roto", 345000);
		coche1.mostrar();

		Coche coche2 = new Coche("1235GBB", "FERRARI", "Testarossa");
		coche2.mostrar();

		coche2.setAveria("No gira el volante");
		coche2.setQuilometros(10000);

		coche2.mostrar();

		// Hemos puesto en el setter una restricción de forma que solo se guarde un valor positivo.
		coche2.setQuilometros(-10000);

		// Vemos que coche2 sigue con 10000
		coche2.mostrar();
		
		

	}

}
