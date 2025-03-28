package Explicacionlistasprovincias;

import java.util.LinkedList;
import java.util.List;

public class Gestionaprovinvias {

	public static void main(String[] args) throws Provinciaexcepciones {
		// TODO Auto-generated method stub
		Gestionaprovinvias r = new Gestionaprovinvias();
		Provincia cadiz = new Provincia("Cadiz", 2000000);
		Provincia sevilla = new Provincia("sevilla", 4000000);
		Provincia cadiz1 = new Provincia("Cadiz", 2000000);
		
		
		System.out.println(r.addprovincia(cadiz));
		System.out.println(r.addprovincia(sevilla));
		//System.out.println(r.setsinrepetedos(1, cadiz1));
	System.out.println(r.provincias.toString());
		for (Provincia cadena: r.provincias)
		{
			System.out.println(cadena.toString());
		}
	}
	
		
		
		
		
	private List <Provincia> provincias = new LinkedList <>();	
		
	public boolean addprovincia(Provincia p) throws Provinciaexcepciones {
	boolean agregado = false;
	if(provincias.contains(p)) {
		throw new Provinciaexcepciones("Provincia repetida");
	} else {
		agregado = provincias.add(p);
	} 
	return agregado;
	}
	
	public Provincia setsinrepetedos(int posicion, Provincia p) throws Provinciaexcepciones {
		Provincia actual = provincias.get(posicion);
		
		if (provincias.contains(p)) {
			throw new  Provinciaexcepciones("Provincia repetida");
		} else {
			actual = provincias.set(posicion, p);
		}
		return actual;
	}

	@Override
	public String toString() {
		return "Gestionaprovinvias [provincias=" + provincias + "]";
	}
	
	
}
