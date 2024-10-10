package practica3B;

public class Main {

	public static void main(String[] args) {
		
		String mensajeErrorEdad = "¡Tu edad debe ser un número entero!";

		String mensajeErrorAltura = "¡Tu altura debe ser un número!";

		System.out.println("Escribe tu edad:");
		System.out.println("Tu edad es " + Consola.leerInt(mensajeErrorEdad));

		System.out.println("\nEscribe tu edad:");
		System.out.println("Tu edad es " + Consola.leerInt());
		
		System.out.println("\nEscribe tu altura, en metros: ");
		System.out.println("Tu altura es " + Consola.leerDouble(mensajeErrorAltura) + " metros.");
		
		System.out.println("\nEscribe tu altura, en metros: ");
		System.out.println("Tu altura es " + Consola.leerDouble() + " metros.");
		
		System.out.println("\n¿Cómo te llamas? ");
		System.out.println("Te llamas " + Consola.leerString() + ".");

	}

}
