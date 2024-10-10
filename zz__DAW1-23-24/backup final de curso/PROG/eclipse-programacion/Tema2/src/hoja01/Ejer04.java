package hoja01;

import java.util.Scanner;

public class Ejer04 {

//	public static void main(String[] args) {
//		Scanner entrada = new Scanner(System.in);
//		double password1;
//		double password2 = 1234;
//		boolean resultado = true;
//		System.out.println("Introducir contraseña: ");
//		password1 = entrada.nextDouble();
//		if (resultado = password1 == password2) {
//			System.out.println("La contraseña es correcta.");
//		} else {
//			System.out.println("La contraseña es incorrecta.");
//		}
//	}
	
	/*public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double password1;
		
		double password2 = 1234;
		
		System.out.println("Introducir contraseña: ");
		password1 = entrada.nextDouble();
		if (password1 == password2) {
			System.out.println("La contraseña es correcta.");
		} else {
			System.out.println("La contraseña es incorrecta.");
		}
	}*/

public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String password1;
		String clave = "1234";
		System.out.println("Introducir contraseña: ");
		password1 = entrada.nextLine();

		if (password1.equals(clave)){
			System.out.println("La contraseña es correcta.");
		} else {
			System.out.println("La contraseña es incorrecta.");
		}
	}

}
	

