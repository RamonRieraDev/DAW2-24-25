
import java.util.Scanner;

public class Ejemplo02 {

	static Scanner entrada = new Scanner(System.in);
	static float precios[] = new float[5];

	public static void main(String[] args) {

		leerPrecios();

		ordenarPrecios();

		mostrarPrecios();

	}

	static void leerPrecios() {

		for (int i = 0; i < precios.length; i++) {
			System.out.print("Precio " + (i + 1) + ": ");
			precios[i] = entrada.nextFloat();
		}

	}

	static void ordenarPrecios() {

		int posMin = 0;
		float aux = 0;

		for (int i = 0; i < precios.length - 1; i++) {

			posMin = i;
			for (int j = i + 1; j < precios.length; j++) {

				if (precios[posMin] > precios[j]) {
					posMin = j;
				}
			}
			aux = precios[posMin];
			precios[posMin] = precios[i];
			precios[i] = aux;
		}
	}

	static void mostrarPrecios() {
		
		System.out.println();

		for (int i = 0; i < precios.length; i++) {
			System.out.print("//" + precios[i] + " ");

		}

	}

}