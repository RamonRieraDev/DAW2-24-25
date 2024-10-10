
import java.util.Scanner;

public class Ejemplo13 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe un mes del año: ");
		int mes = entrada.nextInt();

		String mensaje;

//		if (mes >= 1 && mes <= 12) {
//
//			System.out.println("Mes correcto");
//
//	} else {
//
//			System.out.println("Mes no válido");
//
//		}
		
		mensaje = (mes >= 1 && mes <= 12) ? "Mes correcto" : "Mes incorrecto";

		System.out.println(mensaje);
	}

}