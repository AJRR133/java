package unidadw;

import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {
    	HolaMundo r = new HolaMundo();
        r.sumanum();
    }

    int sumanum() {
        int resultado = 0; 
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce una serie de números separados por espacio:");
        String num1 = input.nextLine();

        String[] num11 = num1.split(" ");

        System.out.println("¿Cuántos números quieres sumar?");
        int num2 = input.nextInt();
        
        while (num2 > num11.length) {
            System.out.println("Introduce un número válido (no mayor que la cantidad de números disponibles):");
            num2 = input.nextInt();
        }

        for (int i = 0; i < num2; i++) {
            try {
                int cifranum = Integer.parseInt(num11[i]);
                resultado += cifranum;
            } catch (NumberFormatException e) {
                System.out.println("Error: '" + num11[i] + "' no es un número válido.");
            }
        }

        System.out.println("La suma de los primeros " + num2 + " números es: " + resultado);
        return resultado;
    }
}
