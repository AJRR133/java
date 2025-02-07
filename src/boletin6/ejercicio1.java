package boletin6;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ejercicio1 r = new ejercicio1();
		r.sumanum();
	}

	
	int sumanum() {
		int resultado = 0; 
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce el primer num:");
		
		String num1 = input.next();
		String[] num11 = num1.split(" ");
		
		System.out.println("Introduce el segundo num:");
		int num2 = input.nextInt();
		
		while (num2 > num11.length) {
			System.out.println("Introduce el segundo num de nuevo:");
			int num = input.nextInt();
			num2 = num;
		}
			
				for (int i = 0; i < num2; i++) {
					while (i <= num2) {
						String cifra = Character.toString(num1.charAt(i));
						int cifranum = Integer.parseInt(cifra) ;
						resultado = resultado + cifranum;
						
					}
				}
			return resultado;	
					
		
	}
}
