package ControladorTiendaanimales;

import java.util.Arrays;

import Modelotiendaanimales.*;

public class Gestionatiendaanimale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador = 0;
		Gato g1 = new Gato(null, null, 1, null, null, null);
		
		Mascota [] mascotas = new Mascota [10];
		mascotas[contador] = g1;
		contador = contador+1;
		System.out.println(Arrays.toString(mascotas));
	}

}
