package ejemploMap;

public class Ficha {

	// Atributos:
	private int anyoNacimiento;
	private String nacionalidad;
	private String visa;
	
	// Constructor:
	public Ficha(int anyoNacimiento, String nacionalidad, String visa) {
		this.anyoNacimiento = anyoNacimiento;
		this.nacionalidad = nacionalidad;
		this.visa = visa;
	}
	
	// Métodos:
		public String toString() {
			return "\nAño de nacimiento: " + anyoNacimiento + 
					"\nNacionalidad: " + nacionalidad + 
					"\nVISA: " + visa; 
		}
		
	// getters y setters:
	public int getAnyoNacimiento() {
		return anyoNacimiento;
	}
	public void setAnyoNacimiento(int anyoNacimiento) {
		this.anyoNacimiento = anyoNacimiento;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public String getVisa() {
		return visa;
	}
	public void setVisa(String visa) {
		this.visa = visa;
	}
}
