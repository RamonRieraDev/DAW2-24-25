package ejercicios01;

public class Ejer03 {

	public static void main(String[] args) {

		float densidades[] = { 5.4F, 5.2F, 5.5F, 3.9F, 1.3F, 0.7F, 1.3F, 1.6F };

		System.out.println("Densidades de los ocho planetas del sistema solar (más cercano al Sol a más lejano):");

		for (int i = 0; i < densidades.length; i++) {

			System.out.println(densidades[i]);
		}

	}
}
