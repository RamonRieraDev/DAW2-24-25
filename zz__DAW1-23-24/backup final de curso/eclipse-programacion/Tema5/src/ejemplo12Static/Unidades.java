package ejemplo12Static;

public class Unidades {

	// Los siguientes atributos estáticos. Esto hace que tengan el mismo valor para cualquier
	// objeto de la clase Unidades.
	
	static double PI = 3.141593;

	// Factor de conversión de quilómetros a metros
	static double quilometros = 1000;

	// Factor de conversión de centilitros a litros.
	static double centilitros = 0.01;
	
	// El siguiente método es estático. Eso significa que podemos llamarlo desde el nombre
	// de la clase sin necesidad de crear un objeto previamente.
	public static double areaCirculo(double radio) {
		return PI * radio * radio;
	}

}
