package hoja01Repaso;

public class Ejercicio01 {
// Crea un array de Strings llamado estaciones cuyos valores sean los nombres de las cuatro
// estaciones del año. Haz que después se muestren todos los valores mediante un bucle for
	public static void main(String[] args) {

		String[] estaciones = {"Invierno", "Otoño", "Primavera", "Verano"};
		
		for (int i = 0; i < estaciones.length; i++) {
			System.out.println(estaciones[i]);
		}

	}

}
