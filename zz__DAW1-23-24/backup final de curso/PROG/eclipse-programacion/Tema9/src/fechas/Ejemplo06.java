package fechas;

import java.time.LocalDate;

public class Ejemplo06 {

	public static void main(String[] args) {

		LocalDate fecha = LocalDate.now();

		System.out.println(fecha.toString());

		System.out.println(fecha(fecha));

	}

	private static String fecha(LocalDate fecha) {

		int anyo = fecha.getYear();
		int mes = fecha.getMonthValue();
		int dia = fecha.getDayOfMonth();

		String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };

		return "Estamos a " + dia + " de " + meses[mes - 1] + " del año " + anyo + ".";
	}

}
