package simulacro2;

import java.util.Scanner;

public class rendon2 {

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("¿Cuántos números quieres introducir?");
	        int total = scanner.nextInt();
	        int[] numeros = new int[total];
	        int[] mayores = new int[total]; 
	        int contador = 0; 

	       
	        for (int i = 0; i < total; i++) {
	            System.out.println("Introduzca un número:");
	            numeros[i] = scanner.nextInt();
	        }

	        
	        for (int i = 3; i < numeros.length; i++) {
	            if (numeros[i] > numeros[i - 1] && numeros[i] > numeros[i - 2] && numeros[i] > numeros[i - 3]) {
	                mayores[contador] = numeros[i]; 
	                contador++;
	            }
	        }

	        
	        System.out.print("Hay " + contador + " números mayores que sus 3 anteriores: ");
	        for (int i = 0; i < contador; i++) {
	            System.out.print(mayores[i]);
	            if (i < contador - 1) {
	                System.out.print(", ");
	            }
	        }
	    }
	}