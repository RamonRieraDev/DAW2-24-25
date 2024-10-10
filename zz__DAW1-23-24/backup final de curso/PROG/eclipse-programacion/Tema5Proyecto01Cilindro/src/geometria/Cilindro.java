package geometria;

public class Cilindro {

	private int altura;
	private int radio;
	private final double PI = 3.141592;

	// CONSTRUCTORES

	// Constructor implícito.
	public Cilindro() {

	}

	// Constructor explícito que recibe los valores de los atributos
	// altura y radio.
	public Cilindro(int altura, int radio) {

		this.altura = altura;
		this.radio = radio;

	}

	// Calcular área del cilindro.
	public double getArea() {
		return 2 * PI * altura * radio + 2 * PI * radio * radio;
	}

	// Calcular volumen del cilindro.
	public double getVolumen() {
		return PI * radio * radio * altura;
	}

	public String toString() {
		return "Cilindro de altura " + altura + " y radio " + radio;
	}

	// MÉTODOS DE ACCESO (GETTERS Y SETTERS)

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

}
