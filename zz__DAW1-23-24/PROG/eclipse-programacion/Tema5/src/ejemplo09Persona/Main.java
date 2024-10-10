package ejemplo09Persona;

public class Main {

	public static void main(String[] args) {

		// Declaramos la variable persona1, de tipo Persona, y le asignamos un
		// objeto de tipo Persona. Usamos el constructor y así evitamos asignar valor
		// a cada atributo por separado:
		Persona persona1 = new Persona("Sánchez", "Mario", "22100100T", "10/10/1980");

		// Podemos crear tantos objetos persona como necesitemos:
//		Persona persona2; // Declaramos la variable tipo Persona.
//		persona2 = new Persona(); // Le asgnamos un nuevo objeto tipo Persona.
//		
//		persona2.apellidos = "Martínez López";
//		persona2.nombre = "María";
//		
		// Otra manera de hacerlo gracias a que hemos creado un constructor en Persona.java
		// con los atributos apellidos y nombre:
		Persona persona2 = new Persona("Martínez López", "María");

		// Podemos llamar al método mostrar() de Persona:
		persona1.mostrar();
		persona2.mostrar();

		// Probamos el método tieneDni():
		if (persona1.tieneDni()) {
			System.out.println(persona1.getNombre() + " " + persona1.getApellidos() + " tiene DNI.");
		} else {
			System.out.println(persona1.getNombre() + " " + persona1.getApellidos() + " no tiene DNI.");
		}

//		if (persona2.tieneDni()) {
//			System.out.println(persona2.nombre + " " + persona2.apellidos + " tiene DNI.");
//		} else {
//			System.out.println(persona2.nombre + " " + persona2.apellidos + " no tiene DNI.");
//		}

//		// Probamos el método anyoNacimiento():
//		if (persona1.anyoNacimiento() == null) {
//			System.out.println(persona1.nombre + " " + persona1.apellidos + " no tiene fecha de nacimiento.");
//		} else {
//			System.out.println(persona1.nombre + " " + persona1.apellidos + " ha nacido en el año "
//					+ persona1.anyoNacimiento() + ".");
//		}
//
//		if (persona2.anyoNacimiento() == null) {
//			System.out.println(persona2.nombre + " " + persona2.apellidos + " no tiene fecha de nacimiento.");
//		} else {
//			System.out.println(persona2.nombre + " " + persona2.apellidos + " ha nacido en el año "
//					+ persona2.anyoNacimiento() + ".");
//		}
		
//		// Al crear persona2 no le dimos un valor a fechaNacimiento, por lo que será null:
//	System.out.println("María nació el " + persona2.fechaNacimiento);
//		
		
		// Persona3 con el constructor de 3 atributos:
		Persona persona3 = new Persona("Riera Jover", "Ramon", "22334455D", "10/02/1983");
		persona3.mostrar();
		
		
		// Persona4 con el constructor de 2 atributos:
		Persona persona4 = new Persona("Riera Jover", "Ramon");
		persona4.mostrar();
		
		// Persona 5 con el constructor de 1 atributo:
		Persona persona5 = new Persona("11336688Y");
		persona5.mostrar();
		
		// ¿Para qué sirve el constructor implícito?:
		// Para que funcione es necesario haber escrito el constructor implícito,
		// ya que este desaparece en el momento que creamos a mano un constrctor explícito.
		Persona persona6 = new Persona(); // Aquí se está usando porque no hay atributos.
		

	}

}
