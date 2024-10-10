package actividadRecursividad;

public class Actividad14 {
	public static void main(String[] args) {

		String frase = "sabba abbas";
		int inicio = 0;
		
		frase = quitarEspacios(frase);
		
		int fin = frase.length() - 1;

		if (esPalindromo(frase, inicio, fin)) {
			System.out.println("La frase \"" + frase + "\" es palíndromo " + " ");
		} else {
			System.out.println("La frase \"" + frase + "\" no es palíndromo " + " ");
		}

	}

	private static String quitarEspacios(String frase) {

		String fraseSinEspacios = frase.replaceAll(" ", "");
		
		System.out.println(fraseSinEspacios);

		return fraseSinEspacios;

	}

	private static boolean esPalindromo(String frase, int inicio, int fin) {

		// Caso base:
		if (inicio > fin) {
			return true;
		}

		if (frase.charAt(inicio) != frase.charAt(fin)) {
			return false;
		}

		// Caso recursivo
		return esPalindromo(frase, inicio + 1, fin - 1);
	}
}
