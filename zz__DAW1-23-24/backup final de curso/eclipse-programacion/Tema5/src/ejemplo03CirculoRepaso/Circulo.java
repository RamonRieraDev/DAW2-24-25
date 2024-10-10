package ejemplo03CirculoRepaso;

public class Circulo {

	// Constante PI:
	final double PI = 3.141593;

	// Coordenadas x, y del círculo:
	double x;
	double y;

	// Radio del círculo:
	double radio;

	// Constructor implícito:
	Circulo() {

	}

	// Constructor explícito que recibe los valores de todos los atributos:
	Circulo(double x, double y, double radio) {
		this.x = x;
		this.y = y;
		this.radio = radio;
	}

	// Constructor explícito que recibe solo el valor del radio:
	Circulo(double radio) {
		this.radio = radio;
	}

	// Calcular área. Devuelve el área del círculo:
	double area() {
		return PI * radio * radio;
	}

	// Calcular perimetro. Devuelve el perímetro o longitud del círculo:
	double perimetro() {
		return 2 * PI * radio;
	}
}
