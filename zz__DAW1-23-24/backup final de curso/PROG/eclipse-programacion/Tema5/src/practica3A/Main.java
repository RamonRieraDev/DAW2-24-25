package practica3A;

public class Main {

	public static void main(String[] args) {
		
		String mensajeError = "¡Tu edad debe ser un número entero!";
		
		System.out.println("Escribe tu edad:");
		System.out.println("Tu edad es " + Consola.leerInt(mensajeError));
		
		System.out.println("Escribe tu edad:");
		System.out.println("Tu edad es " + Consola.leerInt());

	}

}
