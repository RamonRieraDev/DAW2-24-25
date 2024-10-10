package ejemplo05Vehiculo;

public class Moto extends Vehiculo {

	private int cilindrada;

	public Moto(String matricula, String modelo, String marca, int cilindrada) {
		super(matricula, marca, modelo);
		this.cilindrada = cilindrada;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

}