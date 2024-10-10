package practica01;

import java.util.Scanner;

public class Actividad01 {
//  Crea una aplicación que permita al usuario analizar su consumo diario de electricidad.
//	En primer lugar, le pedirá los consumos de los últimos seis días, en Kilovatios hora.
//	Después, mostrará los consumos ordenados de menor a mayor y mostrará la mediana
//	de los valores.
//	Observa que se te pide la mediana, no la media. La mediana se calcula ordenando los valores de
//	menor a mayor y haciendo la media de los dos valores que quedan en medio. Así, en el siguiente
//	ejemplo, la mediana se calcula haciendo la media de 3,5 y 4, y da 3,75. Haz el cálculo usando la
//	propiedad length del array.

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double[] kwh = new double[6];

		int posMin;
		double aux;
		double mediana = 0;

		System.out.println("#### GASTO EN ELECTRICIDAD #### \n");
		System.out.println("Escribe lo que has consumido en electricidad (KWh) en los últimos 6 días: ");
		for (int i = 0; i < kwh.length; i++) {

			System.out.println("Día " + (i + 1));
			kwh[i] = entrada.nextDouble();
		}

		for (int i = 0; i < kwh.length - 1; i++) {

			posMin = i;

			for (int j = i + 1; j < kwh.length; j++) {
				if (kwh[j] < kwh[posMin]) {
					posMin = j;
				}
			}

			aux = kwh[i];
			kwh[i] = kwh[posMin];
			kwh[posMin] = aux;
		}

		System.out.println("Consumos ordenados de menor a mayor: ");
		for (int i = 0; i < kwh.length; i++) {

			System.out.print(kwh[i] + " ");
		}

		System.out.println("\n");

		for (int i = (kwh.length / 2) - 1; i < (kwh.length / 2); i++) {

			mediana = (kwh[i] + kwh[i + 1]) / 2;
			System.out.println(mediana);
		}

	}

}
