package practicaPrimeraEvaluación;

import java.util.Scanner;

public class Actividad4 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("=======MÁQUINA EXPENDEDORA=======");
		System.out.println(" ");
		System.out.println("Productos a la venta");
		System.out.println("=================================");
		System.out.println("  1) Lata 33 cl Coca-Cola  1,30 €");
		System.out.println("  2) Lata 33 cl Aquarius   1,50 €");
		System.out.println("  3) Patatillas onduladas  2 €");
		System.out.println("  4) Botella 50 cl agua    1€");
		System.out.println(" ");

		int producto = 0;
		double dinero = 0;

		System.out.println("¿Qué quiere comprar?");
		producto = entrada.nextInt();

		while (true) {
			if (producto < 1 || producto > 4) {

				System.out.println("El producto indicado no existe.");
				System.out.println("¿Qué quiere comprar?");
				producto = entrada.nextInt();

			} else if (producto >= 1 || producto <= 4) {
				break;
			}
		}

		System.out.println("¿Cuánto dinero quiere introducir?");
		dinero = entrada.nextDouble();

		while (true) {
			if (dinero < 0) {
				System.out.println("Debe introducir una cantidad válida " + "mayor o igual a cero.");
				System.out.println("¿Cuánto dinero quiere introducir?");
				dinero = entrada.nextDouble();
			} else {
				break;
			}
		}

		switch (producto) {
		case 1:
			if (dinero >= 1.30) {
				System.out.println("Tome su Coca-cola.");
				System.out.println("Su cambio: " + (dinero - 1.30) + " €.");
				System.out.println("¡Vuelva pronto!");
			} else if (dinero < 1.30) {
				System.out.println("No ha introducido suficiente dinero.");
				System.out.println("Le faltan " + (1.30 - dinero) + " euros.");
			}
			break;
		case 2:
			if (dinero >= 1.50) {
				System.out.println("Tome su Aquarius.");
				System.out.println("Su cambio: " + (dinero - 1.50) + " €.");
				System.out.println("¡Vuelva pronto!");
			} else if (dinero < 1.50) {
				System.out.println("No ha introducido suficiente dinero.");
				System.out.println("Le faltan " + (1.50 - dinero) + " euros.");
			}
			break;
		case 3:
			if (dinero >= 2) {
				System.out.println("Tome sus Patatillas onduladas.");
				System.out.println("Su cambio: " + (dinero - 2) + " €.");
				System.out.println("¡Vuelva pronto!");
			} else if (dinero < 2) {
				System.out.println("No ha introducido suficiente dinero.");
				System.out.println("Le faltan " + (2 - dinero) + " euros.");
			}
			break;
		case 4:
			if (dinero >= 1) {
				System.out.println("Tome su Agua");
				System.out.println("Su cambio: " + (dinero - 1) + " €.");
				System.out.println("¡Vuelva pronto!");
			} else if (dinero < 1) {
				System.out.println("No ha introducido suficiente dinero.");
				System.out.println("Le faltan " + (1 - dinero) + " euros.");
			}
			break;
		}
	}

}
