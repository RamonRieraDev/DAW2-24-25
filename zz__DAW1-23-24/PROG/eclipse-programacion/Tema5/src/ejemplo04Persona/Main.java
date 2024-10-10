package ejemplo04Persona;

public class Main {

	public static void main(String[] args) {

		// Declaramos la variable persona1, de tipo Persona, y le asignamos un
		// objeto de tipo Persona. Usamos el constructor y así evitamos asignar valor
		// a cada atributo por separado:
		Persona persona1 = new Persona("Sánchez", "Mario", "22100100T", "10/10/1980");

		// Podemos crear tantos objetos persona como necesitemos:
		Persona persona2; // Declaramos la variable tipo Persona.
		persona2 = new Persona(); // Le asgnamos un nuevo objeto tipo Persona.

		persona2.apellidos = "Martínez López";
		persona2.nombre = "María";

		// Podemos llamar al método mostrar() de Persona:
		persona1.mostrar();
		persona2.mostrar();

		// Probamos el método tieneDni():
		if (persona1.tieneDni()) {
			System.out.println(persona1.nombre + " " + persona1.apellidos + " tiene DNI.");
		} else {
			System.out.println(persona1.nombre + " " + persona1.apellidos + " no tiene DNI.");
		}

		if (persona2.tieneDni()) {
			System.out.println(persona2.nombre + " " + persona2.apellidos + " tiene DNI.");
		} else {
			System.out.println(persona2.nombre + " " + persona2.apellidos + " no tiene DNI.");
		}

		// Probamos el método anyoNacimiento():
		if (persona1.anyoNacimiento() == null) {
			System.out.println(persona1.nombre + " " + persona1.apellidos + " no tiene fecha de nacimiento.");
		} else {
			System.out.println(persona1.nombre + " " + persona1.apellidos + " ha nacido en el año "
					+ persona1.anyoNacimiento() + ".");
		}

		if (persona2.anyoNacimiento() == null) {
			System.out.println(persona2.nombre + " " + persona2.apellidos + " no tiene fecha de nacimiento.");
		} else {
			System.out.println(persona2.nombre + " " + persona2.apellidos + " ha nacido en el año "
					+ persona2.anyoNacimiento() + ".");
		}

	}

}
