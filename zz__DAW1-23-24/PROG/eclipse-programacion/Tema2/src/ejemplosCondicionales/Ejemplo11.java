package ejemplosCondicionales;
import java.util.Scanner;

public class Ejemplo11 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Cuál es tu temperatura corporal?");
		float temp = entrada.nextFloat();

		String diagnostico;

//		if (temp <= 36.5) {
//			diagnostico = "Sano como una manzana.";
//		} else {
//			diagnostico = "Tiene fiebre.";
//		}
		
		diagnostico = (temp <= 36.5) ? "Sano como una manzana." : "Tiene fiebre.";
				
		System.out.println("Diagnóstico: " + diagnostico);

	}

}
