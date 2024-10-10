package inicio;

import java.util.Scanner;

import conversion.Conversor;

public class Inicio {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Dame una distancia en Km y te daré en Millas: ");
		double distKm = entrada.nextDouble();
		System.out.println(distKm + " Km son " + Conversor.millas(distKm) + " Millas.\n");
		
		System.out.print("Dame una distancia en Millas y te daré en Km: ");
		double distMillas = entrada.nextDouble();
		System.out.println(distMillas + " Millas son " + Conversor.km(distMillas) + " Km.\n");
		
		System.out.print("Dame un valor en milibares y te daré en atmósferas: ");
		double mili = entrada.nextDouble();
		System.out.println(mili + " milibares son " + Conversor.atmosferas(mili) + " atmósferas.\n");
		
		System.out.print("Dame un valor en atmósferas y te daré en milibares: ");
		double atm = entrada.nextDouble();
		System.out.println(atm + " atmósferas son " + Conversor.milibares(atm) + " milibares.\n");
		
		System.out.print("Dame un valor en calorías y te daré en julios: ");
		double calorias = entrada.nextDouble();
		System.out.println(calorias + " calorías son " + Conversor.julios(calorias) + " julios.\n");
		
		System.out.print("Dame un valor en julios y te daré en calorias: ");
		double julios = entrada.nextDouble();
		System.out.println(julios + " julios son " + Conversor.calorias(julios) + " calorías.\n");
	}

}
