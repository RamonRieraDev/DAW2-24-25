package ejercicios;

public class Ejercicio02 {
//	 Modifica el programa anterior para que en lugar de escribir nada en pantalla, devuelva el String
//	 "Hola, nombre, no parece que tengas edad años".

	public static void main(String[] args) {

		System.out.println(edadPersona("Paco", 32));

	}

	static String edadPersona(String nombre, int edad) {

		return "Hola, " + nombre + ", no parece que tengas " + edad + " años";

	}
}
