package hoja02Repaso;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio02 {
// Crea una aplicación que vaya leyendo y guardando en un array las estaturas de 10 personas. A
// continuación, recorrerá el array y nos informará de si alguna de estas estaturas es mayor de 1'90 m.
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		double[] estaturas = new double[3];
		
		boolean estaturaMayor = false;
		
		for (int i = 0; i < estaturas.length; i++) {
			
			System.out.println("Introduce la estatura: ");
			estaturas[i] = entrada.nextDouble();

			if(estaturas[i] >= 1.90) {
				estaturaMayor = true;
			}
		}

		if(estaturaMayor) {
			System.out.println("Se ha encontrado una estatura mayor a 1,90.");
		}else {
			System.out.println("No se ha encontrado una estatura mayor a 1,90.");
		}
		
	}

}
