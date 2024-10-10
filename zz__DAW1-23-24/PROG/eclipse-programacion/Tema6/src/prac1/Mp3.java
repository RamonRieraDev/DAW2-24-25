package prac1;

public class Mp3 extends Musica implements Guardable{

	private int modo;
	
	public boolean Guardar(){
		System.out.println("Guardando.");
		return true;
	}
}
