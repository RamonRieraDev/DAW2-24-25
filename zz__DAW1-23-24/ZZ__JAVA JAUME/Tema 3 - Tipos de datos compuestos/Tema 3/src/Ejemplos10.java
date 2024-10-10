import java.util.Iterator;

public class Ejemplos10 {

	public static void main(String[] args) {

		String nombres[] = { "Cano, Alejandro", "Grau, Stewart", "Isern, Miquel", "Buendía, Fernando", "Vázquez, Elier",
				"García, Jose Luís" };

		int posMin;
		String aux;

		for (int i = 0; i < nombres.length - 1; i++) {

			posMin = i;

			for (int j = i + 1; j < nombres.length; j++) {
				if (nombres[j].compareTo(nombres[posMin]) < 0) {
					posMin = j;
				}
			}

			aux = nombres[i];
			nombres[i] = nombres[posMin];
			nombres[posMin] = aux;

		}

		for (int i = 0; i < nombres.length; i++) {
			System.out.println(nombres[i]);

		}

	}

}
