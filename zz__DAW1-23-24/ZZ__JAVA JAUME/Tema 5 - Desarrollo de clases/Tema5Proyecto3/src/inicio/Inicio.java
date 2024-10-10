package inicio;

import biblioteca.Autor;
import biblioteca.Libro;

public class Inicio {

	public static void main(String[] args) {
		
		Autor a1 = new Autor("Jaume", "elmashermoso@gmail.com", 07);		
		System.out.println(a1.toString());
				
		System.out.println("\n==================");
		Autor a2 = new Autor("Jaume");		
		System.out.println(a2.toString());
		
		System.out.println("\n==================");
		Libro l1 = new Libro("El mar", "2-2563-4521-8", "Jaume");
		System.out.println(l1.toString());
		
		System.out.println("\n==================");
		Libro l2 = new Libro("El culumpio");
		System.out.println(l2.toString());
		
		
	}
}
