package hoja02;

public class Ejer01 {

	public static void main(String[] args) {

		int[] edades = { 20, 25, 30, 28, 39, 42, 30, 29, 28, 21, 60, 55, 20, 19 };

		boolean edadEncontrada = false;

		int i = 0;

		for (i = 0; i < edades.length; i++) {
			if (edades[i] == 35) {
				edadEncontrada = true;
				break;
			}
		}
		if (edadEncontrada) {
			System.out.println("Localizada persona de 35 años.");
		} else {
			System.out.println("No se ha localizado.");
			edadEncontrada = false;
		}
	}

}
