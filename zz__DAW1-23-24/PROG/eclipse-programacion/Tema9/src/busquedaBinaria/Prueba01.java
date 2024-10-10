package busquedaBinaria;

public class Prueba01 {

	public static void main(String[] args) {
		
		int[] listaImpar = {1, 2, 3, 4, 5, 6, 7};
		
		int[] listaPar = {1, 2, 3, 4, 5, 6};
		
		int x = 4;
		
		System.out.println(busqueda(listaPar, x));
		
	}
	
	private static int busqueda(int[] n, int x) {
		
		int inicio = 0;
		int fin = n.length - 1;
		int medio;
		
		while(inicio <= fin) {
			medio = (inicio + fin) / 2;
			
			if(n[medio] < x) {
				inicio = medio + 1;
			} else if(n[medio] > x) {
				fin = medio -1;
			} else {
				return medio;
			}
		}
		
		return -1;
		
	}
	
}
