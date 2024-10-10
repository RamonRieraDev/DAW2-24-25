import java.util.ArrayList;
import java.util.List;

public class Ejemplo03 {

	public static void main(String[] args) {
		
		List<Libro> libros = new ArrayList<>();
		
		libros.add(new Libro("Las recestas de Arguiñano", "Karlos Arguiñano"));
		
		libros.add(new Libro("La vida de Dios, Bad Bunny", "Pera Alta"));
		
		libros.add(new Libro("Zelda Minish Cap", "Ninendo"));
		
		// Queremos borrar el libro de Arguiñano.
		Libro libroArguinano = new Libro ("Las recetas de Arguiñano", 
				"Karlos Arguiñano");
		libros.remove(libroArguinano);
		
		//Vemos si se ha borrado.
		for(Libro libro : libros) {
			System.out.println(libro.getTitulo());
		}
		
	}
}
