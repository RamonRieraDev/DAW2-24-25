package actividadRecursividad;

public class Actividad04 {

	public static void main(String[] args) {
		
		int num = 24;
		int numRestas = 0;
		
		System.out.println("El número " + num + " se puede restar de 6 sucesivamente "
				+ contarRestas(num, numRestas) + " veces."
				);
		
	}
	
	private static int contarRestas(int num, int numRestas) {
		
		
		
//		while (num >= 6) {
//			num = num - 6;
//			numRestas++;
//		}
		
		if (num >= 6) {
			return contarRestas(num - 6, numRestas + 1);
		} else {
			return numRestas;
		}
		
	
		
	}
	
}
