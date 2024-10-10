package hoja02;

public class Ejer05 {

	public static void main(String[] args) {

		double[] temperatura = {15, 16.1, 16, 15.4, 15, 14, 10.2,
								11, 11.5, 10, 10.1, 9.8, 9, 6};
		
		int posMin = 0;
		int posMax = 0;
		
		for (int i = 1; i < temperatura.length; i++) {
			if (temperatura[i] < temperatura[posMin]) {
				posMin = i;
			}
			if (temperatura[i] > temperatura[posMax]) {
				posMax = i;
			}
		}
		System.out.println("La temperatura mínima es: " + temperatura[posMin] + " en la "
				+ "posición " + posMin);
		
		System.out.println("La temperatura mínima es: " + temperatura[posMax] + " en la "
				+ "posición " + posMax);
	}

}
