package ejemplosBucles;

import java.util.Scanner;

public class Ejemplo11 {

	public static void main(String[] args) {

		// Aplicación que pregunte al usuario un número entre 1 y 5. 
		// Si responde "3", se le felicitará por haber acertado. 
		// Si no, se le seguirá pidiendo más números.
		
		Scanner entrada = new Scanner(System.in);
		
		int num;
		
		// Una VARIABLE SEMÁFORO es siempre booleana.
		boolean seguirPreguntando = true;
		
		do{
			
			System.out.println("Di un número entre 1 y 5");
			num = entrada.nextInt();
			
			// Cuando se cumpla la condición de parada (num == 3) cambiamos
			// el valor de la varibale semáforo para que la condición del bucle 
			// sea falsa y termine.
			if(num == 3) {
				seguirPreguntando = false;
			}
			
		}while(seguirPreguntando);
		
		System.out.println("Acertaste!");
		
	}

}
