package ControladorCadenalimenticia;

import Modelocadenaalimenticia.*;
public class Gestionacadenaalimen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal[] atacaLeon = {new Leon()};
		Animal[] atacaRoedor = {new Roedor(), new Averapaz()};
		Animal s1 = new Serpiente("Cobra", Familia.serpiente, " " , atacaRoedor,atacaLeon) ;
		Animal a1 = new Averapaz("Aguila real", Familia.rapaz, null, , );
		Animal c1 = new Roedor("conejo", Familia.roedor, null, , );
		Animal l1 = new Leon("leon", Familia.león, null, , );
	}
	
	
}
