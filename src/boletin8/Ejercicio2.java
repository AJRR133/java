package boletin8;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
		Ejercicio2 r = new Ejercicio2(); 
		int Arboles = r.numarboles(input);
		
		 
	}

	
	int numarboles(Scanner input ) {
		System.out.println("Dime el num de arboles.");
		int arboles = input.nextInt();
		return arboles;
	}
	String[] datosalumnos(int numalumnos, Scanner input) {
        String[] datos = new String[numalumnos]; 

        for (int i = 0; i < numalumnos; i++) {
            System.out.println("Alumno " + (i + 2) + ":");
            System.out.print("Nombre: ");
            String nombre = input.nextLine();
            System.out.print("Nota primer parcial: ");
            double nota1 = input.nextDouble();  // nextDouble(?)
            System.out.print("Nota segundo parcial: ");
            double nota2 = input.nextDouble();
            System.out.print("Nota tercer parcial: ");
            double nota3 = input.nextDouble();
            input.nextLine(); 
            datos[i] = "Alumno: " + nombre + ", Notas: [" + nota1 + ", " + nota2 + ", " + nota3 + "]";
        }

        return datos; 
    }

}


