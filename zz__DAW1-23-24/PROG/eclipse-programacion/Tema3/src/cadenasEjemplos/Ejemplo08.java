package cadenasEjemplos;

public class Ejemplo08 {

	public static void main(String[] args) {

		String datosCliente = "Salas Díaz,Ana,40,asalas@gmail.com";

		String[] datosSeparados = datosCliente.split(",");

		System.out.println("Datos del cliente");
		System.out.println("==========================");

		System.out.println("Apellidos: " + datosSeparados[0]);

		System.out.println("Nombre: " + datosSeparados[1]);

		System.out.println("Edad: " + datosSeparados[2]);

		System.out.println("Email: " + datosSeparados[3]);

		
		
		// Otro ejemplo: separar las palabras de una frase:
		String frase = "Bien hecho es mejor que bien dicho";
		
		String[] palabras = frase.split(" ");
		
		System.out.println("Frase descompuesta en palabras sueltas:");
		
		for (int i = 0; i < palabras.length; i++) {
		
			System.out.println(palabras[i]);
		}
	}

}
