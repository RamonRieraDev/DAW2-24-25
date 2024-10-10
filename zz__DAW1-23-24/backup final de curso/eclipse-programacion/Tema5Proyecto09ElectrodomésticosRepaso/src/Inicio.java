
public class Inicio {

	public static void main(String[] args) {

		Taller t1 = new Taller();
		
		Motor m1 = new Motor(01, "Mitsubishi", "V3");
		Motor m2 = new Motor(02, "Samsung", "A1");
		
		Lavadora l1 = new Lavadora(201, m1, "Balay", 450);
		Lavadora l2 = new Lavadora(202, m2, "Edesa", 410);
		Lavadora l3 = new Lavadora(203, m2, "Teka", 310);
		
		t1.addLavadora(l1);
		t1.addLavadora(l2);
		t1.addLavadora(l3);
		
		t1.listaLavadoras();
		
		System.out.println("La lavadora está en la posición " + t1.buscaLavadora(203) + ".");
		
		t1.borraLavadora(203);
		
		t1.listaLavadoras();

	}

}
