package Controladorsimulacro20_3;
import java.time.LocalDate;
import java.util.Arrays;

import Modelosimulacro20_3.*;
public class GestionaDeportistas {
	public static void main(String[] args) throws CompeticionException {
	
	Prueba p1 = new Prueba(1, "ABC", LocalDate.of(2025, 8, 3), Estadoprueba.PLANIFICADA);
	Prueba p2 = new Prueba(2, "AHD", LocalDate.of(2024, 8, 3), Estadoprueba.ENCURSO);
	Prueba p3 = new Prueba(3, "GFD", LocalDate.of(2023, 8, 3), Estadoprueba.CERRADA);
	


	Deportista n1 = new Nadador("Paquito", "España", 25, 70.0, 1.80);
	

	n1.añadirprueba(p1);
	n1.añadirprueba(p2);
	n1.añadirprueba(p3);
	
    try {
        Prueba p4 = new Prueba(4, "XYZ", LocalDate.of(2024, 8, 3), Estadoprueba.PLANIFICADA);
        n1.añadirprueba(p4);  
        
      
    } catch (CompeticionException e) {
        System.out.println( e.getMessage());
   
    }
    /*for (Prueba prueba : n1.getPruebas()) {
        if (prueba != null) {
            System.out.println(prueba); 
        }
    }*/
    System.out.println(n1.proximaprueba());

    System.out.println(n1);
}


}