package entorno;

import java.util.Scanner;

public class DNI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] listadni = { "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
		
		Scanner input = new Scanner(System.in);
		DNI r = new DNI();
		System.out.println(r.letradni(r.posicionletra(input), listadni));
	}
	
	
		int posicionletra(Scanner input) {
			System.out.println("dime el DNI sin letra");
			 int  dni = input.nextInt();
			int posicion = (dni%23);
			 return posicion;
		}
		
		String letradni(int posicion, String [] listadni) {
			String letra = "";
		for (int i = 0; i < listadni.length; i++) {
			if(posicion==i) {
				letra = listadni[i];	
			}
		}
	
		return letra;
		}
		
		
		
}
