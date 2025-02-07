package unidadw.boletin1;

import java.util.Scanner;

public class prueba4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir el número de renos y la longitud de la pista
        System.out.print("Introduce el número de renos: ");
        int numeroRenos = scanner.nextInt();
        
        System.out.print("Introduce la longitud de la pista: ");
        int longitudPista = scanner.nextInt();
        
        // Crear una tabla que guardará las posiciones de los renos
        int[] tablaCarrera = new int[numeroRenos];
        
        // Pedir la posición de cada reno
        for (int i = 0; i < numeroRenos; i++) {
            System.out.print("Introduce la posición del reno " + (i + 1) + ": ");
            tablaCarrera[i] = scanner.nextInt();
        }

        // Mostrar el progreso de cada reno
        for (int i = 0; i < numeroRenos; i++) {
            imprimirPista(tablaCarrera[i], longitudPista, i + 1);
        }

        scanner.close();
    }

    // Función para imprimir la pista de un reno
    public static void imprimirPista(int posicion, int longitudPista, int numeroReno) {
        StringBuilder pista = new StringBuilder();
        
        // Recorrer cada posición de la pista
        for (int i = 0; i <= longitudPista; i++) {
            // Si la posición es la del reno, poner 'R'
            if (i == posicion) {
                pista.append("R");
            } else {
                // Los extremos de la pista siempre son 'e'
                if (i == 0 || i == longitudPista) {
                    pista.append("e");
                } else {
                    pista.append(" ");  // Espacio vacío en el resto
                }
            }
        }
        
        // Imprimir la pista del reno con su número
        System.out.println("Carril " + numeroReno + ": " + pista.toString());
    }
}


}
