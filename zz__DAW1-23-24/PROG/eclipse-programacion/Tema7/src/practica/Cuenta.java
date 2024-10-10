package practica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cuenta {

	// ATRIBUTOS:

	CajaRegistradora caja;

	public final String ENCABEZADO_CUENTA = "CAFETERÍA SON FERRER\nC/ Cóndor, 9\nSon Ferrer,"
			+ "Calvià\n------------------------------------------------\n";

	private String[][] articulos;

	private int numArticulos = 0;

	// MÉTODOS:

	// Constructor - Contiene el máximo de artículos que son los que contiene el
	// array:
	public Cuenta(int maxArticulos) {

		// Inicializo el array de tres columnas con el número de filas que nos pase el constructor
		// en la clase CajaRegistradora().
		articulos = new String[maxArticulos][3];

	};

	// MÉTODOS:

	// Método para añadir cada artículo:
	public void addArticulo(String nombre, String precio, String unidades) {

		// Si hay espacio en el array añade nombre, precio y unidades por fila.
		if (hayEspacio()) {
			articulos[numArticulos][0] = nombre;
			articulos[numArticulos][2] = precio;
			articulos[numArticulos][1] = unidades;
			numArticulos++;
		}

	}

	// Método que comprueba si hay o no espacio en el array:
	public boolean hayEspacio() {

		// Compruebo si el número de artículos que nos ha pasado el 
		// constructor en la clase CajaRegistradora() es menor que la cantidad de filas del array
		// y así evitar provocar un ArrayIndexOutOfBoundsException.

		// Lo que siempre hago:
//		if(numArticulos < articulos.length) {
//			return true;
//		} else {
//			return false;
//		}

		// Esto vale? Me ha gustado por ser más sencillo:
		return numArticulos < articulos.length;

	}

	// Método que devuelve el listado de artículos metidos en el array:
	public String listadoArticulos() {

		String listado = "";

		// Si el array está vacío solo aparecerá el encabezado de la cuenta.
		if (articulos == null) {
			return ENCABEZADO_CUENTA + "\n"
					+ String.format("%-25s %4s %8s %8s\n", "DESCRIPCIÓN", "UDS.", "PRE./UD.", "TOTAL(€)")
					+ String.format("%-25s %4s %8s %8s\n", "-------------------------", "----", "--------", "--------");
		} else {

			// Si hay elementos en el array los introduzco dentro del atributo listado. También hago los 
			// cálculos para los totales de la cuarta columna de la cuenta:
			for (int i = 0; i < numArticulos; i++) {
				// Redondeo el resultado para evitar muchos decimales y quedarme solo con dos.
				double totalDouble = redondear(
						Double.parseDouble(articulos[i][1]) * Double.parseDouble(articulos[i][2]));
				String totalString = String.valueOf(totalDouble);
				// Si el nombre del artículo es mayor o igual a 25 solo se aparecerán los 25 primeros caracteres:
				if (articulos[i][0].length() >= 25) {
					listado = listado + String.format("%-25s %4s %8s %8s\n", articulos[i][0].substring(0, 25),
							articulos[i][2], articulos[i][1], totalString);
				} else {
					// Si no, aparecerá el nombre del  artículo completo:
					listado = listado + String.format("%-25s %4s %8s %8s\n", articulos[i][0], articulos[i][2],
							articulos[i][1], totalString);
				}
			}

			// Devuelvo el encabezado más todo lo anterior con la variable listado:
			return ENCABEZADO_CUENTA + "\n"
					+ String.format("%-25s %4s %8s %8s\n", "DESCRIPCIÓN", "UDS.", "PRE./UD.", "TOTAL(€)")
					+ String.format("%-25s %4s %8s %8s\n", "-------------------------", "----", "--------", "--------")
					+ listado;
		}

	}

	// Método que devuelve un string con el total a pagar:
	public String totales() {

		double totalDouble = 0;

		// Si no hay elementos en el array quiere decir que no hay artículos a pagar.
		// Por eso, lo indico:
		if (articulos == null) {
			return "NO HAY ARTÍCULOS A PAGAR";
		}

		// Calculo las unidades por el precio de cada artículo de toda la cuenta:
		for (int i = 0; i < numArticulos; i++) {
			totalDouble = totalDouble + Double.parseDouble(articulos[i][1]) * Double.parseDouble(articulos[i][2]);
		}

		final int IVA = 10;

		// Variable con el total a pagar de toda la cuenta con el iva incluido:
		double aPagar = totalDouble / IVA + totalDouble;

		// Devuelvo la cadena con el total a pagar de toda la cuenta sin el IVA, después con el IVA desglosado también
		// y, por último, el bruto a pagar con el IVA incluido.
		return "\nA PAGAR\n" + "----------------------------------" + "\n  *  Total: "
				+ String.valueOf(redondear(totalDouble)) + " €" + "\n  *  IVA: "
				+ String.valueOf(redondear(totalDouble / IVA)) + " €" + "\n  *  A pagar: "
				+ String.valueOf(redondear(aPagar)) + " €";
	}

	// Método para reinicializar la clase CajaRegisgradora() y así resetear todo
	// para nuevos pedidos.
	public void resetear() {

		caja = new CajaRegistradora();

	}

	// Método para redondear números con decimales a 2 decimales:
	private double redondear(double numero) {

		return numero = Math.round(numero * 100) / 100.0;

	}

	// Método main:
	public static void main(String[] args) {

		Cuenta cuenta = new Cuenta(0);

	}

}
