package auxiliar;

import java.util.Scanner;

public class Grupo {

	private int id;
	private String nivel;
	private int curso;
	private String clase;
	
	public Grupo() {
		
	}
	
	public Grupo(int id, String nivel, int curso, String clase) {
		this.id = id;
		this.nivel = nivel;
		this.curso = curso;
		this.clase = clase;
	}
	
	public String toString() {
		return "\nId: " + id + "\nNivel: " + nivel + "\nCurso: " + curso + "\nClase: " + clase;
	}
	
	public void leeDatos() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("--- DATOS DE GRUPO ---");
		
		System.out.print("Introduce el id: ");
		id = entrada.nextInt();
		
		entrada.nextLine();
		
		System.out.print("Introduce el nivel: ");
		nivel = entrada.nextLine();
		
		System.out.print("Introduce el curso: ");
		curso = entrada.nextInt();
		
		entrada.nextLine();
		
		System.out.print("Introduce la clase: ");
		clase = entrada.nextLine();
	}
	
}
