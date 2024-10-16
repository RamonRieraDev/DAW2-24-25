package lavadora;

import motor.Motor;

public class Lavadora {

	// Atributos
	private int id;
	private Motor motor;
	private String marca;
	private float precio;
	private int iva = 21;

	public Lavadora(int id, Motor motor, String marca, float precio) {

		this.id = id;
		this.motor = motor;
		this.marca = marca;
		this.precio = precio;
	}

	public String toString() {

		return "Código: " + id + ", Motor: " + motor + ", Marca: " + marca + ", Precio: "
				+ (precio + (iva / 100 * precio));
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}
}
