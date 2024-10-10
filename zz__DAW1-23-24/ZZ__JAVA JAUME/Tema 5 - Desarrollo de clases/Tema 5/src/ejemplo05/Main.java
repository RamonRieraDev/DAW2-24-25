package ejemplo05;

public class Main {
	
	public static void main(String[] args) {
		
		Circulo c1 = new Circulo();
		
		c1.x = 5;
		c1.y = 2;
		c1.radio = 4;
		c1.color = "Púrpura fuerte";
		
		c1.mostrar();
		
		System.out.println("El área total es: " + c1.areaCirculo());
		
		System.out.println("El perímetro total es: " + c1.perimetroCirculo());
	}

}
