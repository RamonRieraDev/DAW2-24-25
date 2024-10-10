package ejemplo02Vehiculo;

public class Coche extends Vehiculo {

	private int puertas;
	
	public Coche(String matricula, int capacidad, double peso, String marca, String modelo, int potencia, int puertas) {
		
		super(matricula, capacidad, peso, marca, modelo, potencia);
		this.puertas = puertas;
		
	}
	
	@Override
	public String toString() {

//		String salida = super.toString();
//		
//		salida = salida + 
//		return salida;

		return super.toString() + "\nPuertas: " + puertas;
	}

}
