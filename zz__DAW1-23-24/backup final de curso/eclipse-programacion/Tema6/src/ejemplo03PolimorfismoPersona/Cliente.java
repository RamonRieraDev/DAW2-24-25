package ejemplo03PolimorfismoPersona;

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
//	@Override
	public void mostrar() {

		System.out.println("\n" + getNombre() + " " + getApellidos() + ", con DNI " + getDni() + ".");
		System.out.println("\nVisa: " + visa + ".");
	}

}
