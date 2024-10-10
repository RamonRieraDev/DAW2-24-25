package ejemplo01Persona;

public class Cliente extends Persona {

	// ATRIBUTOS:
	private String visa;

	// CONSTRUCTORES:
	public Cliente(String apellidos, String nombre, String dni, String visa) {

		// Pasamos los apellidos, nombre y dni como argumentos al constructor
		// de la clase padre (Persona).
		super(apellidos, nombre, dni);

		// Inicializamos a mano el resto de propiedades o atributos que no son
		// heredados.
		this.visa = visa;

	}

	// MÉTODOS:
	@Override // Sirve para que nos corrija si ve que el método no está bien escrito
	// para indicarnos que el método no está sobreescrito (override)
	public void mostrar() {

		System.out.println("\n" + getNombre() + " " + getApellidos() + ", con DNI " + getDni() + ".");
		System.out.println("\nVisa: " + visa + ".");
	}

}
