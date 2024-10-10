package prac1;

// Convirtiendo una clase en abstracta no podemos crear objetos de esta clase (mirar el Main)
public abstract class Medio {
	
	private String nombre;
	private double duracion;
	
	public Medio() {
		
	}
	
	public Medio(String nombre, double duracion) {
		this.nombre = nombre;
		this.duracion = duracion;
	}
	
	// Crear un método abstracto hace que las clases hijas tienen que implementarse con el método
	// abstracto o que la clase hija sea abstracta también.
	public abstract void reproducir();
}
