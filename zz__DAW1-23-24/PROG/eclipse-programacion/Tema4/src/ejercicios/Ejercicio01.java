package ejercicios;

public class Ejercicio01 {
//	Escribe un método que reciba dos parámetros: el nombre de una persona y su edad. Deberá
//	mostrar por pantalla la frase "Hola, nombre, no parece que tengas edad años".
	
	public static void main(String[] args) {

		edadPersona("Paco", 32);

	}

	static void edadPersona (String nombre, int edad) {
		
		System.out.println("Hola, " + nombre + ", no parece que tengas " + edad + " años");
		
	}
	
}
