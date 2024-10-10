package auxiliar;

import java.util.Scanner;

public class Alumno {
	
	// VARIABLES:
	private int numExpediente;
	private String apellidos;
	private String nombre;
	private Grupo grupo;
	
	// CONSTRUCTORES:
	public Alumno() {
		
	}
	
	public Alumno( int numExpediente, String apellidos,String nombre, Grupo grupo) {
		
		this.numExpediente = numExpediente;
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.grupo = grupo;
		
	}
	
	// MÉTODOS:
	public String toString() {
		return "\n***** DATOS ALUMNO *****\nNÚMERO DE EXPEDIENTE: " + numExpediente + "\nNOMBRE: " + nombre 
				+ "\nAPELLIDOS: " + apellidos + "\nGRUPO:" + grupo.toString();
	}
	
	public void leeDatos() {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\n***** ALTA DE ALUMNO *****");
		
		System.out.println("NÚMERO DE EXPEDIENTE: ");
		numExpediente = entrada.nextInt();
		
		entrada.nextLine();
		
		System.out.println("NOMBRE: ");
		nombre = entrada.nextLine();
		
		System.out.println("APELLIDOS: ");
		apellidos = entrada.nextLine();
		
		grupo = new Grupo();
		grupo.leeDatos();
		
	}
	
	public int getNumExpediente() {
		return numExpediente;
	}
	
	
	
}
