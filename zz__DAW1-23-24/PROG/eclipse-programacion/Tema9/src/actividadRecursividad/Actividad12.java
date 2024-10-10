package actividadRecursividad;

public class Actividad12 {
// Escribe una función boolean esPalindromo(char[] frase, int inicio, int fin) que tome un array de
// caracteres, junto a sus posiciones inicial y final, y devuelva true si es un palíndromo (se lee igual de
// derecha a izquierda) o false en caso contrario.

	public static void main(String[] args) {

		char[] frase = { 'a', 'b', 'a' };

		int inicio = 0;
		int fin = frase.length - 1;

		System.out.println(esPalindromo(frase, inicio, fin));
	}

	private static boolean esPalindromo(char[] frase, int inicio, int fin) {

		if(inicio<=fin) {
			if(frase[inicio] == frase[fin]) {
				return esPalindromo(frase, inicio ++, fin --);
			} else {
				return false;
			}
		}
		
			return false;
		
		
	}
}
