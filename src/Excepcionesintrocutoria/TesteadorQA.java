package Excepcionesintrocutoria;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteadorQA {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingresa un número entero: ");
	        try {
	        int numero = scanner.nextInt(); 
	        System.out.println("Detras del input");
	        }
	        catch (InputMismatchException e) 
	        {
	        	System.out.println("entro en el catch");
	        }
	        finally {
	        	System.out.println("pase lo que pase");
	        }
	       /* System.out.print("Ingresa otro número para dividir: ");
	        
	        int divisor = scanner.nextInt(); 
	        
	        int
	        resultado = numero / divisor;

	        System.out.println("El resultado de la división es: " + resultado);

	        scanner.close();*/
	    }
	}