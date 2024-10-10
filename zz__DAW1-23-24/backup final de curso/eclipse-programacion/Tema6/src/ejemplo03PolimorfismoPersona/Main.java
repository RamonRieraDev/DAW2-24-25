package ejemplo03PolimorfismoPersona;

public class Main {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("Pérez Ortiz", "Rubén", "10200200R", "9012-1211-1732-1230");
		cliente1.mostrar();

		Directivo directivo1 = new Directivo("Rodríguez", "Miguel", "10102020R", 51, 200);
		directivo1.mostrar();

		// Ejemplos de polimorfismo:

		// A p1 (que es de tipo Persona) le puedo asignar un objeto de tipo Cliente. Por
		// que Cliente
		// es un tipo de persona (hereda de Persona).
		Persona p1 = cliente1;

		// A p2 (que es de tipo Persona) le puedo asignar un objeto de tipo Directivo.
		// Por que Directivo es un tipo de Empleado que a su vez es un tipo de persona 
		// (hereda de Empleado el cual hereda de Persona).
		Persona p2 = directivo1;

		// Si llamamos al método mostrar() de p2, se ejecuta el de Directivo.
		p2.mostrar();
		
		// Si llamamos al método mostrar() de p2, se ejecuta el de Cliente.
		p1.mostrar();

		// Solo se puede llamar a métodos de p1 o p2 si existen en la clase padre (Persona).
		
		// Un objeto de tipo persona no ncesariamente puede asgnarse a una variable Cliente.
		// No cualquier Persona es un Cliente. Por lo tanto, no se puede hacer:
		// Persona p3 = new Persona();
		// Cliente cliente2 = p3;
		
		// Podemos asignar a una variable de tipo Cliente otra variable de tipo Persona siempre que
		// hagamos un cast a Cliente. Siempre que sepamos que la variable de tipo Persona apunta a un 
		// objeto Cliente.
		Cliente cliente3 = (Cliente) p1;
		
		// Lo siguiente dará error porque p2 está apuntando a un objeto de tipo Directivo y no de tipo Cliente.
		// Cliente cliente4 = (Cliente) p2;
		
		// QUÉ UTILIDADES NOS APORTA EL POLIMORFISMO:
		// Podemos crear un array de tipo Persona y guardar tanto Clientes como Empleados y Directivos.
		Persona[] personas = new Persona[10];
		
		personas[0] = cliente1;
		personas[1] = directivo1;
		personas[2] = new Empleado("Jiménez", "Pedro", "20202020B", 5);
		
		Empleado empleado1 = (Empleado) personas[2];
		
		// Método EQUALS: mira si empleado1 y personas[2] apunta al mismo lugar de la memoria.
		System.out.println(empleado1.equals(personas[2]));
		
	}
}
