package ejemplo01PersonaRepaso;

public class Main {

	public static void main(String[] args) {

		Persona persona1 = new Persona();
		
		persona1.nombre = "ramon";
		persona1.edad = 40;
		persona1.dni = "4343434343b";
		persona1.fechaNacimiento = "12/02/1983";
		
//		System.out.println("Nombre: " + persona1.nombre);
//		System.out.println("Edad: " + persona1.edad);
//		System.out.println("DNI: " + persona1.dni);
//		System.out.println("Fecha de nacimiento: " + persona1.fechaNacimiento);
		
		persona1.anyoNacimiento();
		
		persona1.mostrar();
		
		Persona persona2 = new Persona();
		
		persona2.nombre = "paco";
		persona2.edad = 24;
		persona2.fechaNacimiento = "24/04/2000";
		
		persona2.mostrar();
		
	}

}
