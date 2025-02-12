package explicarobject;

public class Gestionapersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Persona p = new Persona ("pepe","perez",30,30000.00 ,"pepe@gmail.com");
		Persona p2 = new Entrenador ("juan","perez",30,30000.00 ,"pepe@gmail.com");
		Entrenador e = new Entrenador ("juan","perez",30,30000.00 ,"pepe@gmail.com");

		System.out.println(p.toString());
		System.out.println(p2.toString());
		System.out.println(e.toString());
		e.concentrarse();
		p2.concentrarse();
		p.concentrarse();
		
		e.viajar(null);
		p2.viajar(null);
		p.viajar(null);
		
		e.dirigirpartido();
		Entrenador p2toentrenador = (Entrenador)p2;
		p2toentrenador.dirigirpartido();
		
		
		System.out.println(p.equals(p2));
		
		
		System.out.println(p.getClass().getName());
		System.out.println(p instanceof Persona);
	}

}
