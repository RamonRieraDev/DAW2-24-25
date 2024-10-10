package ejercicios;

import java.util.Scanner;

public class Ejer11b {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String[] planetas = { "Mercurio", "Venus", "Tierra", 
				"Marte", "Júpiter", "Saturno", "Urano", 
				"Neptuno","Plutón" };
		System.out.println("Dame el nombre de algún planeta: ");
		String planeta = entrada.nextLine();
				
		int pos = buscar(planetas, planeta);
		if(pos != -1) {
			System.out.println("El planeta está en la "
					+ "posición " + pos);
		}else {
			System.out.println("La palabra no se encuentra "
					+ "en el array.");
		}
		
	}

	static int buscar(String planetas[], String planeta) {

		for (int i = 0; i < planetas.length; i++) {

			if (planetas[i].equals(planeta)) {
				return i;
			}

		}
		
		return -1;
		
	}

}