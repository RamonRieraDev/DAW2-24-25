package ejemploRecursividad;

public class Ejemplo01Factorial {

	public static void main(String[] args) {
		
		System.out.println(factorial(31));
		
	}
	
	private static int factorial(int n) {
		if(n<0) {
			System.out.println("Operación imposible.");
			System.exit(0);
		}
		
		if(n==0) {
			return 1;
		}
		
		return n * factorial(n-1);
	}
	
}
