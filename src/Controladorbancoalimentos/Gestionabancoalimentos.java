package Controladorbancoalimentos;


import java.time.LocalDate;
import java.util.ArrayList;

import Modelobancoalimentos.*;
import Repositoriobancoalimentos.*;

public class Gestionabancoalimentos {

    public static void main(String[] args) throws BancoException {
    	 
             Bancoalimentos banco = new Bancoalimentos(new ArrayList<>());

             Centrolo c1 = new Centrolo(1, "Centro A", "Madrid", 5, new ArrayList<>());
             Centrolo c2 = new Centrolo(1, "Centro B", "Sevilla", 3, new ArrayList<>());

             banco.agregarcentro(c1);
             System.out.println(banco);
             banco.agregarcentro(c2);

        
     }
 }
    
    

        
