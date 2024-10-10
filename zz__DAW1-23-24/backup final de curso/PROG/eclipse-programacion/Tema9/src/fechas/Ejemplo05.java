package fechas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ejemplo05 {

	public static void main(String[] args) {

		// Array con la estructura:
		// Hora | paciente
		String[][] citas = { { "08:20", "Álex Cáceres" }, { "08:40", "Agustín Riera" }, { "08:50", "Joel Álvaro" },
				{ "08:10", "Daniel Sims" }, { "09:00", "Juan López" }, };

		// Buscar la primera cita de la mañana:
		LocalTime hora;
		int min = 0;
		for (int i = 0; i < citas.length; i++) {
			hora = LocalTime.parse(citas[i][0]);
			if (hora.isBefore(LocalTime.parse(citas[min][0]))) {
				min = i;
			}
		}
		System.out.println(citas[min][0].toString() + "\n");

		// Ordenar array:
		String aux;
		
		for (int i = 0; i < citas.length; i++) {
			min = i;
			for (int j = i + 1; j < citas.length; j++) {
				hora = LocalTime.parse(citas[j][0]);
				if (hora.isBefore(LocalTime.parse(citas[min][0]))) {
					min = j;
				}
				
			}
			aux = citas[i][0];
			citas[i][0] = citas[min][0];
			citas[min][0] = aux;

		}
		for (int i = 0; i < citas.length; i++) {
			System.out.println(citas[i][0].toString() + " - "+ citas[i][1].toString());
		}
	}

}
