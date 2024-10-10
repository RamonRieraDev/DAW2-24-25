package ejemplo01Persona;

public class Main {

	public static void main(String[] args) {

		// Declaramos la variable persona1, de tipo Persona, y le asignamos un
		// objeto de tipo Persona:
		Persona persona1 = new Persona();

//		// Para ver qué lugar de la memoria ocupa:
//		System.out.println(persona1);

		// Para guardar datos. Damos valores a las propiedades de persona1:
		persona1.apellidos = "Sánchez";
		persona1.nombre = "Mario";
		persona1.dni = "22100100T";
		persona1.fechaNacimiento = "10/10/1980";

//		// Queremos mostrar algunos datos de persona1:
//		System.out.println("Nuestra persona 1 se llama " + persona1.nombre
//				+ " " + persona1.apellidos + ".");
//		System.out.println("Nació el " + persona1.fechaNacimiento + ".");
//		
//		// Podemos cambiar cualquier propiedad:
//		persona1.apellidos = "Sánchez Pérez";
//		System.out.println("Nuestra persona 1 se llama " + persona1.nombre
//				+ " " + persona1.apellidos + ".");
//		
		// Podemos crear tantos objetos persona como necesitemos:
		Persona persona2; // Declaramos la variable tipo Persona.
		persona2 = new Persona(); // Le asgnamos un nuevo objeto tipo Persona.

		persona2.apellidos = "Martínez López";
		persona2.nombre = "María";
//		
//		System.out.println("Nuestra persona 2 se llama " + persona2.nombre
//				+ " " + persona2.apellidos + ".");
//		
//		// Si no damos un valor a una propiedad esta recibe un valor por defecto.
//		// En este caso, con un string, sería null. Si fuera un número, 0. 
//		// Si fuera un boolean, false.
//		System.out.println("María nació el " + persona2.fechaNacimiento + ".");

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
