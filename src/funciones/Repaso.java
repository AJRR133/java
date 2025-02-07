package funciones;

import java.util.Scanner;

public class Repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Cuantos  numeros quieres introducir");
		int resultado = input.nextInt();
		System.out.println(resultado);
		Repaso r = new Repaso();
		r.sumanumpar(resultado,input);
	}

	int sumanumpar(int numaconsiderar, Scanner input) {
		int numsumado = 0;
		for (int i = 1; i < numaconsiderar; i++) {
			Scanner input = new Scanner(System.in);
			System.out.println("dame 1 numero");
			int numveces = input.nextInt();
			if (numveces % 2 == 0) {
				numsumado = numsumado + numveces;
			}
			return numsumado;
		}

	}
}