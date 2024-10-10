package practica01;

import java.util.Scanner;

public class Actividad03 {
//	Crea un programa que te pida un texto largo y te lo muestre limitando la
//	longitud de las líneas a 80 caracteres de ancho. Este ancho de línea estará
//	codificado en una constante llamada ANCHO_LINEA, de forma que si se
//	cambia el valor de esta constante, el programa seguirá funcionando bien.

	public static void main(String[] args) {
//
//		Scanner scanner = new Scanner(System.in);
//
//		int ANCHO_LINEA = 80;
//		int anchoOriginal = 0;
//
//		System.out.println("#### CONSOLA ALTERNATIVA #### \n");
//		System.out.println("Escribe un texto largo y te lo mostraré limitando la longitud de las líneas a "
//				+ ANCHO_LINEA + " caracteres. \n");
//		System.out.println("Texto: \n");
//		String texto = scanner.nextLine();
//
//		System.out.println("\nTexto con líneas de " + ANCHO_LINEA + " caracteres: \n");
//		for (int i = 0; i < texto.length(); i++) {
//
//			System.out.print(texto.charAt(i));
//			anchoOriginal++;
//
//			if (anchoOriginal == ANCHO_LINEA) {
//				System.out.println();
//				anchoOriginal = 0;
//			}
//		}
		
		Scanner entrada = new Scanner(System.in);
		
		int ANCHO_LINEA = 80;
		int inicio = 0;

		String frase = "Se utiliza principalmente del lado del cliente, implementado como parte de un navegador web permitiendo mejoras en la interfaz de usuario y páginas web dinámicas3​ y JavaScript del lado del servidor (Server-side JavaScript o SSJS). Su uso en aplicaciones externas a la web, por ejemplo en documentos PDF, aplicaciones de escritorio (mayoritariamente widgets) es también significativo.";
		
		while(frase.substring(inicio).length() > ANCHO_LINEA) {
			
			System.out.println(frase.substring(inicio, inicio + ANCHO_LINEA));
			inicio = inicio + ANCHO_LINEA;
		}
		System.out.println(frase.substring(inicio));
	}
}
