package entorno;

import java.util.Scanner;

public class DNI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] listadni = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","V","W","Y"};
		Scanner input = new Scanner(System.in);
		DNI r = new DNI();
		r.posicionletra(input);
		r.letradni(r.posicionletra(input), listadni);
		System.out.println(r.letradni(r.posicionletra(input), listadni));
	}
	
	
		int posicionletra(Scanner input) {
			 int  dni = input.nextInt();
			int posicion = (dni/23);
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
