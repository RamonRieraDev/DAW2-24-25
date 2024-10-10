package ejemplo03Circulo;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		Circulo circulo1 = new Circulo();
		
		circulo1.x = 0;
		circulo1.y = 0;
		circulo1.radio = 15;
		
		System.out.println("El radio del circulo 1 es " + circulo1.radio);
		System.out.println("El área del circulo 1 es " + circulo1.area());
		System.out.println("El perímetro del circulo es 1 " + circulo1.perimetro());
		
		System.out.println("");
		
		Circulo circulo2 = new Circulo();
		
		// Creamos un nuevo círculo y le preguntamos al usuario sus propiedades.
		System.out.print("Escribe la coordenada X aquí: ");
		circulo2.x = entrada.nextDouble();
		
		System.out.print("Escribe la coordenada Y aquí: ");
		circulo2.y = entrada.nextDouble();
		
		System.out.print("Escribe el radio aquí: ");
		circulo2.radio = entrada.nextDouble();
		
		System.out.println("");
		
		System.out.println("El radio del circulo 2 es " + circulo2.radio);
		System.out.println("El área del circulo 2 es " + circulo2.area());
		System.out.println("El perímetro del circulo 2 es  " + circulo2.perimetro());
		
		
		

	}

}
