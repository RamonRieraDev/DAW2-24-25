package ejemploRecursividad;

public class Ejemplo02Fibonacci {

	public static void main(String[] args) {
		
		System.out.println(fibonacci(5));
		
	}
	
	private static int fibonacci(int n) {
		
		System.out.println("Fibonacci(" + n + ")");
		if(n>1) {
			// Caso recursivo:
			return fibonacci(n-1) + fibonacci(n-2);
		} else {
			// Caso base:
			return 1;
		}
	}
}
