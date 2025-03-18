package Excepciones;

public class GestionaMisexcepciones {

	public static void main(String[] args) throws Adrianexception {
		try {
			throw new Adrianexception("Lanzando");

		} catch(Adrianexception e ){
			System.out.println(e.getMessage());
			throw e;
		}
		}

}
