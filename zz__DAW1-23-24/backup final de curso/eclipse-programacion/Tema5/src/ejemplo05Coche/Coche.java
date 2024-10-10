package ejemplo05Coche;

import java.util.Scanner;

public class Coche {

	// Propiedades o atributos.
	String matricula;
	String marca;
	String modelo;
	String averia;
	int quilometros;

	// Constructor explícito que tome los cinco valores de los atributos.
	Coche(String matricula, String marca, String modelo, String averia, int quilometros) {

		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.averia = averia;
		this.quilometros = quilometros;

	}

	// Constructor explícito que tome la matrícula, marca y modelo, y deje el resto
	// de valores sin modificar.
	Coche(String matricula, String marca, String modelo) {

		this(matricula, marca, modelo, null, 0);

	}

	// leeDatos() pregunta al usuario los valores de las propiedades y los lee desde
	// la terminal.
	void leeDatos() {

		Scanner entrada = new Scanner(System.in);

		System.out.println("INTRODUCCIÓN DE DATOS DEL COCHE");

		System.out.print("Matrícula: ");
		matricula = entrada.nextLine();

		System.out.print("Marca: ");
		marca = entrada.nextLine();

		System.out.print("Modelo: ");
		modelo = entrada.nextLine();

		System.out.print("Avería: ");
		averia = entrada.nextLine();

		System.out.print("Quilometraje: ");
		quilometros = entrada.nextInt();

	}

	// Muestra todas las propiedades del objeto.
	void mostrar() {

		System.out.println("\nDATOS DEL COCHE");
		System.out.println("Matrícula: " + matricula + ".");
		System.out.println("Marca: " + marca + ".");
		System.out.println("Modelo: " + modelo + ".");
		System.out.println("Avería: " + averia + ".");
		System.out.println("Quilometraje: " + quilometros + ".");

	}
}