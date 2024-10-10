package ejemplo02Coche;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Coche coche1 = new Coche();

		coche1.matricula = "9111KSL";
		coche1.marca = "Ford";
		coche1.modelo = "Courier";
		coche1.averia = "Pinchazo rueda derecha delantera.";
		coche1.quilometros = 52_434;
		// Para números largos int permite poner "_" para facilitar la visualización de
		// la cifra.

		Coche coche2 = new Coche();

		coche2.leeDatos();

		coche2.mostrar();
	}

}
