package practica02;

import java.util.Scanner;

public class Actividad01 {
//	Escribe una aplicación que solicite los nombres y edades de los pacientes
//	de una consulta médica.
//	El programa irá solicitando los datos hasta llegar a los diez pacientes o
//	hasta que el usuario pulse Intro cuando se le pida el nombre del siguiente
//	paciente. Los datos se guardarán en un array bidimensional llamado
//	pacientes.
//	Una vez leídos los datos, se mostrarán en forma de tabla. En esta tabla la columna de nombres
//	tendrá un ancho de 20 caracteres.
//	Por último, el programa nos informará de cuántos pacientes hay, su edad media (con dos decimales)
//	y cuántos jubilados (mayores de 65 años) hay.

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String[][] pacientes = new String[10][2];

		System.out.println("#### DATOS PACIENTES ####\n");
		System.out.println("Introduce el nombre y la edad de hasta 10 pacientes:\n");

		int totalPacientes = 0;

		int jubilado = 0;

		double edadTotal = 0;

		// Introducir nombres y edad:
		for (int i = 0; i < pacientes.length; i++) {

			System.out.println("Nombre (máximo 20 caracteres): ");
			pacientes[i][0] = entrada.nextLine();

			if (pacientes[i][0].equals("")) {
				pacientes[i][1] = "";
				break;
			}

			System.out.println("Edad: ");
			pacientes[i][1] = entrada.nextLine();

			totalPacientes++;

			if (Double.parseDouble(pacientes[i][1]) > 65) {
				jubilado++;
			}

			edadTotal = edadTotal + (Double.parseDouble(pacientes[i][1]));

		}
		
		// Mostrar lista:
		System.out.println("#### LISTADO DE PACIENTES ####\n");
		System.out.printf("%-20s %4s\n", "Nombre", "Edad");
		System.out.printf("%-20s %4s\n", "====================", "====");
		for (int fila = 0; fila < pacientes.length; fila++) {

			System.out.printf("%-20s %-4s\n", pacientes[fila][0], pacientes[fila][1]);
			if (pacientes[fila][0].equals("")) {
				break;
			}
		}

		System.out.println("#### RESULTADO DEL ANÁLISIS ####\n");
		
		System.out.println("Se han introducido datos de " + totalPacientes + " pacientes.");
	
		System.out.println("La media de edad de los pacientes es " 
		+ Math.round((edadTotal / totalPacientes)  * 100) / 100.0 + " años.");
		
		System.out.println("Hay " + jubilado + " pacientes jubilados.");

	}
}
