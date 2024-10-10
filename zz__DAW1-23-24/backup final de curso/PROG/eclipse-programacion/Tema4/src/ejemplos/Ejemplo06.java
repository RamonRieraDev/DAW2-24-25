package ejemplos;

public class Ejemplo06 {

	public static void main(String[] args) {

		tablaMultiplicar(5);

	}

	// Muestra la tabla de multiplicar del número que le pases.
	static void tablaMultiplicar(int num) {

		for (int i = 0; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + num * i);
		}

	}

}
