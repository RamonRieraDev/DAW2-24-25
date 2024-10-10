package ejemplo05Vehiculo;

public abstract class Vehiculo {

	private String matricula;
	private String modelo;
	private String marca;
	
	public Vehiculo() {
		
	}
	
	public Vehiculo(String matriula, String marca, String modelo) {
		this.matricula = matriula;
		this.modelo = marca;
		this.marca = modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}