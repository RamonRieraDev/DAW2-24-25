package prac1;

public class Ogg extends Musica implements Guardable{
	
	private int version;
	
	public boolean Guardar(){
		System.out.println("Guardando.");
		return true;
	}

}
