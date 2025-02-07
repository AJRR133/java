package EXAMEN;

import java.util.Iterator;
import java.util.Scanner;



public class rendonejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1 String texto, return textointroducido
		 * 2 String [] separarpalabras, return palabrasseparadas
		 * 2 String comprobar palabras return numpalabrasvocales
		 */
		
		
		Scanner input = new Scanner(System.in);
		rendonejercicio2 r = new rendonejercicio2();
		String texto = r.texto(input);
		String [] resultado = r.separarpalabras(texto);
		int contador = r.comprobarpalabras(resultado);
		
	}

	String texto(Scanner input) {
		System.out.println("Dime las palabras separadas por comas.");
		String textointroducido = input.nextLine();
		return textointroducido;
	}
	
	String [] separarpalabras(String textointroducido) {
		String [] palabrasseparadas = textointroducido.split(",");
		//System.out.println(palabrasseparadas[1]);
		return palabrasseparadas;
	}
	
	int comprobarpalabras(String [] palabrasseparadas) {
		int contador = 0;
		String [] palabras = palabrasseparadas;
		String [] vocales = {"a","e","i","o","u"};
		System.out.println(vocales[1]);
		String vocales1a1 = "";
		for	(int i = 0; i < vocales.length;i++ ) {
			 vocales1a1 = vocales[i];
		
		for(int y = 0; y < palabras.length;y++ ) {
			
			if(palabras[i]==vocales1a1&&palabras[i+1]==vocales1a1) {
				contador = contador+1;
			}
		}}
		//System.out.println("hay "+contador+" palabras con 2 vocales consecutivas");
		return contador;
	}
	
	int vocalesconsecutivas(Scanner input) {
		System.out.println("Dime el num de voales.");
		int textointroducido = input.nextInt();
		return textointroducido;
	}
	
	
}
