package ejemplo03PolimorfismoPersona;

public class Persona {

	// ATRIBUTOS:
	private String apellidos;
	private String nombre;
	private String dni;

	// CONSTRUCTORES:
	public Persona() {

	}

	public Persona(String apellidos, String nombre, String dni) {

		this.apellidos = apellidos;
		this.nombre = nombre;
		this.dni = dni;

	}

	// MÉTODOS:

	// Si borramos este método que está en la clase padre (Persona) hay que tener en cuenta que no se 
	// podrá usar en sus hijos aunque ese método esté en sus clases.
	public void mostrar() {

		System.out.println("\n" + getNombre() + " " + getApellidos() + ", con DNI " + getDni() + ".");
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

}
