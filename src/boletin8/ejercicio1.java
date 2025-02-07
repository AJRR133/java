package boletin8;

import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] gruposalumnos = { 25, 28, 31, 29 };
        Scanner input = new Scanner(System.in);

        ejercicio1 r = new ejercicio1();
        
        // con esto se llama a la funcion que nos indica el grupo
        char gruposeleccionado = r.definirgrupos(input);
        
        // segun elgrupo seleccionado se saca cuantos alumnos hay en cada uno 
        int numAlumnos = r.alumnoporgrupo(gruposeleccionado, gruposalumnos);
        
        // PEDIMOS LOS DATOS DE LOS ALUMNOS 
        String[] datos = r.datosalumnos(numAlumnos, input);

        // se imprime por pantalla los datos de los alumnos
        for (String dato : datos) {
            System.out.println(dato);
        }
    }

    char definirgrupos(Scanner input) {
        System.out.println("Dime la letra del grupo (A/B/C/D)");
        char gruposeleccionado = input.next().charAt(0);
        if (gruposeleccionado != 'A' && gruposeleccionado != 'B' && gruposeleccionado != 'C'
                && gruposeleccionado != 'D') {
            System.out.println("Grupo no válido.");
        }

        return gruposeleccionado;
    }

    int alumnoporgrupo(char gruposeleccionado, int[] gruposalumnos) {
        int numalumnos = 0;
        switch (gruposeleccionado) {
            case 'A':
                numalumnos = gruposalumnos[0];
                break;
            case 'B':
                numalumnos = gruposalumnos[1];
                break;
            case 'C':
                numalumnos = gruposalumnos[2];
                break;
            case 'D':
                numalumnos = gruposalumnos[3];
                break;
        }
        return numalumnos;
    }

    String[] datosalumnos(int numalumnos, Scanner input) {
        String[] datos = new String[numalumnos]; 

        for (int i = 0; i < numalumnos; i++) {
            System.out.println("Alumno " + (i + 1) + ":");
            System.out.print("Nombre:");
            String nombre = input.next();
            
            
            System.out.print("Nota primer parcial: ");
            double nota1 = input.nextDouble();  
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


