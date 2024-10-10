package ejemplo02Vehiculo;

public class Main {

	public static void main(String[] args) {

		Vehiculo v1 = new Vehiculo("1020GTH", 5, 1000, "Seat", "Toledo", 115);
		
		Coche c1 = new Coche("9121DES", 5, 1200, "Volkswagen", "Golf", 130, 5);
		
		Moto m1 = new Moto("1212DDR", 2, 200, "Derbi", "CBR", 100, false);
		
		System.out.println(v1.toString());
		
		System.out.println("\n" + c1.toString());
		
		System.out.println("\n" + m1.toString());
		
	}

}
