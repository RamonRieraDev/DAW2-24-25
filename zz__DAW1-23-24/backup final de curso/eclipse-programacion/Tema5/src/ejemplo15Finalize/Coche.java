package ejemplo15Finalize;

import java.util.Scanner;

public class Coche {

	// Propiedades o atributos:
	private String matricula;
	private String marca;
	private String modelo;
	private String averia;
	private int quilometros;
	static int numCochesEliminados;

	// Constructor explícito que tome los 5 valores de los atributos:
	public Coche(String matricula, String marca, String modelo, String averia, int quilometros) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.averia = averia;
		this.quilometros = quilometros;
	}

	public Coche(String matricula, String marca, String modelo) {
//		this.matricula = matricula;
//		this.marca = marca;
//		this.modelo = modelo;
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

	@Override
	protected void finalize() throws Throwable {

		System.out.println("ELIMINANDO OBJETO DE LA MEMORIA");

	}

	// MÉTODOS DE ACCESO (GETTERS Y SETTERS)

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String setModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAveria() {
		return averia;
	}

	public void setAveria(String averia) {
		this.averia = averia;
	}

	public int getquilometros() {
		return quilometros;
	}

	public void setQuilometros(int quilometros) {

		// Comprobamos que los quilómetros no sean número negativo.
		if (quilometros < 0) {
			return;
		}

		this.quilometros = quilometros;

	}

}
