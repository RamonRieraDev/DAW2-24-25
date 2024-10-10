package taller;

import auxiliar.Lavadora;


public class Taller {
	
	//Atributos
	private final int MAX_LAVADORAS;
	private Lavadora[] lavadoras;
	private int numLavadoras = 0;
	
	public Taller(int capacidad) {
		MAX_LAVADORAS = capacidad;
		lavadoras = new Lavadora[MAX_LAVADORAS];
	}

	
	public void listaLavadora() {
		System.out.println("\nListado de lavadoras");
		System.out.println("================================");
		for (int i = 0; i < lavadoras.length; i++) {

			if (lavadoras[i] != null) {
				System.out.println(" - " + lavadoras[i].toString());
			}
		}
	}
	
	public void addLavadora(Lavadora lav) {
		
		for (int i = 0; i < lavadoras.length; i++) {

			if (lavadoras[i] == null) {
				lavadoras[i] = lav;
				numLavadoras++;
				break;
			}
		}
	}
	
	public int buscaLavadora(int id) {
		for (int i = 0; i < lavadoras.length; i++) {

			if (lavadoras[i] != null && lavadoras[i].getId() == id) {
				return i;
			}
		}

		return -1;
	}
	
	public void borraLavadora(int id) {
		int pos = buscaLavadora(id);

		if (pos != -1) {
			lavadoras[pos] = null;
			numLavadoras--;
		}
	}

	public Lavadora[] getLavadoras() {
		return lavadoras;
	}

	public void setLavadoras(Lavadora[] lavadoras) {
		this.lavadoras = lavadoras;
	}

	public int getNumLavadoras() {
		return numLavadoras;
	}

	public void setNumLavadoras(int numLavadoras) {
		this.numLavadoras = numLavadoras;
	}

	public int getMAX_LAVADORAS() {
		return MAX_LAVADORAS;
	}
	
}
