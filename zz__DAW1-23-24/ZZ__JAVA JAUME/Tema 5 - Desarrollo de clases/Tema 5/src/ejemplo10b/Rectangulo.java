package ejemplo10b;

public class Rectangulo {

	// Atributos
	// Coordenadas del vértice inferior izquierdo
	int x;
	int y;
	int base;
	int altura;
	String color;
	
	// Constructor
	
	Rectangulo(){
		//Esta vacío
	}

	Rectangulo(int x, int y, int base, int altura) {

		this.x = x;
		this.y = y;
		this.base = base;
		this.altura = altura;
		this.color = "Negro";
		
	}
	
	// Constructor
	Rectangulo(int x, int y, int base, int altura, String color) {

		this.x = x;
		this.y = y;
		this.base = base;
		this.altura = altura;
		this.color = color;
	}

	// Métodos
	void mostrar() {

		System.out.println("X: " + x);
		System.out.println("Y: " + y);
		System.out.println("Base: " + base);
		System.out.println("Altura: " + altura);
		System.out.println("Color: " + color);

	}

	int area() {

		return base * altura;

	}

	int perimetro() {

		return base * 2 + altura * 2;

	}

	// Desplaza el rectángulo dx píxeles a la derecha y
	// dy píxeles hacia arriba.
	void desplazar(int dx, int dy) {
		x = x + dx;
		y = y + dy;
	}

	// Devuelve true si el punto (a,b) está dentro del
	// rectángulo, y false si no lo está.
	boolean estaDentro(int a, int b) {

		if (a >= x && a <= (x + base) && b >= y && b <= (y + altura)) {
			return true;
		}

		return false;

	}

}