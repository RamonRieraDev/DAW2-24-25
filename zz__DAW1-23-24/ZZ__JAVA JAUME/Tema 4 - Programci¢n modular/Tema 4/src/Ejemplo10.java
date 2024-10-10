
public class Ejemplo10 {

	public static void main(String[] args) {

		int lista[] = { 6, 5, 3, 8, 11, 1 };
		int num = 6;

		dobleNum(num);
		dobleArray(lista);

	}

	static void dobleNum(int num) {
		System.out.println(num * 2);
	}

	// Va a mulitplicar cada valor del array por dos.
	static void dobleArray(int lista[]) {

		for (int i = 0; i < lista.length; i++) {

			lista[i] *= 2;
		}

	}

}
