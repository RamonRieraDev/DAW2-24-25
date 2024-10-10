package ejemplo05Coche;

public class Main {

	public static void main(String[] args) {

		Coche coche1 = new Coche("2121DEF", "Volkswagen", "Taigo", "Aire acondicionado no funciona", 50000);
		coche1.mostrar();

		Coche coche2 = new Coche("1991HBH", "Seat", "Toledo");
		coche2.mostrar();

	}

}