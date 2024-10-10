
public class Lavadora {

	private int id;
	private Motor motor;
	private String marca;
	private float precio;
	private static int iva;
	
	public Lavadora() {
		
	}
	
	public Lavadora(int id, Motor motor, String marca, float precio) {
		this.id = id;
		this.motor = motor;
		this.marca = marca;
		this.precio = precio;
	}
	
	public String toString() {
		return "\nCódigo: " + id + ", Motor: " + motor.getFabricante() + ", Marca: " + ", Precio: " + precio + " €.";
	}
	
	public int getId() {
		return id;
	}
	
}
