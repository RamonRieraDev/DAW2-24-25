package cadenas;

public class Ejer11 {

	public static void main(String[] args) {

		String frase = "Al que madruga Dios le ayuda.";

		int posEspacio = frase.indexOf(" ");

		int posEspacioSiguiente = frase.indexOf(" ", posEspacio + 1);

		if (posEspacio != -1) {
			System.out.println(frase.substring(0, posEspacio));
		}
		
		while (true){

			System.out.println("posEspacio = " + posEspacio);
			System.out.println("posEspacioSiguiente = " + posEspacioSiguiente);
			
			posEspacioSiguiente = frase.indexOf(" " + posEspacio + 1);
			
			if (posEspacioSiguiente != -1) {
				System.out.println(frase.substring(posEspacio + 1, posEspacioSiguiente));
				
			} else {
				System.out.println(frase.substring(posEspacio + 1));
				break;
			}
			posEspacio = posEspacioSiguiente;
			
		}
	}
}
