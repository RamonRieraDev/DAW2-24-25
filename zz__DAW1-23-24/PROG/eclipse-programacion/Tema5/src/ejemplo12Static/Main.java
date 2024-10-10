package ejemplo12Static;

public class Main {

	public static void main(String[] args) {
		
		// Antes de poner static en la clase Unidades:
		
		Unidades unidades = new Unidades();
		System.out.println("El número pi es " + unidades.PI + ".");

		Unidades centilitros = new Unidades();
		System.out.println("50 cl son " + 50 * unidades.centilitros + " litros.");

		Unidades quilometros = new Unidades();
		System.out.println("2,5 km son " + 2.5 * unidades.quilometros + " metros.");
		
		
		// Después de poner static en la clase Unidades:
		
		// El atributo PI es estático. No es necesario crear un objeto de la clase
		// Unidades para luego acceder a PI desde él.
		// Podemos acceder a PI simplemente poniendo el nombre de la clase (Unidades) delante.
		System.out.println("El número pi es " + unidades.PI + ".");

		// Igualmente podemos acceder al atributo estático centilitros anteponiendo el nombre
		// de la clase (Unidades)
		System.out.println("50 cl son " + 50 * unidades.centilitros + " litros.");

		// Igualmente podemos acceder al atributo estático quilometros anteponiendo el nombre
		// de la clase (Unidades)
		System.out.println("2,5 km son " + 2.5 * unidades.quilometros + " metros.");
		
		// Comprobamos que al cambiar el atributo PI en un objeto, cambia en cualquier otro
		// objeto de la clase. Esto se debe a que PI es un atributo estático. 
		Unidades u1 = new Unidades();
		Unidades u2 = new Unidades();

		u1.PI = 3.1416;
		
		// Al haber cambiado u1.PI ha cambiado también u2.PI. 
		System.out.println(u2.PI);

		// La forma correcta de acceder a atributos estáticos en poniendo delante el nombre
		// de la clase para evitar malentendidos.
		Unidades.PI = 3.1416;
	
	}

}
