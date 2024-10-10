package repaso;

import java.io.File;
import java.util.Scanner;

public class R4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe una ristra de capretas y te la crearé en tu carpeta personal...");
		
		String ristraCarpetas = sc.nextLine();
		
		String rutaCarpetaPersonal = System.getProperty("user.home");
		
		File nuevaCarpeta = new File(rutaCarpetaPersonal + "/" + ristraCarpetas);
		
		System.out.println("se va a crear la carpeta: " + rutaCarpetaPersonal + "/" + ristraCarpetas);
		
		boolean resultado = nuevaCarpeta.mkdirs();
		
		if(resultado) {
			System.out.println("Ok");
		} else {
			System.out.println("No se ha podido.");
		}

	}

}
