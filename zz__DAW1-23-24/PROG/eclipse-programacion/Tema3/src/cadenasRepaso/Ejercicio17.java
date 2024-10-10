package cadenasRepaso;

public class Ejercicio17 {
// Programa que lee una frase desde el teclado y la muestra quitando la última palabra.
	public static void main(String[] args) {

		String frase = "A quien madruga Dios le ayuda.";

		String[] palabras = frase.split(" ");

		String fraseAlReves = "";

		for (int i = 0; i < palabras.length - 1; i++) {
			System.out.print(palabras[i] + " ");
		}

	}

}
