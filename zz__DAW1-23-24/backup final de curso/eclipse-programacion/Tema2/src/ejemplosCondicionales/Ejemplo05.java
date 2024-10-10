package ejemplosCondicionales;
import java.util.Scanner;

public class Ejemplo05 {

	public static void main(String[] args) {
		
		//Programa que te pregunte en qué color está un semáforo
		//y te diga si tienes que pasar, frenar o frenar si te da tiempo
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("En qué color está el semáforo?");
		
		String color = entrada.nextLine();
		color = color.toLowerCase();
		
		if (color.equals("rojo")) {
			System.out.println("Frenar");
		}else if(color.equals("amarillo")) {
			System.out.println("Frenar si da tiempo");
		}else if (color.equals("verde")){
			System.out.println("Pasar");}
	}

}
