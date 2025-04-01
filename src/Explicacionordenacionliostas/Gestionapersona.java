package Explicacionordenacionliostas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import Boletinlistasejercicio2.DeportivosException;

public class Gestionapersona {
	public static void main(String[] args) throws DeportivosException {
	Persona alumno1 = new Persona("paquito", "12345678A");
	Persona alumno2 = new Persona("Manue", "23456789B");
	Persona alumno3 = new Persona("Perro Sanchez", "34567890C");
	Persona alumno4 = new Persona("Cabesa", "45678901D");
	
	List <Persona> lista = new ArrayList<Persona>();
	lista.add(alumno1);
	lista.add(alumno2);
	lista.add(alumno3);
	lista.add(alumno4); 

     Collections.sort(lista);

}
	
}
