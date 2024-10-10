package ejemplo02Coche;

import java.util.Scanner;

public class Coche {

	// Propiedades o atributos:
	String matricula;
	String marca;
	String modelo;
	String averia;
	int quilometros;

	// leeDatos() pregunta al usuario los valores de las propiedades y los lee
	// desde la terminal
	void leeDatos() {

		Scanner entrada = new Scanner(System.in);

		System.out.println("INTRODUCCIÓN DE DATOS DEL COCHE: ");
		System.out.print("Introduce la matrícula: ");
		matricula = entrada.nextLine();

		System.out.print("Introduce la marca: ");
		marca = entrada.nextLine();

		System.out.print("Introduce el modelo: ");
		modelo = entrada.nextLine();

		System.out.print("Introduce la averia: ");
		averia = entrada.nextLine();

		System.out.print("Introduce los quilometros: ");
		quilometros = entrada.nextInt();

	}

	// mostrar() muestra todas las propiedades del objeto
 	void mostrar() {
		
 		System.out.println("\nLa matrícula es " + matricula + ".");
 		System.out.println("La marca es " + marca + ".");
 		System.out.println("El modelo es " + modelo + ".");
 		System.out.println("La avería es " + averia + ".");
 		System.out.println("Los quilómetros son " + quilometros + ".");
 		
	}
	
}
