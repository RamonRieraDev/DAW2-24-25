package ejemplo06Persona;

public class Cliente extends Persona {

	String visa;

	public Cliente(String dni, String nombre, String apellidos, String visa) {

		super(dni, nombre, apellidos);
		this.visa = visa;

	}
	
	@Override
	public void mostrar() {

		System.out.println("\nDatos del cliente:");
		super.mostrar();
		System.out.println("Visa: " + visa);

	}

	public void mostrarVisa() {

		System.out.println("La VISA del cliente es " + visa);

	}

}