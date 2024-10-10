package inicio;

import java.util.Scanner;

import biblioteca.Autor;
import biblioteca.Libro;

public class Inicio {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//Preguntar cuántos autores tiene el libro.
		System.out.println("=====BIBLIOTECA=====");
		System.out.print("¿Cuántos autores hay? ");
		int numAutores = entrada.nextInt();
		//Crear un array autores con ese número de posiciones
		Autor autores[] = new Autor[numAutores];
		
		//Pedir los datos de un autor, crear un objeto Autor con
		// eso datos, añadirlo al array y repetir las veces necesarias.
		System.out.println();
		for (int i = 0; i < autores.length; i++) {
			
			System.out.println("Escribe los datos del autor " + (i + 1) + ".");
			
			System.out.print("Nombre: ");
			String nombre = entrada.nextLine();
			
			System.out.print("E-mail: ");
			String email = entrada.nextLine();
			
			System.out.print("Año de nacimiento: ");
			int anyo = entrada.nextInt();
			
			Autor autor = new Autor(nombre, email, anyo);
			System.out.println();
			
			autores[i] = autor;		
		}

		for (int i = 0; i < autores.length; i++) {
			System.out.println(autores[i].toString() + "\n");
		}
		
		
		//Pedir el resto de datos del libro.
		
		//Crear un objeto Libro con todos los datos recogidos.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		System.out.println("Escribe los datos del autor.");
//		System.out.print("Nombre: ");
//		String nombre = entrada.nextLine();
//		
//		System.out.print("E-mail: ");
//		String email = entrada.nextLine();
//		
//		System.out.print("Año de nacimiento: ");
//		int anyo = entrada.nextInt();
//		
//		Autor a3 = new Autor(nombre, email, anyo);
//		
//		entrada.nextLine();
//		
//		System.out.println("\n======================");
//		System.out.println("Escribe los datos del libro.");
//		
//		System.out.print("Título: ");
//		String titulo = entrada.nextLine();
//		
//		System.out.print("ISBN: ");
//		String isbn = entrada.nextLine();
//		
//		System.out.print("Año actual: ");
//		int anyoActual = entrada.nextInt();
//		
//		Libro l3 = new Libro(titulo, isbn, a3);
//		Libro.setAnyoActual(anyoActual);
//		
//		System.out.println("\n" + l3.toString());
		
	}
}
