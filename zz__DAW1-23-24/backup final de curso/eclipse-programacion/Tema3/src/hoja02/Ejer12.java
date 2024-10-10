package hoja02;

public class Ejer12 {

	public static void main(String[] args) {

		int[] numAtom = {8, 2, 10, 20, 12, 71, 15, 23};
		
		int aux = 0;
		int posMin = 0;
		int posMax = 0;
		
		for (int i = 0; i < numAtom.length; i++) {
			System.out.print(numAtom[i] + ", ");
		}
		
		System.out.println();
		
		for (int i = 1; i < numAtom.length; i++) {
			for (int j = 0; j < numAtom.length - 1; j++) {
				
				if (numAtom[j] > numAtom[j + 1]) {
					aux = numAtom[j];
					numAtom[j] = numAtom[j + 1];
					numAtom[j + 1] = aux;
				}
			}
		}
		
		for (int i = 0; i < numAtom.length; i++) {
			System.out.print(numAtom[i] + ", ");
		}
		
		System.out.println();
		
		for (int i = 1; i < numAtom.length; i++) {
			if (numAtom[i] < numAtom[posMin]) {
				posMin = i;
			}
			if (numAtom[i] > numAtom[posMax]) {
				posMax = i;
			}
		}
		System.out.println(numAtom[posMin]);
		System.out.println(numAtom[posMax]);
	}

}
