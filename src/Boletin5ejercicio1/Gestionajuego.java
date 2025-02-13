package Boletin5ejercicio1;

public class Gestionajuego {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Mago mago1 =  new Mago("juan",10,50);
		System.out.println(mago1);
		System.out.println(mago1.esatacado(mago1));
		Villano villano1 =  new Villano("Pakito",10,50);
		System.out.println(villano1);
	}

}
