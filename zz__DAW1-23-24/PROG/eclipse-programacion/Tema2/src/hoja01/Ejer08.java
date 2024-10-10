package hoja01;

import java.util.Scanner;

public class Ejer08 {

	public static void main(String[] args) {
		
		System.out.println("¿Cómo se dice ordenador en inglés?");
		
		Scanner pregIn = new Scanner(System.in);
		String preg = pregIn.nextLine();
		String resp = "computer";
		
		//Pasamos palabra a minúsculas:
		preg = preg.toLowerCase(); //Ahora da igual si se escribe en may. o en min.
		
		if (preg.equals(resp)) {
			System.out.println("Felicidades, es correcto");
		}else {
			System.out.println("Lo sentimos, es incorrecto.");
		}
		
		pregIn.close();

	}

}
