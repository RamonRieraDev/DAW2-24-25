package ejemplo01Persona;


// Hacemos que la clase Persona sea abstracta y de ese modo no se podrán crear objetos de tipo Persona.
public abstract class Persona {

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
//	public String getApellidos() {
//		
//	}

	// Hacemos este método abstracto. Así no le ponemos contenido y obligamos a que las 
	// clases hijas lo implementen.
	public abstract void mostrar();

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
