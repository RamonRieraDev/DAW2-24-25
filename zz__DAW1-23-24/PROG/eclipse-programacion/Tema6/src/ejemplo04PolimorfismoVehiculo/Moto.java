package ejemplo04PolimorfismoVehiculo;

public class Moto extends Vehiculo {

	private boolean baul;

	public Moto(String matricula, int capacidad, double peso, String marca, String modelo, int potencia, boolean baul) {

		super(matricula, capacidad, peso, marca, modelo, potencia);
		this.baul = baul;

	}

	@Override
	public String toString() {
		// Alternativa
//		String respuesta;
//		if (baul == true) {
//			respuesta = "Sí";
//		} else {
//			respuesta = "No";
//		}

		String respuesta = baul ? "Sí" : "No";

		return super.toString() + "\nBaul: " + respuesta;
	}

}
