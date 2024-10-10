package actividadRecursividad;

public class Actividad05 {

	public static void main(String[] args) {

		int num = 5;

		System.out.println("El total de la suma de los números entre 1 y " + num 
				+ " es " + sumaSucesiva(num));
	}

	private static int sumaSucesiva(int num) {

		int resultado = 0;
		int numResultado = 1;
//		for (int i = 1; i <= num; i++) {
//			resultado = resultado + i;
//		}
//		
//		return resultado;

		if (num == 1) {
			// Caso base:
			return 1;
		} else {
			// Caso recursivo:
			resultado = num + sumaSucesiva((num -1));
		}
		return resultado;
	}

}
