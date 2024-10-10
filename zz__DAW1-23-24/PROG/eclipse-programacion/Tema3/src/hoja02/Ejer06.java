package hoja02;

import java.util.Scanner;

public class Ejer06 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int[] voto = new int[6];
		int votoMin = 0;
		int votoMax = 0;
		
		for (int i = 0; i < voto.length; i++){
			
			System.out.print("Introduce el voto del partido " + (i + 1) + ": ");
			voto[i] = entrada.nextInt();
			
			if(voto[i] < voto[votoMin]) {
				votoMin = i;
			}
			if(voto[i] > voto[votoMax]) {
				votoMax = i;
			}
		}
		
		System.out.println("El número máximo de votos es de: " + voto[votoMax] + " del "
				+ "partido " + (votoMax + 1));
		
		System.out.println("El número mínimo de votos es de: " + voto[votoMin] + " del "
				+ "partido " + (votoMin + 1));
		
	}

}
