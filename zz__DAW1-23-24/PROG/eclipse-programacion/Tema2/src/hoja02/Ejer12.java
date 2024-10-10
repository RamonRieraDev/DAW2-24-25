package hoja02;

public class Ejer12 {

	public static void main(String[] args) {

		System.out.println("MÚLTIPLOS ENTRE 1 Y 1000");

		int num = 0;
		int suma = 0;
		
		while (num < 1000) {

			num = num + 5;
			suma = suma + num;
			System.out.println(num + "\n");
		}
		System.out.println("La suma total de todos los múltiplos de 5"
				+ "entre 1 y 1000 es: " + suma);
	}

}
