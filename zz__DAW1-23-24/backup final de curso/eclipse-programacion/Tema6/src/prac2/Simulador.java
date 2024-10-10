package prac2;

public class Simulador {

	public static void main(String[] args) {

		//Componente comp1 = new Componente(20, 2000);
		
		Componente comp1 = new Diodo(20, 2000, 200);
		
		Diodo dio1 = new Diodo(10, 1000, 100);
		
		Led led1 = new Led(30, 3000, 300, "Verde");
		
		Condensador cond1 = new Condensador(40, 4000, 400);

		Diodo dio2 = new Diodo(1,2,3);
		
		dio2.leeDatos();
		
		System.out.println(dio2.toString());
	}

}
