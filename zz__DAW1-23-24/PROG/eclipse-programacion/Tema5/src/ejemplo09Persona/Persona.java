package ejemplo09Persona;

public class Persona {

	// Propiedades (o atributos) de la clase Persona:
	private String apellidos;
	private String nombre;
	private String dni;
	private String fechaNacimiento;

	// MÉTODOS:

	// Constructor imlícito de la clase. Un constructor se llama igual que la clase
	// pero no hace falta ni void o valor. El implícito "no hace nada"... Más que
	// nada
	// porque está de manera implícita si no hay otro constructor...
	// Se debe escribir a mano desde que se crea otro constructor explícito.
	public Persona() {

	}

	// Constructor explícito. Nos permite pasarle argumentos.
	// this.apellidos se referirá a las variables globales. En cambio apellidos será
	// local porque está dentro del método / constructor. Por eso tienen colores
	// distintos.
	// this. se refiere al objeto que estamos creando.
	// SOBRECARGAR es meter variables en el método.
	public Persona(String apellidos, String nombre, String dni, String fechaNacimiento) {
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;

	}

	// Esto es un constructor explícito. Le pasamos los apellidos y el nombre de la
	// persona,
	// y dejamos los otros datos con valores por defecto.
	public Persona(String apellidos, String nombre) {

//		
//		this.apellidos = apellidos;
//		this.nombre = nombre;
//		// Damos un valor por defecto al atributo dni.
//		this.dni = "Sin DNI";
//		// Dejamos el atributo fechaNacimiento con el valor por defecto (null). 
//		// Por eso no lo ponemos.

		// Podemos hacer lo mismo que lo anterior así:
		// Solo "this" así se refiere a la clase. En este caso: Persona.
		this(apellidos, nombre, "Sin DNI", null);
		// Con 1 sola línea hemos aprovechado el método.
	}

	// Constructor explícito. Le pasamos el DNI y dejamos el resto de atributos con
	// valor
	// null.
	public Persona(String dni) {
//		this.dni = dni;

		// Podemos hacer lo mismo que lo anterior así:
		this(null, null, dni, null);
		// Con 1 sola línea no hemos aprovechado el método pero practicamos así :)
	}

	// No hace falta poner static.
	// Muestra en la terminal todos los valores de los atributos.
	public void mostrar() {
		System.out.println("\nNombre completo: " + apellidos + ", " + nombre + ".");
		System.out.println("DNI: " + dni);
		System.out.println("Fecha de nacimiento: " + fechaNacimiento + "\n");
	}

	// tieneDni() devuelve true si la persona tiene dni y false si no lo tiene:
	public boolean tieneDni() {
		if (dni == null || dni.equals("Sin DNI")) {
			return false;
		} else {
			return true;
		}
	}

	// anyoNacimiento() devuelve el año de nacimiento (suponiendo que la fecha está
	// en formato dd/mm/aaaa.
	public String anyoNacimiento() {

		if (fechaNacimiento != null) {
			return fechaNacimiento.substring(6);
		} else {
			return null;
		}
	}

	// MÉTODOS DE ACCESO (Los "GETTERS" (GET) y los "SETTERS" (SET))

	// Método que nos permite leer el atributo apellidos:
	public String getApellidos() {
		return apellidos;
	}

	// Método que nos permite dar un valor al atributo apellidos:
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	// Método que nos permite leer el atributo nombre:
	public String getNombre() {
		return nombre;
	}

	// Método que nos permite dar un valor al atributo nombre:
	public void setNombre(String apellidos) {
		this.nombre = nombre;
	}

	// Método que nos permite leer el atributo dni:
	public String getDni() {
		return dni;
	}

	// Método que nos permite dar un valor al atributo nombre:
	public void setDni(String dni) {
		this.dni = dni;
	}

	// Método que nos permite leer el atributo fechaNacimiento:
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	// Método que nos permite dar un valor al atributo fechaNacimiento:
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

}
