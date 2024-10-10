package cadenasRepaso;

public class Ejercicio18 {
// Coger una cadena y poner la primera letra de cada palabra en mayúsculas.
	public static void main(String[] args) {

		String frase = "A quien madruga dios le ayuda.";

		String[] palabras = frase.split(" ");

		String mayuscula = "";
		String restoPalabra = "";

		for (int i = 0; i < palabras.length; i++) {

			int inicio = palabras[i].indexOf(" ");

			mayuscula = "" + palabras[i].charAt(0);
			restoPalabra = "" + palabras[i].substring(inicio + 2);

			System.out.print(mayuscula.toUpperCase() + restoPalabra + " ");
		}

	}

}
