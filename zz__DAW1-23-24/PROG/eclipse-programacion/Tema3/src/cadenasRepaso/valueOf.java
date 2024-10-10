package cadenasRepaso;

public class valueOf {
	
	public static void main(String[] args) {
		
		String pulgadas = "15";
		int num = Integer.parseInt(pulgadas);
		System.out.println(pulgadas + " " + num);
		
		int num2 = 15;
		String pulgadas2 = String.valueOf(num2);
		System.out.println(pulgadas2 + " " + num2);
	}
}
