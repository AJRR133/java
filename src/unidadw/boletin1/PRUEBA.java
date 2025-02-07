package unidadw.boletin1;
import java.util.Scanner; 
public class PRUEBA {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("dime el texto a introducir");
        String total = scanner.nextLine();
        String[] numeros =  total.split(total);
        String[] mayores = total.split(total);
        int contador = 0; 

       
       // for (int i = 0; i < total.length(); i++) {
        //    System.out.println("Introduzca un número:");
        //    numeros[i] = scanner.nextInt();
       // }

        
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
