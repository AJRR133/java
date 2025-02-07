package cadenas;

import java.util.Scanner;

public class fichaprueba {
    public static void main(String[] args) {
    	fichaprueba r = new fichaprueba();
        String[] palabras = r.cargatabla();
        
        System.out.println("Palabras originales:");
        r.imprimeTabla(palabras);

        String[] palabrasConvertidas = r.convierteTabla(palabras);
        System.out.println("Palabras convertidas:");
        r.imprimeTabla(palabrasConvertidas);

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
            if (elemento != null) {
                System.out.println(elemento);
            }
        }
    }

    String[] convierteTabla(String[] palabras) {
        String[] convertidas = new String[palabras.length];
        for (int i = 0; i < palabras.length; i++) {
            convertidas[i] = realizaConversion(palabras[i]);
        }
        return convertidas;
    }

    String realizaConversion(String palabra) {
        if (palabra == null || palabra.isEmpty()) {
            return palabra; 
        }

        StringBuilder palabraConvertida = new StringBuilder();


        char primerCaracter = Character.toUpperCase(palabra.charAt(0));
        palabraConvertida.append(primerCaracter);


        for (int i = 1; i < palabra.length() - 1; i++) {
            char caracter = palabra.charAt(i);
           
            if (caracter == '1') {
                palabraConvertida.append('0');
            } else {
                palabraConvertida.append(caracter);
            }
        }

       
        if (palabra.length() > 1) {
            palabraConvertida.append(palabra.length());
        }

        return palabraConvertida.toString();
    }
}