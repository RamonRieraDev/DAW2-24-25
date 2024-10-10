package biblioteca;

public class Libro {
	
	// VARIABLES:
	private String titulo;
	private String isbn;
	private Autor autor;
	private static int anyoActual;

	// CONSTRUCTORES:
	public Libro(String titulo) {
		
		this.titulo = titulo;
		// También podría ser:
		// this(titulo, null, null);
	}

	public Libro(String titulo, String isbn, Autor autor) {
		
		this.titulo = titulo;
		this.isbn = isbn;
		this.autor = autor;
	}
	
	// MÉTODOS DE ENTRADA (GETTERS Y SETTERS:
	public String toString() {
		// titulo, isbn, autor, año actual
		return "El libro se llama: " + titulo + ", del autor: "
				+ autor.getNombre() + ", con el ISBN: " + isbn 
				+ " del año: " + anyoActual;  
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public Autor getAutor() {
		return autor;
	}
	
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	public static int getAnyoActual() {
		return anyoActual;
	}
	
	// anyoActual es estático y vale lo mismo en cualquier objeto
	// Libro. Si usamos this.anyoActual daría la impresión de que podemos modificar
	// el atributo de forma distinta para objetos distintos.
	// Por eso, usamos el nombre de la clase: Libro.anyoActual.
	public static void setAnyoActual(int anyoActual) {
		Libro.anyoActual = anyoActual;
	}
}
