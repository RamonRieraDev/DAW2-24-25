package ejemplo02Vehiculo;

public class Vehiculo {

	// VARIABLES:
	private String matricula;
	private int capacidad;
	private double peso;
	private String marca;
	private String modelo;
	private int potencia;
	
	// CONSTRUCTORES:
	public Vehiculo(String matricula, int capacidad, double peso, String marca, String modelo, int potencia) {
		
		this.matricula = matricula;
		this.capacidad = capacidad;
		this.peso = peso;
		this.marca = marca;
		this.modelo = modelo;
		this.potencia = potencia;
	}

	// MÉTODOS:
	//@Override
	public String toString() {
		
		return "Matrícula: " + matricula + "\nMarca: " + marca + "\nModelo: " + modelo;
	
	}
	
	
}
