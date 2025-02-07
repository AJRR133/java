package boletin_tablasç;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = { 1, 3, 4, 7 };

		Scanner input = new Scanner(System.in);

		System.out.println("Introduce el num para buscarlo:");
		int buscar = input.nextInt();
		for (int pos = 0; pos < numeros.length; pos++) {
			while (!buscar && ) 
			if (buscar == numeros[pos]) {

				System.out.println("el numero introducido estara en la pos" + pos);
			} else {
				if (buscar > numeros[pos]) {
					System.out.println("el numero introducido estara en la pos -" + pos);
				} else {
					if (buscar < numeros[pos-1]) {
						
						System.out.println("el numero introducido estara en la pos -" + pos);

					}
				}
			}
		}
	}
}
