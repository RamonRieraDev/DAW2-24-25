
public class Ejemplo02 {

	public static void main(String[] args) {
		
		byte edad = 126;
		
		System.out.println(edad);
		// Ponemos los parentesis y el byte porque sino nos da error.
		// Ejemplo de desbordamiento, es decir, llega hasta el 
		// máximo de su capacidad y va al más bajo
		
		edad = (byte) (edad + 1);
		
		System.out.println(edad);
		
		edad = (byte) (edad + 1);
		
		System.out.println(edad);
		
		edad = (byte) (edad + 1);
		
		System.out.println(edad);

	}

}
