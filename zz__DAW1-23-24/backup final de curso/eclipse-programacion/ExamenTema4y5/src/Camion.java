import java.util.Iterator;

public class Camion {

	private int numPaquetes;
	private Paquete[] paquetes;

	public Camion(int capacidad) {
		this.paquetes = new Paquete[capacidad];
		this.numPaquetes = 0;
	}

	public void addPaquete(Paquete paquete) {

		if (numPaquetes < paquetes.length) {
			paquetes[numPaquetes] = paquete;
			numPaquetes++;
		}

// Lo que yo hice:
//		for (int i = 0; i < paquetes.length; i++) {
//			if (paquetes[i] == null && numPaquetes == i) {
//				paquetes[i] = paquete;
//				numPaquetes++;
//				return;
//			}
//		}
	}

	public void showPaquetes() {
		System.out.println("\nCarga del camión:");
		for (int i = 0; i < numPaquetes; i++) {
			System.out.println(paquetes[i].toString());
		}

//		Lo que yo hice:		
//		System.out.println("\nCarga del camión:");
//		for (int i = 0; i < paquetes.length; i++) {
//			if (paquetes[i] != null) {
//				System.out.println(paquetes[i].toString());
//			}
//		}
	}

	public int searchPaquete(int codPaquete) {

		for (int i = 0; i < numPaquetes; i++) {

			if (paquetes[i].getCodigo() == codPaquete) {
				return i;
			}
		}
		return -1;

//		Lo que yo hice:
//		for (int i = 0; i < paquetes.length; i++) {
//			if (paquetes[i] != null && paquetes[i].getCodigo() == codPaquete) {
//				return i;
//			}
//		}
//		return -1;
	}

	public void delPaquete(int codPaquete) {

		int pos = searchPaquete(codPaquete);
		
		if (pos != -1) {
			for (int i = pos; i < numPaquetes - 1; i++) {
				paquetes[i] = paquetes[i + 1];
			}
			numPaquetes--;
		}
		System.out.println("Borramos el paquete " + codPaquete);

//		Lo que yo hice:
//		int pos = searchPaquete(codPaquete);
//
//		if (pos != -1) {
//			paquetes[pos] = null;
//		}
//		for (int i = pos; i < paquetes.length; i++) {
//			addPaquete(paquetes[i] = paquetes[i + 1]);
//			return;
//		}

	}

	public void showPaquetes(String ciudad) {
		System.out.println("\nPaquetes destinados a " + ciudad + ":");

		for (int i = 0; i < numPaquetes; i++) {
			if (paquetes[i].getCodigoCiudad().equals(ciudad)) {
				System.out.println(paquetes[i].toString());
			}
		}
		
//		Lo que yo hice:
//		for (int i = 0; i < paquetes.length; i++) {
//
//			if (paquetes[i].getCodigoCiudad() == ciudad) {
//				System.out.println(paquetes[i].toString());
//				break;
//			}
//		}
	}
}
