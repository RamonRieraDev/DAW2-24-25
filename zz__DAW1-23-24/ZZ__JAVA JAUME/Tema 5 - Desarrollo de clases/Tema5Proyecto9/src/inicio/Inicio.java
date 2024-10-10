package inicio;

import auxiliar.Lavadora;
import auxiliar.Motor;
import taller.Taller;

public class Inicio {

	public static void main(String[] args) {
		
		//Pedir los datos necesarios para crear un objeto
		//Lavadora y añadirlo al taller.
			
		Lavadora lavadora01 = new Lavadora();
		lavadora01.leeLavadora();
		
		System.out.println(lavadora01.toString());
		

//		Motor motor1 = new Motor(001, "Siemens", "V12");
//		Motor motor2 = new Motor(002, "Nestle", "V8");
//
//		Lavadora lavadora1 = new Lavadora(001, motor1, "Balay", 100);
//		System.out.println(lavadora1.toString());
//
//		Lavadora lavadora2 = new Lavadora(002, motor1, "Nivea", 400);
//		System.out.println(lavadora2.toString());
//
//		Lavadora lavadora3 = new Lavadora(003, motor2, "Bosch", 350);
//		System.out.println(lavadora3.toString());
//		
//		Lavadora.setIva(21);
//
//		
//		Taller taller = new Taller(20);
//		taller.addLavadora(lavadora1);
//		taller.addLavadora(lavadora2);
//		taller.addLavadora(lavadora3);
//		System.out.println("Hay " + taller.getNumLavadoras() + " lavadoras en el taller.");
//		
//		taller.borraLavadora(002);
//		System.out.println("\nEliminamos la lavadora con el ID " + lavadora2.getId());
//		System.out.println("Hay " + taller.getNumLavadoras() + " lavadoras en el taller.");
//
//		
//		System.out.println("\nBuscamos la lavadora con el ID " + lavadora3.getId());
//		System.out.println("Está en la posición " + taller.buscaLavadora(003));
//		
//		System.out.println("\nBuscamos la lavadora con el ID " + lavadora2.getId());
//		System.out.println("Está en la posición " + taller.buscaLavadora(002));
//		
//		taller.listaLavadora();
	}

}
