package inicio;

import java.util.Scanner;

import biblioteca.Autor;
import biblioteca.Libro;

public class Inicio {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Leemos los datos de un autor y los guardamos en un
		// objeto de la clase Autor.
		System.out.println("********** ALTA DE AUTOR **********");

		System.out.print("\nNombre del autor: ");
		String nombre = sc.nextLine();

		System.out.print("\nEmail del autor: ");
		String email = sc.nextLine();

		System.out.print("\nAño de nacimiento del autor: ");
		int anyo = sc.nextInt();

		Autor autor1 = new Autor(nombre, email, anyo);

		System.out.print("\nDatos del autor: " + autor1.toString());

		// Leemos los datos de un libro y los guardamos en un
		// objeto de la clase Libro.
		System.out.println("\n********** ALTA DE LIBRO **********");

		// HA HABIDO UN ERROR! No llegaba a leer el título del libro
		// y por eso hemos puesto esta entrada en el scanner.
		// Esto es vaciar el buffer.
		sc.nextLine();

		System.out.print("\nTítulo del libro: ");
		String titulo = sc.nextLine();

		System.out.print("\nISBN del libro: ");
		String isbn = sc.nextLine();

		System.out.print("\nAño actual del libro: ");
		int anyoActual = sc.nextInt();

		Libro libro1 = new Libro(titulo, isbn, autor1);
		
		Libro.setAnyoActual(anyoActual);

		System.out.println(libro1.toString());

	}

}
