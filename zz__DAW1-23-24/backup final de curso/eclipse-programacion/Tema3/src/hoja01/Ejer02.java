package hoja01;

public class Ejer02 {

	public static void main(String[] args) {

		String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };

		int i = 0;
		while (i < meses.length) {
			System.out.println((i + 1) + " " + meses[i]);
			i++;
		}

	}

}
