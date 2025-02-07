package cadenas;

import java.util.Scanner;

public class fichaclase {
	public static void main(String[] args) {
		fichaclase r = new fichaclase();
		String[] palabras = r.cargatabla();
		System.out.println(palabras);
		//r.imprimeTabla(palabras);
		String[] numero = r.filtraNumeros(palabras);
		r.imprimeTabla(numero);
		System.out.println("Termino");
	}

	String[] cargatabla() {
		System.out.println("Introduce tu frase: ");
		Scanner sc = new Scanner(System.in);
		String frase = sc.nextLine();
		String[] tabla = frase.split(" ");
		return tabla;
	}

	void imprimeTabla(String[] tabla) {
		for (String elemento : tabla) {
			System.out.println(elemento);
		}
	}

	String[] filtraNumeros(String[] tabla) {
		{
			String[] numeros = new String[tabla.length];
			for (int i = 0; i < tabla.length; i++)
				;
			{
				// Si tabla[i] es número --> lo guardo
				if (isCadenaEsNumero(tabla[i])) {
					numeros[i] = tabla[i];
				}
			}
			return numeros;
		}
	}

	boolean isCadenaEsNumero(String palabra) {
		boolean es = true;

		for (int i = 0; i < palabra.length(); i++) {
			Character c = palabra.charAt(i); // devuelve el caracter de la posicion 1
			es = es && Character.isDigit(c);

		}
		return es;
	}

	String[] filtraprimeramin(String[] tabla) {
		{
			String[] minuscula = new String[tabla.length];
			for (int i = 0; i < tabla.length; i++)
				;
			{
				// Si tabla[i] es número --> lo guardo
				if (isMinusculaprimeraletra(tabla[i])) {
					minuscula[i] = tabla[i];
				}
			}
			return minuscula;
		}
	}

	boolean isMinusculaprimeraletra(String palabra) {
		boolean esMin = true;
		if (Character.isLowerCase(palabra.charAt(0)))
			esMin = true;
		return esMin;
	}

	boolean comparaTablas(int[] tabla1, int [] tabla2)
	{
		boolean iguales = true ;
		//comparo elemento a elemento si son iguales
		if(tabla1.length != tabla2.length)
		{
			iguales = false;
		}
		else {
			for (int i = 0; i < tabla.length; i++) {
				tabla1[i] == table2[i];
				
			}
				
		}
		
		return iguales;
				
		
	}
	
	
	
	
	
	
}



// ... (resto del código)