package geometria;

public class Cilindro {

	// VARIABLES:
	private int altura;
	private int radio;
	private static final double PI = 3.141592;
	
	// CONSTRUCTORES:
	public Cilindro(){
		
	}
	
	public Cilindro(int altura, int radio){
		this.altura = altura;
		this.radio = radio;
	}
	
	// MÉTODOS DE ENTRADA (GET Y SET):
	public int getAltura() {
		return altura;
	}
	
	public void setAltura (int Altura) {
		this.radio = radio;
	}
	
	public int getRadio() {
		return radio;
	}
	
	public void setRadio (int radio) {
		this.altura = altura;
	}
	
	//MÉTODOS:
	public double getArea() {
		return 2 * PI * altura * radio + 2 * PI * radio * radio;
	}
	
	public double getVolumen() {
		return PI * radio * radio * altura;
	}
	
	public String toString() {
		return "El radio del cilindro es de " + radio + " y la altura del cilindro es de " 
	+ altura;
	}
}
