package ejemplo15Mates;

public class Main {

	public static void main(String[] args) {

		//Los atributos PI y E son estáticos, lo que significa que se podrán
		// usar poniendo delante el nombre de la clase (por ejemplo, Mates.PI).
		System.out.println("El número pi es " + Mates.PI);
		System.out.println("El número e vale " + Mates.E);

		//El método pow() es estático, lo que siginifica que se podrá usar poniendo
		//delante el nombre de la clase (por ejemplo, Mates.pow(2, 5)).
		Mates mat = new Mates();
		mat.num = 20;

		Mates mat2 = new Mates();
		mat2.num = 30;

		System.out.println("mat = " + mat.num);
		
		System.out.println(Mates.pow(2, 5));

	}

}