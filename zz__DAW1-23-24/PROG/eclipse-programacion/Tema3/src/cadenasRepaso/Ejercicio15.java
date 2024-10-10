package cadenasRepaso;

public class Ejercicio15 {
// Leer una frase y mostrarla al revés (por palabras).

	public static void main(String[] args) {

		String frase = "A quien madruga Dios le ayuda.";
		
		String[] palabras = frase.split(" ");
		
		String fraseAlReves = "";
		
		for (int i = palabras.length - 1; i >= 0; i--) {
			System.out.println(palabras[i]);
		}

	}

}
