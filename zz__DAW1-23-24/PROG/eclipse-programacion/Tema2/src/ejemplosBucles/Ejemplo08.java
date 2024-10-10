package ejemplosBucles;

import java.util.Scanner;

public class Ejemplo08 {

	public static void main(String[] args) {
		
		// Preguntamos al usuario cual es la festividad equivalente a 
		// Halloween en España. Mientras no acierte le repetimos la 
		// pregunta.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("¿Cuál es la festividad equivalente a "
				+ "Halloween?");
		
		String respuesta = entrada.nextLine();
		
		do {
			System.out.println("¿Cuál es la festividad equivalente a "
			+ "Halloween?");
			respuesta.equals("Todos los santos");
			
			respuesta = entrada.nextLine();
			System.out.println("Es incorrecto.");
			
			}while(!respuesta.equals("Todos los santos"));
		
		System.out.println("Es correcto.");

	}

}
