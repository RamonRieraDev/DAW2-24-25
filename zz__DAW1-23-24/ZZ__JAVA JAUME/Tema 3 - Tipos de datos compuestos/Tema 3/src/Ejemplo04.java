import java.util.Scanner;

public class Ejemplo04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Tallas de zapatos.
		double tallas[] = { 40, 38, 42, 37, 43, 43, 44.5, 46, 46, 36.5, 36, 38.5, 40, 39, 41, 40, 41.5, 48, 40.5,
				37.5 };

		System.out.print("Introduzca una talla: ");
		double talla = entrada.nextDouble();

		// Buscamos esa talla en el array.
		boolean encontrada = false;

		for (int i = 0; i < tallas.length; i++) {

			if (tallas[i] == talla) {
				encontrada = true;
				break;
			}
		}
		if (encontrada) {
			System.out.println("Se ha encontrado la talla.");
		} else {
			System.out.println("No se ha encontrado la talla.");
		}
	}

}
