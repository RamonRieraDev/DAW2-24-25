package ejemplo03Circulo;

public class Circulo {

	// Constante PI:
	final double PI = 3.141593;

	// Coordenadas x, y del círculo:
	double x;
	double y;

	// Radio del círculo:
	double radio;

	// Calcular área. Devuelve el área del círculo:
	double area() {
		return PI * radio * radio;
	}

	// Calcular perimetro. Devuelve el perímetro o longitud del círculo:
	double perimetro() {
		return 2 * PI * radio;
	}
	
	
}
