package hoja02Repaso;

public class Ejercicio05 {
// Escribe un programa que guarde las siguientes temperaturas en un array y busque su máximo y
// mínimo. Además deberá indicar en qué posición del array están ese máximo y mínimo.

	public static void main(String[] args) {

		double[] temperaturas = { 15, 16, 16, 15.4, 15, 14, 10.2, 11, 11.5, 10, 10.1, 9.8, 9, 6 };

		int min = 0;
		int max = 0;

		for (int i = 0; i < temperaturas.length; i++) {
			if (temperaturas[i] < temperaturas[min]) {
				min = i;
			}
		}
		
		for (int i = 0; i < temperaturas.length; i++) {
			if (temperaturas[i] > temperaturas[max]) {
				max = i;
			}
		}

		System.out.println("La temperatura mínima es " + temperaturas[min] + "ºC.");
		System.out.println("La posición del array de la temperatura mínima es " + min + ".");
		
		System.out.println("La temperatura máxima es " + temperaturas[max] + "ºC.");
		System.out.println("La posición del array de la temperatura mínima es " + max + ".");

	}

}
