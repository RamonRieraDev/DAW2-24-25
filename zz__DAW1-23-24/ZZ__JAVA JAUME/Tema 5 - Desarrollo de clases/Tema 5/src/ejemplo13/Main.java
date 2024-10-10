package ejemplo13;

public class Main {

	public static void main(String[] args) {

		Circulo c1 = new Circulo();

		c1.mostrar();
		
		Circulo c4 = new Circulo("Púrpura");
		
		c4.mostrar();

		Circulo c2 = new Circulo(10);

		c2.mostrar();

		Circulo c3 = new Circulo(10, 20, 5, "Azul");

		c3.mostrar();



	}

}