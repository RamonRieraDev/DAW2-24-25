package auxiliar;

import java.util.Scanner;

public class Lavadora {

	// Atributos
	private int id;
	private Motor motor;
	private String marca;
	private float precio;
	private static int iva = 21;
	
	public Lavadora() {
		
	}

	public Lavadora(int id, Motor motor, String marca, float precio) {

		this.id = id;
		this.motor = motor;
		this.marca = marca;
		this.precio = precio;
	}

	public void leeLavadora() {

		Scanner entrada = new Scanner(System.in);
		
		Motor motor01 = new Motor();
		motor01.leeMotor();

		System.out.println("Introduce los datos necesarios de la lavadora.");
		System.out.println("===============================");
		
		System.out.print("ID: ");
		id = entrada.nextInt();
		entrada.nextLine();
		
		motor = motor01;

		System.out.print("Marca: ");
		marca = entrada.nextLine();

		System.out.print("Precio: ");
		precio = entrada.nextFloat();
		

		System.out.println();
	}

	public String toString() {

		return "Código: " + id + ", Motor: " 
		+ motor.getFabricante() + ", Marca: " + marca + ", Precio: " + precio
				+ "€.";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getIva() {
		return iva;
	}

	public static void setIva(int iva) {
		iva = iva;
	}
}
