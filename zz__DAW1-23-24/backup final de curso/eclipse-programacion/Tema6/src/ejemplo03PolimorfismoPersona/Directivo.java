package ejemplo03PolimorfismoPersona;

public class Directivo extends Empleado{

	private int bonus;
	
	// CONSTRUCTOR:
	public Directivo(String apellidos, String nombre, String dni, int codEmpleado, int bonus) {
		super(apellidos, nombre, dni, codEmpleado);
		this.bonus = bonus;
	}
	
	@Override
	public void mostrar() {
		System.out.println("\n" + getNombre() + " " + getApellidos() + ", con DNI " + getDni() + ".");
		System.out.println("\nCódigo de empleado: " + getCodEmpleado());
		System.out.println("Bonus: " + bonus);
	}
	
}
