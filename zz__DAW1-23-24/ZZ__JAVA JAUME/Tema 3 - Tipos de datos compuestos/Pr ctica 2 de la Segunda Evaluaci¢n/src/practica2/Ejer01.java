package practica2;

public class Ejer01 {

	public static void main(String[] args) {

		// Declaración de variables.

		String nombre[] = { "María Raquel Puig", "Fran Valcárcerl", "Christian Velasco", 
				"Ceferino Marín", "Andrés Lora", "Trinidad Sans", "Germán Millán", 
				"Noelia Céspedes" };

		String aux;
		int posAleatoria1;
		int posAleatoria2;

		System.out.println("Listado original\n===============================");

		// Mostramos en pantalla la lista desordenada.

		for (int i = 0; i < nombre.length; i++) {

			System.out.println(nombre[i]);
		}

		// Creamos en cada pasada del bucle dos números aleatorios, que luego los
		// designamos a dos variables. Seguidamente intercambiamos los números aleatorios por las
		// posiciones del array.

		for (int i = 0; i < 30; i++) {

			int aleatorio1 = (int) (Math.random() * 8);
			int aleatorio2 = (int) (Math.random() * 8);

			posAleatoria1 = aleatorio1;
			posAleatoria2 = aleatorio2;

			// Seguidamente intercambiamos los números aleatorios por las posiciones del array,
			// es decir, un número aleatorio "A", el cual será una posición del array, lo guardamos
			// en la variable aux, luego en la posición "A" meteros la el valor del número aleatorio 
			//"B" y finalmente introduciremos el valor de "A" en la posición donde estaba valor "B".

			aux = nombre[posAleatoria1];
			nombre[posAleatoria1] = nombre[posAleatoria2];
			nombre[posAleatoria2] = aux;

		}

		System.out.println("\n\nListado aleatorio\n===============================");
		
		//Mostramos en pantalla el array ordenado de forma aleatoria.

		for (int i = 0; i < nombre.length; i++) {

			System.out.println(nombre[i]);
		}

	}

}
