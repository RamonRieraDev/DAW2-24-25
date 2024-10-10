package cadenasRepaso;

public class Ejercicio12 {
// Programa que lee una frase y crea un array donde cada posición contiene una palabra.
	public static void main(String[] args) {

		String frase = "A quien madruga Dios le ayuda.";

		String[] fraseArray = { "" };
		int inicio = 0;
		int fin = frase.indexOf(" ");

		for (int i = 0; i < fraseArray.length; i++) {
			while (fin != -1) {
				fraseArray[i] = frase.substring(inicio, fin);
				System.out.println(fraseArray[i]);
				inicio = fin + 1;
				fin = frase.indexOf(" ", inicio);
			}
			System.out.println(frase.substring(inicio));
		}

	}

}
