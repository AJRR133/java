package funciones;

import java.util.Scanner;

public class Pruebafun1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pruebafun1 variable1 = new Pruebafun1();
		int resultado = variable1.sumanum(4, 7);
    		System.out.println(resultado);

		String[] tablanombres = variable1.generalista();
		for (int i = 0; i < tablanombres.length; i++) { 
			System.out.println(tablanombres[i]);
		}

	}

	int sumanum(int num1, int num2) {

		return num1 + num2;
	}

	String[] generalista() {
		String[] lista = new String[5];
		int contador = 0;
		while (contador < 5) {

			Scanner input = new Scanner(System.in);
			System.out.println("Introduce el nombre para añadirlo a la lista");
			String añadirlista = input.next();
			lista[contador] = añadirlista;
			contador++;

		}
		return lista;
	}

}

