package cadenasRepaso;

public class Ejercicio16 {
//  Leer una frase y generar su acrónimo (primera letra, en mayúsculas, de cada frase).
	public static void main(String[] args) {

		String frase = "Organización Mundial Salud";

		String[] palabras = frase.split(" ");
		
		for (int i = 0; i < palabras.length; i++) {
			
			System.out.print(palabras[i].charAt(0));
		}

	}

}
