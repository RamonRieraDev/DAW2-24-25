package ejemplo02CocheRepaso;

import java.util.Scanner;

public class Coche {

	// Propiedades o atributos:
	String marca;
	String modelo;
	String matricula;
	
	// Constructor explícito que tome los 5 valores de los atributos:
	Coche(){
		
	}
	
	// Constructor implícito para que funcione métodos como el leeDatos() porque hemos
	// hecho otro explícito anteriormente:
	Coche(String marca, String modelo, String matricula){
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
	}
	
	// leeDatos() pregunta al usuario los valores de las propiedades y los lee
	// desde la terminal
	void leeDatos() {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("***** ALTA VEHÍCULO *****");
		System.out.println("Marca: ");
		marca = entrada.nextLine();
		
		System.out.println("Modelo:");
		modelo = entrada.nextLine();
		
		System.out.println("matricula:");
		matricula = entrada.nextLine();
	}
	
	// mostrar() muestra todas las propiedades del objeto
	String mostrar() {
		return "Marca: " + marca + "\nModelo: " + modelo + "\nMatrícula: " + matricula;
	}
}
