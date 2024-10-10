package ejemplo05Interfaces;

public class Rectangulo implements Figura2D, Mostrable {

	private int base, altura;

	public Rectangulo() {

	}

	public Rectangulo(int base, int altura) {
		this.altura = altura;
		this.base = base;
	}

	@Override
	public void Mostrar() {
		System.out.println("Rectángulo de base " + base + " y altura " + altura);
	}

	@Override
	public double perimetro() {
		return 2 * altura + 2 * base;
	}

	@Override
	public double area() {
		return altura * base;
	}

}
