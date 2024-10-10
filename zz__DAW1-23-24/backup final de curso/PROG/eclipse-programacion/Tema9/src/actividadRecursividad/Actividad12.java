package actividadRecursividad;

public class Actividad12 {
// Escribe una función boolean esPalindromo(char[] frase, int inicio, int fin) que tome un array de
// caracteres, junto a sus posiciones inicial y final, y devuelva true si es un palíndromo (se lee igual de
// derecha a izquierda) o false en caso contrario.

	public static void main(String[] args) {

		char[] frase = { 'a', 'b', 'b', 'a', 'r' };
		int inicio = 0;
		int fin = frase.length - 1;

		System.out.println(esPalindromo(frase, inicio, fin));

	}

	public static boolean esPalindromo(char[] frase, int inicio, int fin) {

		// Caso base:
		if (inicio > fin) {
			return true;
		}

		if (frase[inicio] != frase[fin]) {
			return false;
		}

		// Caso recursivo
		return esPalindromo(frase, inicio + 1, fin - 1);
	}
}
