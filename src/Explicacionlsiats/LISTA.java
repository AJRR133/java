package Explicacionlsiats;

import java.util.ArrayList;
import java.util.List;

public class LISTA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List < String > lista = new ArrayList <String> ();
		lista.add("Pedro");
		lista.add("David");
		lista.add("Miguel");
		lista.add("Antonio");
		lista.add("Pedro");
		
		lista.remove("David");
		lista.remove("David3");
		lista.remove(1);
		
		System.out.println(lista);
		
		System.out.println(lista.size());
			
		for (String cadena: lista)
		{
			System.out.println(cadena);
		}

	}

}
