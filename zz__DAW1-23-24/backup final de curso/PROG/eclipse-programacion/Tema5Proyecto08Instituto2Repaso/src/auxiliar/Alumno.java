package auxiliar;

import java.util.Scanner;

public class Alumno {

	private int numExpediente;
	private String apellidos;
	private String nombre;
	private Grupo grupo;
	
	public Alumno() {
		
	}
	
	public Alumno(int numExpediente, String apellidos, String nombre, Grupo grupo) {
		this.numExpediente = numExpediente;
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.grupo = grupo;
	}
	
	public String toString() {
		return "\nNúmero expediente: " + numExpediente + "\nApellidos: " + apellidos
				+ "\nNombre: " + nombre + "\nDatos del grupo: " + grupo.toString();
	}
	
	public void leeDatos() {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("--- DATOS DE ALUMNO ---");
		
		System.out.print("Introduce el número de expediente: ");
		numExpediente = entrada.nextInt();
		
		entrada.nextLine();
		
		System.out.print("Introduce el nombre: ");
		nombre = entrada.nextLine();
		
		System.out.print("Introduce los apellidos: ");
		apellidos = entrada.nextLine();
		
		grupo = new Grupo();
		grupo.leeDatos();
		
	}
	
	public int getNumExp() {
		return numExpediente;
	}
	
}
