package hoja01;

public class Ejer13 {

	public static void main(String[] args) {

		int i = 0;
		double resultado = 0;
		int [] potencias = new int[20];
		
		while (i <= potencias.length) {

			resultado = Math.pow(2, i);
			System.out.println(2 + " elevado a " + i + " es: " + resultado);
			i++;
		}
		
	}

}
