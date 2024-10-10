package fechas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Ejemplo04 {

	public static void main(String[] args) {
		
		LocalDate[] fechas = new LocalDate [5];
		
		// Pedir por terminal las 5 fechas y guardarlas en el array:
		System.out.println("Introduce 5 fechas: ");
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < fechas.length; i++) {
			System.out.print("Fecha " + (i+1) + ": ");
			fechas[i] = LocalDate.parse(sc.nextLine());
		}
		
		// Mostrar por terminal la lista de fechas:
		
		for (int i = 0; i < fechas.length; i++) {
			System.out.print("Fecha " + (i+1) + ": " + fechas[i] + "\n");
		}
		
		// Indicar la fecha más antigua:
		
		int posMin = 0;
		for (int i = 0; i < fechas.length; i++) {
			if(fechas[i].isBefore(fechas[posMin])) {
				posMin = i;
			}
		}
		
		System.out.println("La fecha más antigua es " + fechas[posMin]);
	}

}
