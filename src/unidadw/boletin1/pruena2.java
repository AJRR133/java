package unidadw.boletin1;

import java.util.Scanner;

public class pruena2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Introduce tu edad:");
		int edad = input.nextInt();

		double descuento = 0.0;

		descuento = (edad > 60) ? 0.3 : 0.1;

		System.out.println("Indica el precio del producto:");
		double precio = input.nextInt();

		double p_descuento = precio - precio * descuento;

		System.out.println("El precio final tras es el descuento es: " + p_descuento);

	}
}