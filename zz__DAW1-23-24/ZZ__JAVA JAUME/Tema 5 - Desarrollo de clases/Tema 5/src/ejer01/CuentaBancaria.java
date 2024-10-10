package ejer01;

public class CuentaBancaria {

	// Atributos
	float saldo;

	// Constructor
	CuentaBancaria(float saldo) {
		this.saldo = saldo;
	}

	// Métodos
	void depositar(float cantidad) {
		saldo += cantidad;
	}

	boolean retirar(float cantidad) {
		
		if(cantidad <= saldo) {
			saldo -= cantidad;
			return true;
		}
		return false;
	}

	float obtenerSasldo() {
		return saldo;
	}

	void mostrar() {

		System.out.println("Saldo: " + saldo);
	}
}
