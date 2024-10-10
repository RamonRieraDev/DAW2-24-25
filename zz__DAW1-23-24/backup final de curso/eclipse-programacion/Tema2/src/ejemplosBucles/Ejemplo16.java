package ejemplosBucles;

import java.util.Scanner;

public class Ejemplo16 {

	public static void main(String[] args) {

		// Bucle infinito que pregunte nombres sin parar.
		
		Scanner entrada = new Scanner(System.in);
		
		String nombre;
		
		// Cuando queramos escribir un bucle infinito usaremos true en el while
		while(true) {
			System.out.println("Escribe un nombre:");
			nombre = entrada.nextLine();
			
			if(nombre.equals("stop")){
				break;
			}
		}
	}

}
