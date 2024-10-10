package ejercicios01;

/*
 * Programa que va obteniendo números desde el 2 hasta el 100
 */
public class Ejer14d {

	public static void main(String[] args) {

		boolean esPrimo = true;
		int numPrimos = 0; // Números de primos encontrados.
		int candidato = 2;

		System.out.println("Lista de números primos");
		System.out.println("=======================");

		// candidato es el número que vamos a comprobar si es primo.
		while (numPrimos < 100) {

			// Para cada número candidato a ser primo, empezamos
			// suponiendo que lo es.
			esPrimo = true;

			// Si candidato es primo, lo mostramos.
			for (int i = 2; i < candidato; i++) {

//					System.out.println(candidato + "/" + i + " da resto " 
//							+ candidato % i);

				if (candidato % i == 0) {
//						System.out.println("¡¡¡NO ES PRIMO!!!");
					esPrimo = false;
					break;
				}

			}

			if (esPrimo) {
				System.out.println(numPrimos + ") " + candidato);
				numPrimos++;
			}

			candidato++;
		}

	}

}
