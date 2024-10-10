package prac2;

public abstract class Componente {
	
	private double intensidadMaxima;
	private double longitud;
	
	public Componente(double intensidadMaxima, double longitud) {
		
		this.intensidadMaxima = intensidadMaxima;
		this.longitud = longitud;
	
	}
	
	public abstract void conectar();

	public void setIntensidadMaxima(double intensidadMaxima) {
		this.intensidadMaxima = intensidadMaxima;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public double getIntensidadMaxima() {
		return intensidadMaxima;
	}

	public double getLongitud() {
		return longitud;
	}

	
}
