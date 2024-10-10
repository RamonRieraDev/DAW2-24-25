
public class Taller {

	private final int MAX_LAVADORAS = 20;
	private Lavadora[] lavadoras = new Lavadora[MAX_LAVADORAS];

	public void listaLavadoras() {
		String listadoLavadoras = "";
		for (int i = 0; i < lavadoras.length; i++) {
			if (lavadoras[i] != null) {
				listadoLavadoras = listadoLavadoras + lavadoras[i].toString();
			}
		}
		System.out.println(listadoLavadoras);
	}

	public void addLavadora(Lavadora lav) {
		for (int i = 0; i < lavadoras.length; i++) {
			if (lavadoras[i] == null) {
				lavadoras[i] = lav;
				break;
			}
		}
	}

	public int buscaLavadora(int id) {
		for (int i = 0; i < lavadoras.length; i++) {
			if (lavadoras[i] != null && id == lavadoras[i].getId()) {
				return i;
			}
		}
		return -1;
	}

	public void borraLavadora(int id) {
		int pos = buscaLavadora(id);

		if (pos != -1) {
			lavadoras[pos] = null;
		}
	}
}
