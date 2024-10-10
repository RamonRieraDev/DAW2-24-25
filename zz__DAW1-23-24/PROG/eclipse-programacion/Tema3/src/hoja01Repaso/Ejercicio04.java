package hoja01Repaso;

public class Ejercicio04 {
// Crea un array llamado companyeros con 4 posiciones y ve asignando a cada una de ellas el
// nombre de uno de los cuatro compañeros más cercanos a tu sitio. Haz que después se muestren
// todos los valores mediante un bucle for.

	public static void main(String[] args) {

		String[][] companeros = {{"1", "Ramon"}, {"2", "Agustín"}, {"3", "Margarita"}, {"4", "Tatiana"}};
		
		System.out.printf("%-3s %-18s\n", "Núm", "Nombre");
		System.out.printf("%-3s %-18s\n", "===", "==================");
		for (int i = 0; i < companeros.length; i++) {
			System.out.printf("%-3s %-18s\n", companeros[i][0], companeros[i][1]);
		}
	}

}
