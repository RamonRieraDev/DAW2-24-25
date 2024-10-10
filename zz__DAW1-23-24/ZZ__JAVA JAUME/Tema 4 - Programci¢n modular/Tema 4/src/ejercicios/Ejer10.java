package ejercicios;

import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Dime el número de un mes: ");
		int mes = entrada.nextInt();

		calcularMes(mes);

		System.out.println(calcularMes(mes));
	}

	static String calcularMes(int numero) {
		String mes;
		if (numero == 1) {
			mes = "Enero.";
			return mes;
		} else if (numero == 2) {
			mes = "Febreo.";
			return mes;
		} else if (numero == 3) {
			mes = "Marzo.";
			return mes;
		} else if (numero == 4) {
			mes = "Abril.";
			return mes;
		} else if (numero == 5) {
			mes = "Mayo.";
			return mes;
		} else if (numero == 6) {
			mes = "Junio.";
			return mes;
		} else if (numero == 7) {
			mes = "Julio.";
			return mes;
		} else if (numero == 8) {
			mes = "Agosto.";
			return mes;
		} else if (numero == 9) {
			mes = "Septiembre.";
			return mes;
		} else if (numero == 10) {
			mes = "Octubre.";
			return mes;
		} else if (numero == 11) {
			mes = "Noviembre.";
			return mes;
		} else if (numero == 12) {
			mes = "Diciembre.";
			return mes;
		} else {
			mes = "Te has equivocado de número.";
			return mes;
		}

	}

}
