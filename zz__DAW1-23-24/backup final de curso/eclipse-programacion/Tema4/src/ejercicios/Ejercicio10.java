package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {
// Escribe un método que escriba en pantalla el nombre de un mes a partir 
// de su número. En caso de que el número proporcionado no esté entre 
// 1 y 12, deberá terminar inmediatamente.
	public static void main(String[] args) {

		int mesNumero;

		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduce el número del mes:");
		mesNumero = entrada.nextInt();

		encontrarMes(mesNumero);
	}

	static void encontrarMes(int mesNumero) {
		
		String[] mesNombre = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };

		if(mesNumero > 12) {
			return;
		}
		
		if(mesNumero < 0) {
			return;
		}
		
		System.out.println(mesNombre[mesNumero - 1]);
		
	}

}
