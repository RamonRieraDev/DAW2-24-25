package ejercicios03;

public class Ejer02 {

	public static void main(String[] args) {
		
		double cotizaciones[] = {47.5, 47.8, 48, 48.1, 47.7, 47.3, 46, 47.9, 48.05, 48.7};
	
		int posMin = 0;
		int posMax = 0;
		
		for(int i = 0; i < cotizaciones.length; i++) {
			
			if(cotizaciones[i] < cotizaciones[posMin]) {
				posMin = i;
			}
			
			if(cotizaciones[i] > cotizaciones[posMax]) {
				posMax = i;
			}
		}
		
		System.out.println("El valor máximo es de: " + cotizaciones[posMax]);
		System.out.println("El valor mínimo es de: " + cotizaciones[posMin]);
	}
	
}
