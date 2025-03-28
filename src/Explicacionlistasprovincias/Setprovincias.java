package Explicacionlistasprovincias;

import java.util.HashSet;
import java.util.Set;

public class Setprovincias {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Provincia cadiz = new Provincia("Cadiz", 2000000);
		Provincia sevilla = new Provincia("sevilla", 4000000);
		Provincia cadiz1 = new Provincia("Cadiz", 2000000);
	
	Set<Provincia> pro = new HashSet<Provincia>();
	
	System.out.println(pro.add(cadiz));
	System.out.println(pro.add(sevilla));
	System.out.println(pro.add(cadiz1));
	
	for (Provincia cadena: pro)
	{
		System.out.println(cadena);
	}
}
}