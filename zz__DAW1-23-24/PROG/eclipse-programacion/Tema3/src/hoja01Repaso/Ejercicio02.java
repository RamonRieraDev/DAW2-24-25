package hoja01Repaso;

public class Ejercicio02 {
// Crea un array de Strings llamado meses cuyos valores sean los nombres de los doce meses del
// año. Haz que después se muestren todos los valores mediante un bucle while.
	public static void main(String[] args) {

		String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
						"Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		
		int i = 0;
		
		while (i < meses.length) {
			
			System.out.println(meses[i]);
			i++;
			
		}

	}

}
