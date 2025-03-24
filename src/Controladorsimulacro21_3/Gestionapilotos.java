package Controladorsimulacro21_3;

import java.time.LocalDate;

import Modelosimulacro21_3.*;

public class Gestionapilotos {

	public static void main(String[] args) throws Vueloexception {
		// TODO Auto-generated method stub

		Vuelo v1 = new Vuelo(1, "IBERIA", "Cancun", LocalDate.now(), 6, Estadovuelo.ENCURSO);
		
		Piloto c1 = new Comercial("Juan", "Española", 56, 333, 10);
		
		
		
	try {
		c1.agregarvuelo(v1);
	} catch (Vueloexception e) {
		// TODO Auto-generated catch block
		System.out.println((e.getMessage()));
		throw e;
	}
	System.out.println(c1.toString());
	
	}


}
