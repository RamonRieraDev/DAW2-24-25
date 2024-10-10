package cadenasExtra;

import java.util.Scanner;

public class Ejercicio01 {
//	Escribe un programa que te pregunte una palabra y te diga si es capicúa o no. 
//	Recuerda que una palabra es capicua cuando se lee igual de izquierda a derecha 
//	que al revés.Usa un método llamado esCapicua() que reciba una cadena y 
//	devuelva true si es capicua o false si no.
	public static void main(String[] args) {

		String palabra = "";

		if (esCapicua(palabra)) {
			System.out.println("¡Es capicúa!");
		} else {
			System.out.println("No es capicua.");
		}
	}

	static boolean esCapicua(String palabra) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("*** Palabras capicúa (palíndromos) ***\n");
		System.out.println("Escribe una palabra y te diré si es capicúa: ");
		palabra = entrada.nextLine();

		String palabraAlReves = "";

		boolean capicua = false;

		for (int i = palabra.length() - 1; i >= 0; i--) {

			palabraAlReves = palabraAlReves + palabra.charAt(i);

		}

		if (palabraAlReves.equals(palabra)) {
			capicua = true;
			return true;
		} else {
			capicua = false;
			return false;
		}

	}

}
