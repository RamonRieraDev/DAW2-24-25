package cadenasEjemplos;

public class Ejemplo07 {

	public static void main(String[] args) {

		double pulgadasTv = 15.6;
		
		// Método 1:
		String pulgadas = String.valueOf(pulgadasTv);
		
		// Método 2:
		String pulgadas2 = "" + pulgadasTv;
		
		System.out.println("El tamaño del monitor es de " + pulgadas + " pulgadas");

		System.out.println("El tamaño del monitor es de " + pulgadas2 + " pulgadas");
	
	}
}
