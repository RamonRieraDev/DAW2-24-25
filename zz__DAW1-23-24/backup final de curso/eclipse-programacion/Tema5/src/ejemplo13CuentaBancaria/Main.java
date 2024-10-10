package ejemplo13CuentaBancaria;

public class Main {

	public static void main(String[] args) {

		CuentaBancaria cuenta1 = new CuentaBancaria(1000);
		System.out.println(cuenta1.obtenerSaldo());

		cuenta1.depositar(200);
		System.out.println(cuenta1.obtenerSaldo());
		
		boolean resultado = cuenta1.retirar(100);
		if (!resultado) {
			System.out.println("No se ha podido hacer la retirada");
		}
		System.out.println("Se ha podido hacer la retirada. Saldo acutal " + cuenta1.obtenerSaldo());

		resultado = cuenta1.retirar(5000);
		if (!resultado) {
			System.out.println("No se ha podido hacer la retirada");
		}
		System.out.println("Se ha podido hacer la retirada. Saldo acutal " + cuenta1.obtenerSaldo());
	
		cuenta1.depositar(100, 10);
	
		System.out.println("Se ha podido hacer la retirada. Saldo acutal " + cuenta1.obtenerSaldo());

		resultado = cuenta1.retirar(100, 5);
		if (!resultado) {
			System.out.println("No se ha podido hacer la retirada");
		}
		System.out.println("Se ha podido hacer la retirada. Saldo acutal " + cuenta1.obtenerSaldo());
	
	}

}
