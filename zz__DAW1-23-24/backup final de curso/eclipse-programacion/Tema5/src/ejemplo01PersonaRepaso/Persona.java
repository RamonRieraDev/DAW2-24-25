package ejemplo01PersonaRepaso;

public class Persona {
	
	String nombre;
	int edad;
	String dni;
	String fechaNacimiento;
	
	void mostrar() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		
		if (tieneDni() == true){
		System.out.println("Dni: " + dni);
		} else {
			System.out.println("No tiene dni.");
		}
		
		System.out.println("Año de nacimiento: " + anyoNacimiento());
		
		System.out.println("Fecha de nacimiento: " + fechaNacimiento);
	}
	
	// tieneDni() devuelve true si la persona tiene dni y false si no lo tiene:
	boolean tieneDni() {
		if(dni != null) {
			return true;
		}
		return false;
	}
	
	// anyoNacimiento() devuelve el año de nacimiento (suponiendo que la fecha está
	// en formato dd/mm/aaaa.
	String anyoNacimiento() {
		return fechaNacimiento.substring(6);
	}

}
