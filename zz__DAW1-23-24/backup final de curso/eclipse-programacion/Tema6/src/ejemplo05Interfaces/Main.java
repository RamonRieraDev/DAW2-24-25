package ejemplo05Interfaces;

public class Main {

	// Una variable interfaz solo puede crearse si apunta a un objeto de una clase. No se 
	// puede crear como un objeto de una clase.
	public static void main(String[] args) {

		Circulo c1 = new Circulo(10);
		
		Rectangulo r1 = new Rectangulo(5, 7);
		
		// Una variable declarada como de tipo Figura2D puede apuntar a un objeto
		// de una clase que implemtne la interfaz Figura2D
		Figura2D figura1 = c1;
		Figura2D figura2 = r1;

		// Si llamamos al método area() de figura1 estaremos llamando al método de Círculo.
		// Solo podemos llamar a métodos que estén en la interface Figura2D.
		System.out.println("El área de la figura 1 es " + figura1.area());
		
		Figura2D figura3 = new Circulo(30);
		Figura2D figura4 = new Rectangulo(100, 50);
		
		// Se puede con un array porque un array es un objeto ya creado.
		// Podemos crear un array de tipo Figura2D y en sus posiciones podrá haber objetos
		// de cualquier clase que implemente la interfaz FIgura2D.
		Figura2D[] figuras = new Figura2D[10];
		
		figuras[0] = c1;
		figuras[1] = r1;
		
		
	}
	
	// Este método toma un parámetro de tipo Figura2D. Eso significa que le podemos pasar
	// como argumento cualquier objeto de una clase que implement Figura2D como un Círculo
	// o un Rectángulo.
	public static void anyadir(Figura2D figura) {
		
	}

}
