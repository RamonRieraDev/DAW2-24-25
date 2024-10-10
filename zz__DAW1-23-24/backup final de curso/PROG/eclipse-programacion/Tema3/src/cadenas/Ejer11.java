package cadenas;

public class Ejer11 {
// Programa que lee una frase y luego muestra las palabras sueltas (una en cada línea)
	
	public static void main(String[] args) {

		String frase = "Al que madruga Dios le ayuda.";

		int posEspacio = frase.indexOf(" ");
		int inicio = 0;

		int posEspacioSiguiente = frase.indexOf(" ", posEspacio + 1);

//		if (posEspacio != -1) {
//			System.out.println(frase.substring(0, posEspacio));
//		}
		
		while (posEspacio != -1){

			// System.out.println("posEspacio = " + posEspacio);
			// System.out.println("posEspacioSiguiente = " + posEspacioSiguiente);
			
			posEspacioSiguiente = frase.indexOf(" " + posEspacio + 1);
			
			posEspacio = posEspacioSiguiente + 1;
				System.out.println(frase.substring(posEspacio + 1, posEspacioSiguiente));
			  
				System.out.println(frase.substring(posEspacio + 1));
		}
	}
}
