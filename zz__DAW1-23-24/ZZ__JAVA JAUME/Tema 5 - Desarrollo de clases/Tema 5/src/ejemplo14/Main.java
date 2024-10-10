package ejemplo14;

public class Main {

	public static void main(String[] args) {

		Persona persona1 = new Persona("Jaume", "Aguiló Pizà", 22);

		persona1.mostrar();

		// Queremos modificar el nombre.
		// persona1.nombre = "Higinio";
		System.out.println("\nNombre original: " + persona1.getNombre());

		persona1.setNombre("Higinio");
		
		System.out.println("\nNombre nuevo: " + persona1.getNombre());
	}

}