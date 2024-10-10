package ejemplosRepaso;

public class Ejemplo06 {

	public static void main(String[] args) {

		multiplicar(2);
		
	}
	
	static void multiplicar(int n) {
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " * " + i + " = " + n * i);	
		}
		
		
	}
	
}