package fechas;

import java.time.LocalTime;

public class Ejemplo07 {

	public static void main(String[] args) {

		LocalTime hora = LocalTime.now();
		System.out.println(hora12(hora));

	}

	// Método que devuelve la hora en formato de 12 horas.
	private static String hora12(LocalTime tiempo) {

		int horas = tiempo.getHour();
		int minutos = tiempo.getMinute();

		if (horas > 12) {
			horas = horas - 12;
			return "" + horas + ":" + minutos + " PM";
		} else {
			return "" + horas + ":" + minutos + " AM";
		}
	}

}
