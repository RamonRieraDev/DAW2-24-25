package cadenasRepaso;

public class Ejercicio05 {
// Programa que lee una frase y nos dice por cuántas palabras está formada.
	public static void main(String[] args) {

		String frase = "Más vale pájaro en mano.";
		
		int palabras = 1;
		
		for (int i = 0; i < frase.length(); i++) {
			
			if (frase.charAt(i) == ' ') {
				palabras++;
			}
			
		}
		System.out.println("La frase tiene " + palabras + " palabras.");
	}

}
