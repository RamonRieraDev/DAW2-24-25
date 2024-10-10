package cadenas;

public class Ejer16 {

	public static void main(String[] args) {

		// split() + charAt(0) + upperCase()
		String frase = "Organización mundial salud";
		
		System.out.println("");
		
		String[] palabras = frase.split(" ");
		
		String acronimo = "";
		
		for (int i = 0; i < palabras.length; i++) {
			acronimo = acronimo + palabras[i].charAt(0);
		}
		
		acronimo = acronimo.toUpperCase();
		
		System.out.println("Acrónimo: " + acronimo);
	}

}
