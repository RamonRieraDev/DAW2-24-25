package ejercicios03;

import java.util.Scanner;

public class Ejer06 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		float salarios[] = new float[10];

		System.out.println("Salarios de los empleados" + "\n=====================");

		for (int i = 0; i < salarios.length; i++) {
			System.out.print("Empleado nº " + (i + 1) + ":");
			salarios[i] = entrada.nextFloat();
		}

		int posMin = 0;
		int posMax = 0;
		float total = 0;
		int contadorEmpleados = 0;

		for (int i = 0; i < salarios.length; i++) {

			if (salarios[i] < salarios[posMin]) {
				posMin = i;
			}

			if (salarios[i] > salarios[posMax]) {
				posMax = i;
			}
			
			if(salarios[i] > 1500) {
				contadorEmpleados++;
			}
			total += salarios[i];
						
		}
		System.out.println();
		System.out.println("El salario mínimo es de: " + salarios[posMin] + "€");
		System.out.println("El salario máximo es de: " + salarios[posMax] + "€");
		System.out.println("La cantidad de salario medio es de: " 
		+ (total/salarios.length) + "€");
		System.out.println("La cantidad de trabajadores ganan más de 1500€ es de: " 
		+ contadorEmpleados + ".");


	}

}
