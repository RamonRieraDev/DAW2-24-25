package ejemplo11Persona;

public class Main {

	public static void main(String[] args) {

		Persona persona1 = new Persona("Jaume", "Aguiló Pizà", 22);

		persona1.mostrar();

		Persona persona2 = new Persona("Jaume", "Aguiló Pizà");

		persona2.mostrar();

		Persona persona3 = new Persona("Rubén", "López Martín", 30);

		persona3.mostrar();

	}

}