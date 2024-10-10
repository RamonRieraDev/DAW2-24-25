package ejemplo10CocheRepaso;

import java.util.Scanner;

public class Coche {

	// Propiedades o atributos:
	private String matricula;
	private String marca;
	private String modelo;
	private String averia;
	private int quilometros;

	// Constructor explícito que tome los 5 valores de los atributos:
	public Coche(String matricula, String marca, String modelo, String averia, int quilometros) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.averia = averia;
		this.quilometros = quilometros;
	}

	public Coche(String matricula, String marca, String modelo) {
//			this.matricula = matricula;
//			this.marca = marca;
//			this.modelo = modelo;
		//
		this(matricula, marca, modelo, null, 0);
	}

	// Constructor implícito para que funcione métodos como el leeDatos() porque
	// hemos
	// hecho otro explícito anteriormente:
	public Coche() {

	}

	// leeDatos() pregunta al usuario los valores de las propiedades y los lee
	// desde la terminal
	public void leeDatos() {

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
	public void mostrar() {

		System.out.println("\nMatrícula: " + matricula + ".");
		System.out.println("Marca: " + marca + ".");
		System.out.println("Modelo: " + modelo + ".");
		System.out.println("Avería: " + averia + ".");
		System.out.println("Quilómetros: " + quilometros + ".\n");

	}
	
	// MÉTODOS DE ENTRADA (GETTERS Y SETTERS):
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
}
