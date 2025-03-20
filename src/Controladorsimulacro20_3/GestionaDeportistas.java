package Controladorsimulacro20_3;
import java.time.LocalDate;
import java.util.Arrays;

import Modelosimulacro20_3.*;
public class GestionaDeportistas {
	public static void main(String[] args) {
	int contador = 0;
	Prueba[] pruebasnadador = new Prueba[3];
	
	Prueba p1 = new Prueba(1, "ABC", LocalDate.of(2025, 8, 3), Estadoprueba.PLANIFICADA);
	Prueba p2 = new Prueba(2, "AHD", LocalDate.of(2024, 8, 3), Estadoprueba.ENCURSO);
	Prueba p3 = new Prueba(3, "GFD", LocalDate.of(2023, 8, 3), Estadoprueba.CERRADA);
	
	pruebasnadador[contador] = p1;
	contador = contador+1;
	pruebasnadador[contador] = p2;
	contador = contador+1;
	pruebasnadador[contador] = p3;
	
	contador = contador+1;
	System.out.println(Arrays.toString(pruebasnadador));
	Deportista n1 = new Nadador("Paquito", "España", 25, 70.0, 1.80, pruebasnadador);
	
	System.out.println(n1);
	System.out.println(n1);
	
    try {
        Prueba nuevaPrueba = new Prueba(4, "XYZ", LocalDate.of(2024, 8, 3), Estadoprueba.PLANIFICADA);
        n1.añadirprueba(nuevaPrueba);  
        
        System.out.println("Pruebas después de añadir una nueva prueba:");
        for (Prueba prueba : pruebasnadador) {
            if (prueba != null) {
                System.out.println(prueba); 
            }
        }
    } catch (CompeticionException e) {
        System.out.println("Error al añadir la prueba: " + e.getMessage());
    }
}


}