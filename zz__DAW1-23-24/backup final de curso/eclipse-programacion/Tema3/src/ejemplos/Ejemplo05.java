package ejemplos;

import java.util.Scanner;

public class Ejemplo05 {

	public static void main(String[] args) {

		// Rellenar un array desde la terminal.
		
		Scanner entrada = new Scanner(System.in);
		
		String[] nombres = new String[4];
		
		System.out.println("Ve introduciendo nombres: ");
		
		// Vamos leyendo cada nombre y guardándolo en la posición i del array
		// nombres.
		for(int i = 0; i < nombres.length; i++) {
			
			System.out.println("Nombre: ");
			nombres[i] = entrada.nextLine();
			
		}
		
		// Mostramos la lista de nombres alamacenados en el array.
		System.out.println("Tus nombres: ");
		for(int i = 0; i < nombres.length; i++) {
			
			System.out.print(nombres[i] + ", ");
			
		}
		
	}

}
