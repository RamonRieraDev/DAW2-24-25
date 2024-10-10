package ejemplo01Persona;

public class Main {

	public static void main(String[] args) {

//		Persona p1 = new Persona("López Martínez", "Juan", "10100100Y");
//		p1.mostrar();
		
		Cliente cliente1 = new Cliente("Pérez Ortiz", "Rubén", "10200200R", "9012-1211-1732-1230");
		cliente1.mostrar();
		
		Empleado emple1 = new Empleado("Riera Jover", "Ramon", "20100100T", 23233434);
		emple1.mostrar();
		

		Directivo d1 = new Directivo("Rodríguez", "Miguel", "10102020R", 51, 200);
		d1.mostrar();
		
	}

}
