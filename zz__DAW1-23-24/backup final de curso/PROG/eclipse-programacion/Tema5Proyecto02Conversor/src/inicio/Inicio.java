package inicio;

import java.util.Scanner;

import conversion.Conversor;

public class Inicio {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce los Km: ");
		double km = entrada.nextDouble();
		System.out.println("Millas: " + Conversor.millas(km) + "\n");
		
		System.out.println("Introduce las millas: ");
		double millas = entrada.nextDouble();
		System.out.println("Km: " + Conversor.km(millas) + "\n");
		
		System.out.println("Introduce las atmosferas: ");
		double atmosferas = entrada.nextDouble();
		System.out.println("Milibares: " + Conversor.milibares(atmosferas) + "\n");
		
		System.out.println("Introduce los milibares: ");
		double milibares = entrada.nextDouble();
		System.out.println("Atmósferas: " + Conversor.atmosferas(milibares) + "\n");
		
		System.out.println("Introduce los julios: ");
		double julios = entrada.nextDouble();
		System.out.println("Calorías: " + Conversor.calorias(julios) + "\n");
		
		System.out.println("Introduce los calorias: ");
		double calorias = entrada.nextDouble();
		System.out.println("Julios: " + Conversor.julios(calorias) + "\n");
		
	}
}
