package ejemplo13CuentaBancaria;

public class CuentaBancaria {

	// ATRIBUTOS:
	private double saldo;

	// CONSTRUCTORES:
	public CuentaBancaria(double saldo) {
		this.saldo = saldo;
	}

	// MÉTODOS:
	public void depositar(double cantidad) {
		saldo = saldo + cantidad;
	}

	public boolean retirar(double cantidad) {
		if (cantidad <= saldo) {
			saldo = saldo - cantidad;
			return true;
		}
		return false;

	}

	public double obtenerSaldo() {
		return saldo;
	}
	
	public void depositar(double cantidad, int comision) {
		saldo = saldo + cantidad - cantidad * comision / 100; 
	}
	
	public boolean retirar(double cantidad, int comision) {
		double cantidadReal = cantidad + cantidad * comision / 100;
		if (cantidadReal <= saldo) {
			saldo = saldo - cantidadReal;
			return true;
		}
		return false;
	}
}
