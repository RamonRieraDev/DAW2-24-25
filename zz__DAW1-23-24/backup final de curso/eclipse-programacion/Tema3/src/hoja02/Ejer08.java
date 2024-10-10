package hoja02;

public class Ejer08 {

	public static void main(String[] args) {

		int[] hum = {45, 40, 40, 40, 37, 35, 39, 39, 
						45, 50, 55, 60, 65, 70, 70, 75, 
						75, 72, 65, 60, 55, 50, 50, 45};
		
		int humMax = 0;
		int humMin = 0;
		
		for (int i = 0; i < hum.length; i++) {
			
			if(hum[i] < hum[humMin]) {
				humMin = i;
			}
		
			if(hum[i] > hum[humMax]) {
				humMax = i;
			}
			
		}
			
		System.out.println("La humedad relativa mínima ha sido " + hum[humMin] + "% a la hora " + humMin);
		System.out.println("La humedad relativa máxima ha sido " + hum[humMax] + "% a la hora " + humMax);
	}

}
