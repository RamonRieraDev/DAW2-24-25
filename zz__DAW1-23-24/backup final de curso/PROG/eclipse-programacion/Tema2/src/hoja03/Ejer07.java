package hoja03;

public class Ejer07 {

	public static void main(String[] args) {

		int num = 2;

		while (num <= 200) {

			if (num % 20 != 0 && num % 2 == 0) {
				System.out.println(num);
				num = num + 2;
			} else if (num % 20 == 0) {
				System.out.println(num + " - Divisible por 20");
				num = num + 2;
			}
		}

	}

}
