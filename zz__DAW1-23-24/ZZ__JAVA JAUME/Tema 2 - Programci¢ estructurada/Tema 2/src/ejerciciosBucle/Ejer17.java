package ejerciciosBucle;

public class Ejer17 {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			
			System.out.println("\nTabla del " + i + ".");
			System.out.println("=============");
			
			for (int j = 0; j <= 10; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
		}
	}

}
