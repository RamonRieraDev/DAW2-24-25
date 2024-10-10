package ejemplo05;

public class Circulo {
	
	//Atributos
	
	int x;
	int y;
	int radio;
	String color;
	
	// Métodos
	
	void mostrar() {
		
		System.out.println("X vale: " + x);
		System.out.println("Y vale: " + y);
		System.out.println("El radio vale: " + radio);
		System.out.println("Es de color: " + color);

	}
	
	double areaCirculo() {
		
		return (Math.PI * Math.pow(radio, 2));
	}
	
	double perimetroCirculo() {
		
		return (2 * Math.PI * radio);
	}
}
