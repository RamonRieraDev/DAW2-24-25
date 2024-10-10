package hoja02Repaso;

import java.util.Scanner;

public class Ejercicio06 {
//	Escribe una aplicación que vaya preguntando los votos de seis partidos políticos en unas
//	elecciones y guardándolos en un array. Al acabar, dirá cuál ha sido el menor número de votos y cuál
//	el mayor, así como las posiciones del array que ocupan estos partidos.
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int[] votos = new int[6];
		int min = 0;
		int max = 0;
		int posMin = 0;
		int posMax = 0;

		for (int i = 0; i < votos.length; i++) {
			System.out.print("Escribe el número de votos del partido número " + (i + 1) + ": ");
			votos[i] = entrada.nextInt();
		}

		int i;
		for (i = 0; i < votos.length; i++) {
			if (votos[i] < votos[min]) {
				min = i;
				posMin = i;
			}
		}

		int j;
		for (j = 0; j < votos.length; j++) {
			if (votos[j] > votos[max]) {
				max = j;
				posMax = j;
			}
		}

		System.out.println("El partido menos votado es el número " + (posMin + 1) + " con " + votos[min] + " votos.");
		System.out.println("El partido más votado es el número " + (posMax + 1) + " con " + votos[max] + " votos.");
		
	}

}
