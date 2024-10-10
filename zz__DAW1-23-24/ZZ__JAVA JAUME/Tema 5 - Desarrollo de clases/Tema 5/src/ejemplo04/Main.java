package ejemplo04;

public class Main {

	public static void main(String[] args) {

		Punto p1 = new Punto();

		p1.x = 2;
		p1.y = 5;
		p1.color = "Azul";

		p1.mostrar();

		Punto p2 = new Punto();

		p2.x = 2;
		p2.y = 2;
		p2.color = "Verde";

		Punto p3 = new Punto();

		p3.x = 5;
		p3.y = 5;
		p3.color = "Rojo";

		//Desplazamos el punto 2, 10 píxeles a la derecha
		
		p2.desplazar(10);
		p2.mostrar();

	}

}