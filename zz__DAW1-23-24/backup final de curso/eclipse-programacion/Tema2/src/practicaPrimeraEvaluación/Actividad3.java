package practicaPrimeraEvaluación;

import java.util.Scanner;

public class Actividad3 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("=====MÁQUINA EXPENDEDORA=====");
		System.out.println("Productos a la venta");
		System.out.println("=============================");
		System.out.println("1) Lata 33 cl Coca-Cola  1,30 €");
		System.out.println("2) Lata 33 cl Aquarius   1,50 €");
		System.out.println("3) Patatillas onduladas  2 €");
		System.out.println("4) Botella 50 cl agua    1€");
		System.out.println(" ");

		int num = 0;

		System.out.println("¿Qué quiere comprar?");
		num = entrada.nextInt();

		while (true) {
			if (num < 1 || num > 4) {

				System.out.println("El producto indicado no existe.");
				System.out.println("¿Qué quiere comprar?");
				num = entrada.nextInt();

			} else if (num >= 1 || num <= 4) {
				break;
			}
		}

		System.out.println("¿Cuánto dinero quiere introducir?");
		num = entrada.nextInt();

		while(true) {
			if (num < 0) {
				System.out.println("Debe introducir una cantidad válida "
						+ "mayor o igual a cero.");
				System.out.println("¿Cuánto dinero quiere introducir?");
				num = entrada.nextInt();
			}else {
				break;
			}
			
		}
		
	}

}
