package ejemplo04Persona;

public class Empleado extends Persona {
	
	private String numSegSocial;
	
	public Empleado(String dni, String nombre, String apellidos, String numSegSocial) {
		super(dni, nombre, apellidos);
		this.numSegSocial = numSegSocial;
	}
	
	public void mostrar() {
		System.out.println("Datos del cliente.");
		System.out.println("DNI: " + getDni());
		System.out.println("Apellidos: " + getApellidos());
		System.out.println("Nombre: " + getNombre());
		System.out.println("Número Seguridad Social: " + numSegSocial);
	}

}