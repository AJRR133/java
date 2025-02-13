package Boletin5ejercicio1;

public class Gestionajuego {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Caballero caballero1 = new Caballero ("saturnino",70 ,100);
		Mago mago1 =  new Mago("juan",10,50);
		Villano villano1 =  new Villano("Pakito",10,50);
		Arquero arquero1 =  new Arquero("Pepe",90,500);
		
		System.out.println(caballero1.getArma());
		System.out.println(mago1.getArma());
		System.out.println(villano1.getArma());
		System.out.println(arquero1.getArma());
		
		System.out.println(caballero1.esatacado(arquero1, 80));
		System.out.println(caballero1.esatacado(arquero1));
		System.out.println(caballero1.esatacado(mago1));
		System.out.println(arquero1.esatacado(caballero1, 30));
		System.out.println(arquero1.esatacado(caballero1));
		System.out.println(arquero1.esatacado(mago1));
		
	}

}
