
package ejemplo04;

public class Punto {

	//Atributos
	int x;
	int y;
	String color;
	
	//Métodos
	
	void mostrar() {
		
		System.out.println("x vale: " + x);
		System.out.println("y vale: " + y);
		System.out.println("El color es: " + color);
		
	}
	
	void desplazar(int dx) {
		
		x += dx;
		
	}

}
