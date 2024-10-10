package auxiliar;

import java.util.Scanner;

public class Motor {

	// Atributos
	private int id;
	private String fabricante;
	private String modelo;
	
	public Motor() {
		
	}

	public Motor(int id, String fabricante, String modelo) {

		this.id = id;
		this.fabricante = fabricante;
		this.modelo = modelo;
	}
	
	public void leeMotor() {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce los datos necesarios del motor.");
		System.out.println("===============================");
		
		System.out.print("ID: ");
		id = entrada.nextInt();
		entrada.nextLine();

		System.out.print("Fabricante: ");
		fabricante = entrada.nextLine();

		System.out.print("Modelo: ");
		modelo = entrada.nextLine();
		
		
		System.out.println();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}
