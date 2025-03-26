package Explicacionlsiats;

import java.util.ArrayList;
import java.util.List;

import Modeloejercicio1examen25_3.GuzmanitosException;

public class Gestionmiembroslistas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List < Miembro > lista1 = new ArrayList <Miembro> ();
		List < Miembro > lista2 = new ArrayList <Miembro> ();		
		Miembro m1 = new Miembro(0, "juan@gmail", null, 0, lista1);
		Miembro m2 = new Miembro(0, "pepe@gmail", null, 0, lista2);
		
		try {
			m1.addamigos(m2);
			m1.addamigos(m2);
		} catch (GuzmanitosException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		for(Miembro m : m1.getAmigos())
		System.out.println( m);
		System.out.println( m1.Isamigo(m2));
	}

}
