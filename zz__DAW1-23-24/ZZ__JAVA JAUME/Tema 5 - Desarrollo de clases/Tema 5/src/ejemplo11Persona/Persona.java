package ejemplo11Persona;

public class Persona {

	// Atributos
	String nombre;
	String apellidos;
	int edad;
	
	//Constructuor vacío
	Persona(){
		
	}
	
	//Constructor con edad por defecto
	Persona(String nombre, String apellidos){
		this(nombre, apellidos, 0);

	}
	
	// Método constructor
	Persona(String nombre, String apellidos, int edad){
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
				
	}

	// Métodos
	void mostrar() {

		System.out.println("\nDatos de " + nombre);
		System.out.println("===============================");
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Edad: " + edad);

	}

}