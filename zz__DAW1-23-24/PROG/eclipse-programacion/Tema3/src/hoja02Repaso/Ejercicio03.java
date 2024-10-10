package hoja02Repaso;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio03 {
// Escribe un programa que lea una lista de nombres (uno a uno, hasta un máximo de 10) por
// consola y los vaya guardando en un array llamado nombres. La aplicación terminará de pedir
// palabras cuando el usuario escriba "nadie"
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		String[] nombres = new String[10];
		
		boolean nombreEncontrado = false;
		
		for (int i = 0; i < nombres.length; i++) {
			
			System.out.print("Escribe el nombre: ");
			nombres[i] = entrada.nextLine();
			
			if(nombres[i].equals("nadie")) {
				break;
			} else if(nombres[i].equals("Calderón")) {
				nombreEncontrado = true;
			}
		}

		//System.out.println(Arrays.toString(nombres));
		
		if(nombreEncontrado) {
			System.out.println("de la Barca");
		} else {
			System.out.println("Nombre no encontrado");
		}
		
	}

}
