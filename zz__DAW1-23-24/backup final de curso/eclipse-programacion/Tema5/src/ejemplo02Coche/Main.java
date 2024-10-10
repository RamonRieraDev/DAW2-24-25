package ejemplo02Coche;

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
		Coche coche3 = new Coche("5555TRB", "PORSCHE", "Cayenne", "Volante roto", 345000);
		coche3.mostrar();
		
		Coche coche4 = new Coche("1235GBB", "FERRARI", "Testarossa");
		coche4.mostrar();
		
	}

}
