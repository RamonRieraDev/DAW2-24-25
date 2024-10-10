package hoja02;

import java.util.Scanner;

public class Ejer06 {

public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int contador = 0;
		
		
		while (contador < 200) {
			System.out.println(contador);
			
			contador = contador + 2; //También como: contador += 2;
		}

	}

}
