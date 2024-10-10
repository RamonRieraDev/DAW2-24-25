package ejercicios01;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce el nombre: ");
		String nombre = entrada.nextLine();
		System.out.println("Introduce los apellidos: ");
		String apellidos = entrada.nextLine();
		System.out.println("Introduce el número de teléfono: ");
		String telefono = entrada.nextLine();

		try {
			FileWriter contactos = new FileWriter("ficheros/constactos.csv");
			

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
}
