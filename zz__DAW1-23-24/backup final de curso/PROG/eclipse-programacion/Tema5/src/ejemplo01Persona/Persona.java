package ejemplo01Persona;

// La primera diferencia es que no hay clase main. Esto es como una plantilla.
// Se le dotará de variables globales. Por lo tanto, irá dentro del public class.
// Esto es como un plano de una casa. 
public class Persona {

	// Propiedades (o atributos) de la clase Persona:
	String apellidos;
	String nombre;
	String dni;
	String fechaNacimiento;

	// Métodos:
	// No hace falta poner static.
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
