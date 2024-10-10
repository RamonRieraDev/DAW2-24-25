package ejemplo04Persona;

public class Persona {

	// Propiedades (o atributos) de la clase Persona:
	String apellidos;
	String nombre;
	String dni;
	String fechaNacimiento;
	
	// MÉTODOS:
	
	
	// Constructor imlícito de la clase. Un constructor se llama igual que la clase 
	// pero no hace falta ni void o valor.
	Persona(){
		
	}
	
	// Constructor explícito. Nos permite pasarle argumentos.
	// this.apellidos se referirá a las variables globales. En cambio apellidos será 
	// local porque está dentro del método / constructor. Por eso tienen colores distintos.
	// this. se refiere al objeto que estamos creando.
	Persona(String apellidos, String nombre, String dni, String fechaNacimiento){
		this.apellidos = apellidos;
		this.nombre = apellidos;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		
	}
	
	
	// No hace falta poner static.
	// Muestra en la terminal todos los valores de los atributos.
	void mostrar() {
		System.out.println("\nNombre completo: " + apellidos + ", " + nombre + ".");
		System.out.println("DNI: " + dni);
		System.out.println("Fecha de nacimiento: " + fechaNacimiento + "\n");
	}

	// tieneDni() devuelve true si la persona tiene dni y false si no lo tiene:
	boolean tieneDni() {
		if (dni != null) {
			return true;
		} else {
			return false;
		}
	}

	// anyoNacimiento() devuelve el año de nacimiento (suponiendo que la fecha está
	// en formato dd/mm/aaaa.
	String anyoNacimiento() {

		if (fechaNacimiento != null) {
			return fechaNacimiento.substring(6);
		} else {
			return null;
		}
	}
}
