package explicacionmapa;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Gestionaagendaconmapa {
	public static void main(String[] args) {
	Contacto c1 = new Contacto("666777888", "juan", "Perez");
	Contacto c2 = new Contacto("666777555", "pepe", "Perez");
	Contacto c3 = new Contacto("666555777", "manolo", "Perez");

	Agenda a = new Agenda();
	a.getAgenda().put("666777888", c1);
	a.getAgenda().put("666777555", c2);
	a.getAgenda().put("666555777", c1);
	
	a.getAgenda().put("666555777", c1);

	System.out.println(a.getAgenda().size());
	
	System.out.println(a.getAgenda().toString());
	
	System.out.println(a.getAgenda().get("666555777"));
	
	System.out.println(a.getAgenda().keySet());
		
	System.out.println(a.getAgenda().values());
	
	
	Set<Map.Entry <String,Contacto>> entradas = a.getAgenda().entrySet(); 
	Entry <String, Contacto> elemento;
	Iterator it = entradas.iterator();
	while(it.hasNext()) {
		elemento = (Entry<String, Contacto>) it.next();
		elemento.getKey();
		elemento.getValue();
	}
	
	
	
}
	
}
