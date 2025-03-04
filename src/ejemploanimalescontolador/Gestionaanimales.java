package ejemploanimalescontolador;

import ejemploanimalesmodelo.*;

public class Gestionaanimales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal perro1 = new Perro();
		Animal gato1 = new Gato();
		System.out.println(perro1.getAlimento());
		System.out.println(perro1.getSonidoqueemite());
		System.out.println(gato1.getAlimento());
		System.out.println(gato1.getSonidoqueemite());
		
		Animal pez1 = new Pez();
		System.out.println(pez1.getAlimento());
		System.out.println(pez1.getSonidoqueemite());

		// no se puede crear un objeto de una clase abstracta
		//Animal a = new Animal();
	}

}
