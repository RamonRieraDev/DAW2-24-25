
public class Taller {

	// VARIABLES:
	private int MAX_LAVADORAS = 20;
	private Lavadora[] lavadoras = new Lavadora[MAX_LAVADORAS];
	
	// MÉTODOS:
	public String listaLavadoras() {
		String lavadorasTotal = "";
		System.out.println("\n---LISTADO DE LAVADORAS EN STOCK---");
		for (int i = 0; i < lavadoras.length; i++) {
			if(lavadoras[i] !=null) {
			lavadorasTotal = lavadorasTotal + "\n- " + lavadoras[i];
			}
		}
		return lavadorasTotal.toString();
		
	}
	
	public void addLavadora(Lavadora lav) {
		for (int i = 0; i < lavadoras.length; i++) {
			if(lavadoras[i] == null) {
				lavadoras[i] = lav;
				return;
			}
		}
	}
	
	public int buscaLavadora(int id) {
		for (int i = 0; i < lavadoras.length; i++) {
			//System.out.println("i = " + i);
			if(lavadoras[i] != null && lavadoras[i].getId() == id) {
				return i;
			}
		}
		return -1;
	}

	public void borraLavadora(int id) {
		int pos = buscaLavadora(id);
		if(pos != -1) {
			lavadoras[pos] = null;
		}
	}
	
	
	
}
