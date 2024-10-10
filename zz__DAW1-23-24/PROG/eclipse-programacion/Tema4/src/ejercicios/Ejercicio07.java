package ejercicios;

import java.util.Scanner;

public class Ejercicio07 {
// Escribe un método llamado celsius() que tome como argumento una temperatura en grados
// Fahrenheit y devuelva la temperatura en grados centígrados.

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce la temperatura en grados fahrenheit:");
		double temperatura = entrada.nextDouble();

		System.out.println(temperatura + " grados fahrenheit es " + celsius(temperatura) + " grados celsius.");
	}

	static double celsius(double temperatura) {

		return (temperatura - 32) * 5 / 9;

	}

}
