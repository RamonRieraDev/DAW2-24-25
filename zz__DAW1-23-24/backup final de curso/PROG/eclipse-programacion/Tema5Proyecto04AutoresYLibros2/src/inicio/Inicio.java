package inicio;

import java.util.Scanner;

// esto:
import biblioteca.*;
// o esto:
//import biblioteca.Autor;
//import biblioteca.Libro;

public class Inicio {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// leemos los datos de los autores del libro
		Autor autor1 = leerAutor();
		System.out.println("Datos del autor: \n" + autor1.toString() + "\n");

		Autor autor2 = leerAutor();
		System.out.println("Datos del autor: \n" + autor2.toString() + "\n");

		// Leemos los datos de un libro y los guardamos en un
		// objeto de la clase Libro.
		System.out.println("\n********** ALTA DE LIBRO **********\n");

		// HA HABIDO UN ERROR! No llegaba a leer el título del libro
		// y por eso hemos puesto esta entrada en el scanner.
		// Esto es vaciar el buffer.

		System.out.print("Título del libro: ");
		String titulo = sc.nextLine();

		System.out.print("ISBN del libro: ");
		String isbn = sc.nextLine();

		System.out.print("Año actual del libro: ");
		int anyoActual = sc.nextInt();

		// Creo un array con los autores del libro
		Autor[] autores = { autor1, autor2 };
		Libro libro1 = new Libro(titulo, isbn, autores);

		sc.nextLine();

		Libro.setAnyoActual(anyoActual);

		System.out.println(libro1.toString());
		
		System.out.println(libro1.muestraAutores());

	}

	private static Autor leerAutor() {

		// Leemos los datos de un autor y los guardamos en un
		// objeto de la clase Autor.
		System.out.println("********** ALTA DE AUTOR **********\n");

		System.out.print("Nombre del autor: ");
		String nombre = sc.nextLine();

		System.out.print("Email del autor: ");
		String email = sc.nextLine();

		System.out.print("Año de nacimiento del autor: ");
		int anyo = sc.nextInt();

		sc.nextLine();

		return new Autor(nombre, email, anyo);

	}
	
	
	
	

}
