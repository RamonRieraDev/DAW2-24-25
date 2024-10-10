
public class Ejemplo09 {

	public static void main(String[] args) {

		// Constantes: no pueden cambiar de valor una vez que han sido
		// inicializadas.

		final float PI = 3.1416F; // la F al final y la palabra final al
		// principio lo convierte en constante solo para floats

		final boolean APTO = false;
		final String SALUDO = "Estimado Sr/a: ";
		final float GRAVEDAD_TIERRA = 9.8F;
		final float IVA = 21;
		final double TEMPERATURA_DESEADA_CAMARA = -20;
		final double TEMPERATURA_EBULLICON_AGUA = 100;
		
		System.out.println("La temperatura de ebullición del agua es: " + TEMPERATURA_EBULLICON_AGUA + " ºC.");
		System.out.println("El compresor de la cámara frigorífica funcionará mientras no se alcance la temperatura de " + TEMPERATURA_DESEADA_CAMARA + " ºC.");
		System.out.println("La gravedad de la tierra es de: " + GRAVEDAD_TIERRA + " m/s.");
		
		
	}

}
