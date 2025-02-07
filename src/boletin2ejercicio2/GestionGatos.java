package boletin2ejercicio2;

public class GestionGatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		Gato gato1 = new Gato();
		
		gato1.sexo = "macho";
		gato1.maulla();
		gato1.comida("pienso");
		
		System.out.println(gato1.pasacadena());
		System.out.println(gato1.toString());
		System.out.println(gato1);
		
		
		Gato gata2 = new Gato();
		gata2.sexo = "hembra";
		gata2.ronronea();
		gata2.comida("pescado");

		Gato gata3 = new Gato();
		gata3.sexo = "hembra";

		gato1.luchar(gata2);
		gata3.luchar(gata2);

	}

}
