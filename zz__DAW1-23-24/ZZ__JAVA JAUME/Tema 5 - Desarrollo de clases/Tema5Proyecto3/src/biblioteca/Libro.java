package biblioteca;

public class Libro {

	// Atributos
	private String titulo;
	private String isbn;
	private String autor;
	private int anyoActual;

	public Libro(String titulo) {

		this(titulo, "0-2923-1060-9", "Jaume");

	}

	public Libro(String titulo, String isbn, String autor) {

		this.titulo = titulo;
		this.isbn = isbn;
		this.autor = autor;
		this.anyoActual = 1999;
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

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnyoActual() {
		return anyoActual;
	}

	public void setAnyoActual(int anyoActual) {
		this.anyoActual = anyoActual;
	}

	public String toString() {

		return "Título: " + titulo + "\nISBN: " + isbn + "\nAutor: " 
		+ autor + "\nAño actual: " + anyoActual;
	}
}
