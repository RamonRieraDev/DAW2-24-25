package hoja01;

public class Ejer16 {

	public static void main(String[] args) {

		double temperatura[] = { 15, 16.1, 16, 15.4, 15, 14, 10.2, 11, 
				11.5, 10, 10.1, 9.8, 9, 6 };

		double media = 0;

		double suma = 0;

		int i = 0;

		int temperaturasAltas = 0;
		
		for (i = 0; i < temperatura.length; i++) {
			suma = suma + temperatura[i];
			
			if(temperatura[i] > 12) {
				temperaturasAltas++;
			}
		}
		media = suma / temperatura.length;
		System.out.println("La media de temperatura de " + i + " termómetros es: " + media);

		System.out.println("He contado " + temperaturasAltas + " temperaturas "
				+ "mayores de 12 ºC");
	}
}
