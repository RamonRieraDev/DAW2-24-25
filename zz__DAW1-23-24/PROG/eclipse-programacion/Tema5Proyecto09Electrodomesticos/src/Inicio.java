
public class Inicio {

	public static void main(String[] args) {
	
		Motor motor1 = new Motor(01, "Mitsubishi", "V3");
		
		Motor motor2 = new Motor(02, "Samsung", "A1");
		
		Lavadora lavadora1 = new Lavadora(201, motor1, "Balay", 450);
		
		Lavadora lavadora2 = new Lavadora(202, motor2, "Edesa", 410);
		
		System.out.println(lavadora1.toString());
		
		System.out.println(lavadora2.toString());
		
		Taller taller1 = new Taller();
		
		taller1.addLavadora(lavadora1);
		
		taller1.addLavadora(lavadora2);
		
		System.out.println(taller1.listaLavadoras());
		
		taller1.borraLavadora(201);
		
		System.out.println(taller1.listaLavadoras());
		
		
	}


	
}
