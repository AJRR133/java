package entorno;

import java.util.Random;
import java.util.Scanner;

public class Piedrapapeltijera {

	public static void main(String args[]) {
		Scanner Input = new Scanner(System.in);

		Random random = new Random();
		int numrival = random.nextInt(3) + 1;

		System.out.print("Indique su seleccion [1=Piedra, 2=Papel, 3=Tijera]: ");
		int seleccionUsuario = Input.nextInt();

		System.out.print("el rivla escogio:");
		switch (numrival) {
		case 1:
			System.out.println("Piedra");
			switch (seleccionUsuario) {
			case 1:
				System.out.println("Empate!");
				break;
			case 2:
				System.out.println("has ganado!");
				break;
			case 3:
				System.out.println("el rival gana");
				break;
			}
			break;

		case 2:
			System.out.println("Papel");
			switch (seleccionUsuario) {
			case 1:
				System.out.println("el rival gana");
				break;
			case 2:
				System.out.println("Empate!");
				break;
			case 3:
				System.out.println("has ganado!");
				break;
			}
			break;

		case 3:
			System.out.println("Tijera");
			switch (seleccionUsuario) {
			case 1:
				System.out.println("has ganado!");
				break;
			case 2:
				System.out.println("el rival gana");
				break;
			case 3:
				System.out.println("Empate!");
				break;
			}
			break;
		}
	}
}