package auxiliar;

import java.util.Scanner;

public class Grupo {

	// VARIABLES:
	private int id;
	private String nivel;
	private int curso;
	private String clase;

	// CONSTRUCTORES:
	public Grupo() {

	}

	public Grupo(int id, String nivel, int curso, String clase) {
		this.id = id;
		this.nivel = nivel;
		this.curso = curso;
		this.clase = clase;
	}

	// MÉTODOS:

	public String toString() {
		return "\n\n***** DATOS GRUPO *****\nID: " + id + " NIVEL: " + nivel + ", CURSO: " + curso + ", CLASE: " + clase;
	}

	public void leeDatos() {
		Scanner entrada = new Scanner(System.in);

		System.out.println("\n***** ALTA DE GRUPO *****");
		
		System.out.println("ID: ");
		id = entrada.nextInt();

		entrada.nextLine();
		
		System.out.println("NIVEL: ");
		nivel = entrada.nextLine();

		System.out.println("CURSO: ");
		curso = entrada.nextInt();
		
		entrada.nextLine();
		
		System.out.println("CLASE: ");
		clase = entrada.nextLine();

	}
}
