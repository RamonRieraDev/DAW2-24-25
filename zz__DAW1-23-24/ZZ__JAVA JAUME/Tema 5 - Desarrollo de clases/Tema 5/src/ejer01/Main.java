package ejer01;

public class Main {

	public static void main(String[] args) {

		CuentaBancaria c1 = new CuentaBancaria(1000);

		System.out.println("Saldo: " + c1.obtenerSasldo() + "€.");

		c1.depositar(500);

		System.out.println("Saldo: " + c1.obtenerSasldo() + "€.");

		if(c1.retirar(200)) {
			System.out.println("Saldo: " + c1.obtenerSasldo() + "€.");
		} else {
			System.out.println("No hay fondos suficientes.");
		}

	}

}
