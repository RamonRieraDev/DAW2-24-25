package ejemplo04PolimorfismoVehiculo;

public class Main {

	public static void main(String[] args) {

		Vehiculo vehiculo1 = new Vehiculo("1020GTH", 5, 1000, "Seat", "Toledo", 115);

		Coche coche1 = new Coche("9121DES", 5, 1200, "Volkswagen", "Golf", 130, 5);

		Moto moto1 = new Moto("1212DDR", 2, 200, "Derbi", "CBR", 100, false);

		// Guardamos en vehiculo2 un objeto Coche ya que cualquier coche es un vehículo.
		Vehiculo vehiculo2 = coche1;

		// Guardamos en coche2 un objeto Coche que está dentro de una variable vehículo.
		Coche coche2 = (Coche) vehiculo2;

	}

}
