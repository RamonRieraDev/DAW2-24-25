package hoja01Repaso;

public class Ejercicio03 {
// Crea un array llamado densidades con las densidades (en g/cm3) de los nueve (sí, nueve)
// planetas del Sistema Solar. Haz que después se muestren todos los valores mediante un bucle for.
//	VARIACIÓN PARA PRACTICAR EL PRINTF !!!!
	public static void main(String[] args) {

		String[][] planetasOrden = { { "1", "Mercurio" }, { "2", "Venus" }, { "3", "Tierra" }, { "4", "Marte" },
				{ "5", "Júpiter" }, { "6", "Saturno" }, { "7", "Urano" }, { "8", "Neptuno" } };

		System.out.printf("%-8s %-12s\n", "Número", "Planeta");
		System.out.printf("%-8s %-12s\n", "======", "============");

		for (int i = 0; i < planetasOrden.length; i++) {

			System.out.printf("%-8s %-12s\n", planetasOrden[i][0], planetasOrden[i][1]);
		}
	}

}
