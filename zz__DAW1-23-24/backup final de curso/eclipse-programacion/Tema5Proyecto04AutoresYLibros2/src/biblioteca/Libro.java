package biblioteca;

public class Libro {

	// VARIABLES:
	private String titulo;
	private String isbn;
	private Autor[] autores;
	private static int anyoActual;

	// CONSTRUCTORES:
	public Libro(String titulo) {

		this.titulo = titulo;
		// También podría ser:
		// this(titulo, null, null);
	}

	public Libro(String titulo, String isbn, Autor[] autores) {

		this.titulo = titulo;
		this.isbn = isbn;
		this.autores = autores;
	}

	// MÉTODOS DE ENTRADA (GETTERS Y SETTERS:
	public String toString() {
		if (autores.length == 1) {
			return "Título: " + titulo + ", del autor: " + autores[0].getNombre() + ", con el ISBN: " + isbn
					+ " del año: " + anyoActual;
		}
		return "Título: " + titulo + ", del autor: Varios autores" + ", con el ISBN: " + isbn + " del año: "
				+ anyoActual;
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

	public Autor[] getAutores() {
		return autores;
	}

	public void setAutores(Autor[] autores) {
		this.autores = autores;
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

	public String muestraAutores() {
		System.out.println("*** MOSTRAR AUTORES ***");
		String autoresMostrar = "";
		for (int i = 0; i < autores.length; i++) {
			if (autores[i] != null) {
				if (i == autores.length - 1) {
					autoresMostrar = autoresMostrar + "- " + autores[i] + ".";
				} else if (i < autores.length - 1) {
					autoresMostrar = autoresMostrar + "- " + autores[i] + ",\n";
				}
			}
		}
		return autoresMostrar;
	}
}
