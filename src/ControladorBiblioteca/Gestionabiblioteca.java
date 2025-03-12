package ControladorBiblioteca;

import ModeloBiblioteca.*;

public class Gestionabiblioteca {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Libro l1 = new Libro(1, "biblioteca", "Paquito", "Planeta", "Mas");
	Pelicula p1 = new Pelicula(2, "biblioteca", "terminator", "accion",100);
	Audio a1 = new Audio(3, "Spoty", "El patio", "f",4);
	Juego j1 = new Juego(4, "", "", "", 4);

	System.out.println(l1);
	System.out.println(p1);
	System.out.println(j1);
	System.out.println(a1);
	
	}
}
