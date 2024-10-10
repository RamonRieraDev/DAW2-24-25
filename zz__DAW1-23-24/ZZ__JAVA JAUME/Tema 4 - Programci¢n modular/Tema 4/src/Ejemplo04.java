import java.util.Scanner;

public class Ejemplo04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Escríbeme una palabra: ");
		String palabra = entrada.nextLine();

		mostrar(palabra);
	}

	// Método que tome como parámetro un palabra y muestre en pantalla.

	static void mostrar(String palabra) {

		System.out.println("Esta es la palabra que has escrito: " + palabra + ".");

	}

}
