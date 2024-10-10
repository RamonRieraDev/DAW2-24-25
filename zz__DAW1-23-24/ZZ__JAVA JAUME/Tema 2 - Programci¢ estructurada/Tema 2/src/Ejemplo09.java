
import java.util.Scanner;

public class Ejemplo09 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Escribe en número de aula: ");
		int aula = entrada.nextInt();

		// aula 1 -> Primero de grado superior
		// aula 2 -> Segundo de grado superior
		// aula 3 -> Primero de grado medio
		// aula 4 -> Segundo de grado medio
		
		//Hacer shortcut para inhabilitar todo el código si borrarlo
		//Ctrl + Shift + C
		
		//Versión usando el if-else if

//		if (aula == 1) {
//			System.out.println("Primero de grado superior.");
//		} else if (aula == 2) {
//			System.out.println("Segundo de grado superior.");
//		} else if (aula == 3) {
//			System.out.println("Primero de grado medio.");
//		} else if (aula == 4) {
//			System.out.println("Segundo de grado medio.");
//		} else {
//			System.out.println("Número incorrecto.");
//		}
		
		//Versión usando el Switch

		switch(aula) {
		
		case 1:
			System.out.println("Primero de grado superior.");
			break;
			
		case 2:
			System.out.println("Segundo de grado superior.");
			break;
		case 3:
			System.out.println("Primero de grado medio.");
			break;
		case 4:
			System.out.println("Segundo de grado medio.");
			break;
		default:
			System.out.println("Ese aula no existe.");
				
			
			
		}
		
		
		
		
	}

}
