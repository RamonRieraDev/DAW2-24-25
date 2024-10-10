package ejercicios01;

import java.util.ArrayList;
import java.util.List;

public class Hoja01Ejer01 {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();

		lista.add("Primavera");
		lista.add("Verano");
		lista.add("Otoño");
		lista.add("Invierno");

		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		System.out.println();

		for (String estaciones : lista) {
			System.out.println(estaciones);
		}
	}
}