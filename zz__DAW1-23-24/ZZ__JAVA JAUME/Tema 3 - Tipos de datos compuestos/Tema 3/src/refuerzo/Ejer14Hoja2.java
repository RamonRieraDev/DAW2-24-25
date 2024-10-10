package refuerzo;

public class Ejer14Hoja2 {

	public static void main(String[] args) {

		String precios[][] = { 
				{ "Tablet Samsung", "120" }, 
				{ "Móvil Sony", "115" }, 
				{ "Ipad Mini", "290" },
				{ "Móvil HTC", "95" }, 
		};

		float total = 0;

		System.out.println("Artículos\n=======================");

		for (int fila = 0; fila < precios.length; fila++) {

			for (int col = 0; col < precios.length; col++) {

				System.out.print(precios[fila][col]);

			}
			System.out.println();

			total = total + Float.parseFloat(precios[fila][1]);

		}

		System.out.println("Total: " + total + "€.");

	}

}
