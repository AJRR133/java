package ControladorBiblioteca;

import ModeloBiblioteca.*;

public class Gestionabiblioteca {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Libros l1 = new Libros(1, "biblioteca", "Paquito", "Planeta", "Mas");
	Peliculas p1 = new Peliculas(2, "biblioteca", "terminator", "accion",100);
	Audio a1 = new Audio(3, "Spoty", "El patio", "f",4);
	Juegos j1 = new Juegos(4, "", "", "", 4);

	System.out.println(l1);
	System.out.println(p1);
	System.out.println(j1);
	System.out.println(a1);
	
	}
}
