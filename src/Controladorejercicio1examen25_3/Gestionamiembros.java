package Controladorejercicio1examen25_3;

import java.util.Arrays;

import Modeloejercicio1examen25_3.*;
public class Gestionamiembros {

	
	public static void main(String[] args) throws GuzmanitosException {
		// TODO Auto-generated method stub

		
		MiembroBase [] am = new MiembroBase [2];
		
		MiembroBase e1 = new Miembroestandar("paquito@gmail", "paquito", 1,null);
		MiembroBase e2 = new Miembroestandar("pepe@gmail", "pepe", 2, null);
		MiembroBase p1 = new Miembropremium("juan@gmail", "juan", 2, null, Tipopremium.PREMIUM);
		MiembroBase p2 = new Miembropremium("manolo@gmail", "manolo", 1, null, Tipopremium.PREMIUM_VIP);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(p1);
		System.out.println(p2);
		
		try {
		e1.addamigos(e2);
		e1.addamigos(p1);
		/*e1.addamigos(p2);*/
		/*e1.addamigos(p2);*/
		} catch(GuzmanitosException e){
			System.out.println(e.getMessage());
			throw e;
		}
		System.out.println(Arrays.toString(e1.getAmigos()));
		try {
			p1.addamigos(e2);
			p1.addamigos(p2);
			} catch(GuzmanitosException e){
				System.out.println(e.getMessage());
			}
		System.out.println(Arrays.toString(p1.getAmigos()));
		
		System.out.println(p1.Isamigo(p2));
		System.out.println(p1.Isamigo(e2));
		
	

	try {
		p1.addamigos(e2);
		p1.addamigos(e2);
		} catch(GuzmanitosException e){
			System.out.println(e.getMessage());
			throw e;
		}
	
	
	
	
	
}}

