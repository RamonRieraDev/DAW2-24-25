
public class Ejemplo05 {

	public static void main(String[] args) {
		
		// Operaciones relacionales
		
		int a = 5, b = 10;
		
		boolean resultado;
				
		resultado = (a==b);
		System.out.println("a==b:" + resultado);
				
		resultado = (a!=b); //A diferente de B.
		System.out.println("a!=b:" + resultado);
				
		resultado = (a<b); 
		System.out.println("a<b:" + resultado);
				
		resultado = (a<=b); 
		System.out.println("a<=b:" + resultado);

		
		//El uso habitual de los operadores relacionales 
		//es con instrucciones condicioneales
		
		if (a <= b) {
			System.out.println("a es menor o igual que b");
			
		}
	}

}
