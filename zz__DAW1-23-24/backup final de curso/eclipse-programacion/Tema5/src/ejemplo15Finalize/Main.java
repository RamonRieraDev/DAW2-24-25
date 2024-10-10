package ejemplo15Finalize;

public class Main {

	public static void main(String[] args) {

		for (int i = 0; i < 1; i++) {
			// Creamos un objeto coche:
			Coche coche = new Coche("1001DFT", "Seat", "Toledo");
			// Hacemos que coche deje de apuntar al espacio de memoria que ocupaba:
			coche = null;
		}
		
		System.gc();
		
		System.out.println("Fin.");
		
	}

}
