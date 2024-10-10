package ejemplo16;

public class Punto {

	// Atributos
	int x;
	int y;
	String color;

	// Constructores
	Punto() {

	}

	// Da x e y con el valor 0
	Punto(String color) {
		this(0, 0, color);
	}

	// Da el valor color "Negro"
	Punto(int x, int y) {
		this(x, y, "Negro");
	}

	Punto(int x, int y, String color) {

		this.x = x;
		this.y = y;
		this.color = color;
	}

	// Métodos
	void mostrar() {

		System.out.println("\nDatos:\n=========");
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println("Color: " + color);
	}

	//Método desplazar esta sobrecargado porque hay varias versiones con distintos
	//parámetros (distinta firma).
	void desplazar(int dx) {

		x = x + dx;
	}
	
	void desplazar(int dx, int dy) {
		
		x = x + dx;
		y = y + dy;
	}
}
